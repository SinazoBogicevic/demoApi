package com.example.Farm.model;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Farm {

	@NotBlank
	private final String farmName;
	
	@NotBlank
	private final String farmType;

	public Farm(@JsonProperty("farmName") String farmName, @JsonProperty("farmType") String farmType) {
		super();
		this.farmName = farmName;
		this.farmType = farmType;
	}

	public String getFarmName() {
		return farmName;
	}

	public String getFarmType() {
		return farmType;
	}
	
	
	
}
