package com.jupiter.task1.CrudRESTTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.task1.CrudRESTTask.model.Floormaster;
import com.jupiter.task1.CrudRESTTask.repository.CityRepo;
import com.jupiter.task1.CrudRESTTask.repository.FloorRepo;

@Service
public class Floorservice {

	@Autowired
	FloorRepo floorrepo;
	
	public List<Floormaster> getAllCity(){
		List<Floormaster> floorlsit=new ArrayList<Floormaster>();
		floorrepo.findAll().forEach(floor1->floorlsit.add(floor1));
		return floorlsit;
	}
	
	
	public void save(Floormaster floor) {
		floorrepo.save(floor);
	}
	
	public Floormaster getByid(int id) {
		return floorrepo.findById((long)id).get();
	}
	
	public void FloorDeleteByid(int id) {
		floorrepo.deleteById((long) id);
	}
}
