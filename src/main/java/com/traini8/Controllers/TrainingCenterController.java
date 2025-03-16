package com.traini8.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.entitites.TrainingCenter;
import com.traini8.services.TrainigCenterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/center")
public class TrainingCenterController {
	
	@Autowired
	private TrainigCenterService trainigCenterService;
	
	@PostMapping("/create")
	public ResponseEntity<TrainingCenter>createCenter(@Valid @RequestBody TrainingCenter trainingCenter)
	{
		TrainingCenter createdCenter = trainigCenterService.createTrainingCenter(trainingCenter);
		return ResponseEntity.ok(createdCenter);
	}
	
	@GetMapping
	public ResponseEntity<List<TrainingCenter>>getTrainingCenters()
	{
		List<TrainingCenter> allCenters = trainigCenterService.getAllCenters();
		return ResponseEntity.ok(allCenters);
	}

}
