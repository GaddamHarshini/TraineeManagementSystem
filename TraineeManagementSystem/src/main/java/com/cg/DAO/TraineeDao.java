package com.cg.DAO;

import java.util.ArrayList;

import com.cg.DTO.Trainee;

public interface TraineeDao {

	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	ArrayList<Trainee> getAll();

	
}
