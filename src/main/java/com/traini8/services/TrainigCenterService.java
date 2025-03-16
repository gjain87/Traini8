package com.traini8.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traini8.entitites.TrainingCenter;
import com.traini8.repositories.TrainingCenterRepo;

import jakarta.validation.ValidationException;

@Service
public class TrainigCenterService {
	
	@Autowired
	private TrainingCenterRepo trainingCenterRepo;
	
	public TrainingCenter createTrainingCenter(TrainingCenter center)
	{
		try {
			center.setCreatedOn(LocalDateTime.now());
			TrainingCenter savedCenter = trainingCenterRepo.save(center);
			return savedCenter;
		} catch (Exception e) {
			throw new ValidationException("Sorry, Training Center cannot be created, please meet the requirement criterion...");
		}
		
	}
	
	public List<TrainingCenter>getAllCenters()
	{
		List<TrainingCenter> trainingCenters = trainingCenterRepo.findAll();
		return trainingCenters;
	}

}
