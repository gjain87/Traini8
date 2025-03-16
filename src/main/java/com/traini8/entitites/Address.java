package com.traini8.entitites;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Embeddable
public class Address {
	@NotBlank(message = "Give your detailed address")
	private String detailedAddress;
	
	@NotBlank(message = "City is required")
	private String city;
	
	@NotBlank(message = "pin code is required")
	@Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be a 6-digit number")
	private String pinCode;
	
	@NotBlank(message = "State is required")
	private String state;

}
