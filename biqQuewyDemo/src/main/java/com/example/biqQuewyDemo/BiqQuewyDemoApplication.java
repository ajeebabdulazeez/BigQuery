package com.example.biqQuewyDemo;

import static com.example.biqQuewyDemo.BookingAttributes.abk_id;
import static com.example.biqQuewyDemo.BookingAttributes.appointment_date;
import static com.example.biqQuewyDemo.BookingAttributes.appointment_id;
import static com.example.biqQuewyDemo.BookingAttributes.appt_end_time;
import static com.example.biqQuewyDemo.BookingAttributes.appt_start_time;
import static com.example.biqQuewyDemo.BookingAttributes.apt_stat_id;
import static com.example.biqQuewyDemo.BookingAttributes.apt_stg_id;
import static com.example.biqQuewyDemo.BookingAttributes.apt_type_id;
import static com.example.biqQuewyDemo.BookingAttributes.associateid;
import static com.example.biqQuewyDemo.BookingAttributes.bq_created_ts;
import static com.example.biqQuewyDemo.BookingAttributes.createdby;
import static com.example.biqQuewyDemo.BookingAttributes.createdts;
import static com.example.biqQuewyDemo.BookingAttributes.store;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryError;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.InsertAllRequest;
import com.google.cloud.bigquery.InsertAllResponse;
import com.google.cloud.bigquery.TableId;


@SpringBootApplication
public class BiqQuewyDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BiqQuewyDemoApplication.class, args);


		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

		try
		{
			AppointmentBookingModel model = new AppointmentBookingModel(100, new Date("03-Oct-2019"), "BAA900109",
					new Time(formatter.parse("12:30").getTime()), new Time(formatter.parse("11:30").getTime()), "AXA6WS9", "AXA6WS9",
					"ASSOCIATE", new Timestamp(System.currentTimeMillis()), "7001", new Timestamp(System.currentTimeMillis()), 1, 2,
					3);


			BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
			System.out.println(bigquery.getDataset("schedulingDemo"));
			TableId tableId = TableId.of("schedulingDemo", "appointment_booking");
			System.out.println(tableId + " " + tableId.getProject());

			Map<String, Object> rowContent = new HashMap<>();
			rowContent.put(appointment_id.toString(), model.getAppointmentId());
			rowContent.put(abk_id.toString(), model.getAbkId());
			rowContent.put(store.toString(), model.getStore());
			rowContent.put(associateid.toString(), model.getAssociateid());
			rowContent.put(appointment_date.toString(), model.getAppointmentDate());
			rowContent.put(apt_type_id.toString(), model.getTypeId());
			rowContent.put(appt_start_time.toString(), model.getApptStartTime());
			rowContent.put(appt_end_time.toString(), model.getApptEndTime());
			rowContent.put(apt_stg_id.toString(), model.getStageId());
			rowContent.put(apt_stat_id.toString(), model.getStatusId());
			rowContent.put(createdby.toString(), model.getCreatedby());
			rowContent.put(createdts.toString(), model.getCreatedts());
			rowContent.put(bq_created_ts.toString(), model.getBq_created_ts());

			InsertAllResponse response = bigquery.insertAll(InsertAllRequest.newBuilder(tableId).addRow(rowContent)
					// More rows can be added in the same RPC by invoking .addRow() on the builder.
					// You can also supply optional unique row keys to support de-duplication scenarios.
					.build());

			System.out.println("REPONSE " + response);
			if (response.hasErrors())
			{
				// If any of the insertions failed, this lets you inspect the errors
				for (Entry<Long, List<BigQueryError>> entry : response.getInsertErrors().entrySet())
				{
					System.out.println("error " + entry.getValue());
				}
			}

		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}





	}

}
