package com.scdfdemo.scdfdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@EnableDataFlowServer
@SpringBootApplication
public class ScdfdemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ScdfdemoApplication.class, args);
	}

}
