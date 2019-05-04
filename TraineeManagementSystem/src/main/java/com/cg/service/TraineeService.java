package com.cg.service;

import java.util.ArrayList;

import com.cg.DTO.Trainee;


public interface TraineeService {

	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	ArrayList<Trainee> getAll();

}
