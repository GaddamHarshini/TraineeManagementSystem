package com.cg.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.DAO.TraineeDao;
import com.cg.DTO.Trainee;

@Component("traineeService")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao traineeDao;
	
	@Override
	public int addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		return traineeDao.modifyTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int id) {
		return traineeDao.deleteTrainee(id);
	}

	@Override
	public Trainee getById(int id) {
		return traineeDao.getById(id);
	}

	@Override
	public ArrayList<Trainee> getAll() {
		return traineeDao.getAll();
	}

}
