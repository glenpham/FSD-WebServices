package com.example.restservice.api;

import java.util.concurrent.atomic.AtomicLong;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/test")
	public String test(){
		return "Hello students";
	}

	@GetMapping("/person")
	public Person getPerson(@RequestParam(value = "firstname") String fname,
							@RequestParam(value = "lastname") String lname){
		return new Person("fname","lname");
	}

	@PostMapping("/person")
	public String Person(@RequestBody Person person){
		System.out.println(person);
		return "Person is created";
	}
}
