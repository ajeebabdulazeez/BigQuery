package com.example.biqQuewyDemo;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class AppointmentBookingModel implements Serializable
{


	public AppointmentBookingModel(long abkId, Date appointmentDate, String appointmentId, Time apptEndTime, Time apptStartTime,
			String associateid, String bookedby, String createdby, Timestamp createdts, String store, Timestamp bq_created_ts,
			int stageId, int typeId, int statusId)
	{
		super();
		this.abkId = abkId;
		this.appointmentDate = appointmentDate;
		this.appointmentId = appointmentId;
		this.apptEndTime = apptEndTime;
		this.apptStartTime = apptStartTime;
		this.associateid = associateid;
		this.bookedby = bookedby;
		this.createdby = createdby;
		this.createdts = createdts;
		this.store = store;
		this.bq_created_ts = bq_created_ts;
		this.stageId = stageId;
		this.typeId = typeId;
		this.statusId = statusId;
	}

	/**
	 * @return the abkId
	 */
	public long getAbkId()
	{
		return abkId;
	}

	/**
	 * @param abkId
	 *           the abkId to set
	 */
	public void setAbkId(long abkId)
	{
		this.abkId = abkId;
	}

	/**
	 * @return the appointmentAsscNotes
	 */
	public String getAppointmentAsscNotes()
	{
		return appointmentAsscNotes;
	}

	/**
	 * @param appointmentAsscNotes
	 *           the appointmentAsscNotes to set
	 */
	public void setAppointmentAsscNotes(String appointmentAsscNotes)
	{
		this.appointmentAsscNotes = appointmentAsscNotes;
	}

	/**
	 * @return the appointmentCustNotes
	 */
	public String getAppointmentCustNotes()
	{
		return appointmentCustNotes;
	}

	/**
	 * @param appointmentCustNotes
	 *           the appointmentCustNotes to set
	 */
	public void setAppointmentCustNotes(String appointmentCustNotes)
	{
		this.appointmentCustNotes = appointmentCustNotes;
	}

	/**
	 * @return the appointmentDate
	 */
	public Date getAppointmentDate()
	{
		return appointmentDate;
	}

	/**
	 * @param appointmentDate
	 *           the appointmentDate to set
	 */
	public void setAppointmentDate(Date appointmentDate)
	{
		this.appointmentDate = appointmentDate;
	}

	/**
	 * @return the appointmentId
	 */
	public String getAppointmentId()
	{
		return appointmentId;
	}

	/**
	 * @param appointmentId
	 *           the appointmentId to set
	 */
	public void setAppointmentId(String appointmentId)
	{
		this.appointmentId = appointmentId;
	}

	/**
	 * @return the appointmentImages
	 */
	public String getAppointmentImages()
	{
		return appointmentImages;
	}

	/**
	 * @param appointmentImages
	 *           the appointmentImages to set
	 */
	public void setAppointmentImages(String appointmentImages)
	{
		this.appointmentImages = appointmentImages;
	}

	/**
	 * @return the appointmentPrevId
	 */
	public String getAppointmentPrevId()
	{
		return appointmentPrevId;
	}

	/**
	 * @param appointmentPrevId
	 *           the appointmentPrevId to set
	 */
	public void setAppointmentPrevId(String appointmentPrevId)
	{
		this.appointmentPrevId = appointmentPrevId;
	}

	/**
	 * @return the apptEndTime
	 */
	public Time getApptEndTime()
	{
		return apptEndTime;
	}

	/**
	 * @param apptEndTime
	 *           the apptEndTime to set
	 */
	public void setApptEndTime(Time apptEndTime)
	{
		this.apptEndTime = apptEndTime;
	}

	/**
	 * @return the apptStartTime
	 */
	public Time getApptStartTime()
	{
		return apptStartTime;
	}

	/**
	 * @param apptStartTime
	 *           the apptStartTime to set
	 */
	public void setApptStartTime(Time apptStartTime)
	{
		this.apptStartTime = apptStartTime;
	}

	/**
	 * @return the associateid
	 */
	public String getAssociateid()
	{
		return associateid;
	}

	/**
	 * @param associateid
	 *           the associateid to set
	 */
	public void setAssociateid(String associateid)
	{
		this.associateid = associateid;
	}

	/**
	 * @return the bookedby
	 */
	public String getBookedby()
	{
		return bookedby;
	}

	/**
	 * @param bookedby
	 *           the bookedby to set
	 */
	public void setBookedby(String bookedby)
	{
		this.bookedby = bookedby;
	}

	/**
	 * @return the createdby
	 */
	public String getCreatedby()
	{
		return createdby;
	}

	/**
	 * @param createdby
	 *           the createdby to set
	 */
	public void setCreatedby(String createdby)
	{
		this.createdby = createdby;
	}

	/**
	 * @return the createdts
	 */
	public Timestamp getCreatedts()
	{
		return createdts;
	}

	/**
	 * @param createdts
	 *           the createdts to set
	 */
	public void setCreatedts(Timestamp createdts)
	{
		this.createdts = createdts;
	}

	/**
	 * @return the store
	 */
	public String getStore()
	{
		return store;
	}

	/**
	 * @param store
	 *           the store to set
	 */
	public void setStore(String store)
	{
		this.store = store;
	}

	/**
	 * @return the bq_created_ts
	 */
	public Timestamp getBq_created_ts()
	{
		return bq_created_ts;
	}

	/**
	 * @param bq_created_ts
	 *           the bq_created_ts to set
	 */
	public void setBq_created_ts(Timestamp bq_created_ts)
	{
		this.bq_created_ts = bq_created_ts;
	}

	/**
	 * @return the stageId
	 */
	public int getStageId()
	{
		return stageId;
	}

	/**
	 * @param stageId
	 *           the stageId to set
	 */
	public void setStageId(int stageId)
	{
		this.stageId = stageId;
	}

	/**
	 * @return the typeId
	 */
	public int getTypeId()
	{
		return typeId;
	}

	/**
	 * @param typeId
	 *           the typeId to set
	 */
	public void setTypeId(int typeId)
	{
		this.typeId = typeId;
	}

	/**
	 * @return the statusId
	 */
	public int getStatusId()
	{
		return statusId;
	}

	/**
	 * @param statusId
	 *           the statusId to set
	 */
	public void setStatusId(int statusId)
	{
		this.statusId = statusId;
	}

	private static final long serialVersionUID = 1L;

	private long abkId;

	private String appointmentAsscNotes;

	private String appointmentCustNotes;

	private Date appointmentDate;

	private String appointmentId;

	private String appointmentImages;

	private String appointmentPrevId;

	private Time apptEndTime;

	private Time apptStartTime;

	private String associateid;

	private String bookedby;

	private String createdby;

	private Timestamp createdts;

	private String store;

	private Timestamp bq_created_ts;

	private int stageId;

	private int typeId;

	private int statusId;
}
