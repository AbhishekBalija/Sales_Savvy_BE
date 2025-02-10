package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@RequestMapping("/api/payment")
public class PaymentController {
	
	@RequestMapping("/doPayments")
	public String payment() {
		return "Payment Succes";
	}

}