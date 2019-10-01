package com.example.biqQuewyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;

@SpringBootApplication
public class BiqQuewyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiqQuewyDemoApplication.class, args);
		
		
		BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
		bigquery.getDataset("tesT");
	}

}
