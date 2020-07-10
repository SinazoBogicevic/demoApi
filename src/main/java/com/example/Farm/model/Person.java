package com.example.Farm.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	private final UUID id;
	
	@NotBlank
	private final String firstName;
	
	@NotBlank
	private final String lastName;
	

	
	public Person(@JsonProperty("id") UUID id, @JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UUID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}
