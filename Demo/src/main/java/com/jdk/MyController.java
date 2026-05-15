package com.jdk;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@PostMapping("/html")
	public String firstApi() {
		return "Hyper text markup language";
	}

	@GetMapping("/train")
	public String TrainApi() {
		return "Train Number= 1234,Train Name=Udyan Express";
	}

	@PostMapping("/train/status")
	public String satatusApi() {
		return "Train is going to Banglore";
	}

	@PutMapping("/java")
	public String javaApi() {
		return "Java is object oriented programming language ";
	}

	@PostMapping("/css")
	public String cssApi() {
		return "It gives style to html pages";
	}

	@PostMapping("/js")
	public String jsApi() {
		return "Java Script";
	}

	@GetMapping("/redBus")
	public String redBusApi() {
		return "Mh bus";
	}

	@PostMapping("/python")
	public String pythonApi() {
		return "Mh bus";
	}

	@GetMapping("/studentName")
	public String studentApi() {
		return "Student name =payal chavan";
	}

	@GetMapping("/mobile")
	public String mobileApi() {
		return "Mobile name =moto";
	}

	@DeleteMapping("/education")
	public String educationApi() {
		return "Education System of maharashtra";
	}
	@DeleteMapping("/jdk")
	public String KiranAcdeApi() {
		return "Welcome to java by kiran";
	}


}
