package com.example.Farm.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	private final UUID accountId;
	
	@NotBlank
	private final String accountType;
	
	@NotBlank
	private final String farm;
	
	public Account(@JsonProperty UUID accountId,  @JsonProperty("accountType") String accountType, @JsonProperty("farm") String farm) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.farm = farm;
	}

	public UUID getAccountId() {
		return accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getFarm() {
		return farm;
	}

}
