package com.traini8.entitites;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TrainingCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CenterName")
	@NotBlank(message = "CenterName is required")
	@Size(max = 40, message = "CenterName must be less than 40 characters.")
	private String centerName;
	
	@Column(name = "CenterCode")
	@NotBlank(message = "CenterCode is required")
	@Size(max = 12,min=12, message = "CenterCode must be exactly 12 characters.")
	private String centerCode;
	
	@Embedded
	@NotNull
	private Address address;
	
	private int studentCapacity;
	
	private List<String>coursesOffered;
	
	private LocalDateTime createdOn;
	
	@Email(message = "please enter correct Email")
	private String email;
	
	@NotBlank(message = "Please Enter Contact Phone number")
	@Pattern(regexp = "^[0-9]{10}$", message = "Contact Phone must be a 10-digit number")
	private String contactPhone;

}
