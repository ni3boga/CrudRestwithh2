package com.jupiter.task1.CrudRESTTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.task1.CrudRESTTask.model.CityMaster;
import com.jupiter.task1.CrudRESTTask.repository.CityRepo;

@Service
public class CityService {
	@Autowired
	CityRepo cityrepo;
	
	
	public List<CityMaster> getAllCity(){
		List<CityMaster> citymaster=new ArrayList<CityMaster>();
		
		cityrepo.findAll().forEach(city1->citymaster.add(city1));
		return citymaster;
	}
	
	public void save(CityMaster city) {
		cityrepo.save(city);
	}
	
	
	public CityMaster getByid(int id) {
		return cityrepo.findById((long) id).get();
	}
	
	
	public void CityDeleteByid(int id) {
		cityrepo.deleteById((long) id);
	}
	
}
