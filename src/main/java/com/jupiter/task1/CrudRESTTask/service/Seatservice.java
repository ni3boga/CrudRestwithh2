package com.jupiter.task1.CrudRESTTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.task1.CrudRESTTask.model.Floormaster;
import com.jupiter.task1.CrudRESTTask.model.Seatmaster;
import com.jupiter.task1.CrudRESTTask.repository.seatmasterrepo;

@Service
public class Seatservice {
	@Autowired
	seatmasterrepo seatrepo;
	
	public List<Seatmaster> getAll(){
		List<Seatmaster> seatmaster=new ArrayList<Seatmaster>();
		seatrepo.findAll().forEach(seat1->seatmaster.add(seat1));
		return seatmaster;
	}
	
	public void save(Seatmaster s) {
		seatrepo.save(s);
	}
	public Seatmaster getByid(int id) {
		return seatrepo.findById((long)id).get();
	}
	public void seatDeleteByid(int id) {
		seatrepo.deleteById((long)id);
	}
	
}
