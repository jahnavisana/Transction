package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.Acknowledgement;
import dto.Transctionrequest;
import service.paying;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionManagementApplication {
	@Autowired
	private paying service;


	@PostMapping("/paymoney")
	public Acknowledgement paymoney(@RequestBody Transctionrequest request){
		return service.paymoney(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagementApplication.class, args);
	}

}
