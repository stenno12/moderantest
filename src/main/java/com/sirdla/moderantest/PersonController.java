package com.sirdla.moderantest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	private final PersonRepository repository;

	PersonController(PersonRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/person")
	List<Person> search(@RequestParam(name = "search") String name) {
		return repository.findByNameContainsIgnoreCase(name);
	}

	@PostMapping("/person")
	Person newPerson(@RequestBody Person newEmployee) {
		return repository.save(newEmployee);
	}
}