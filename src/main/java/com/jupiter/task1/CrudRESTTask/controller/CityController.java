package com.jupiter.task1.CrudRESTTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.task1.CrudRESTTask.model.CityMaster;
import com.jupiter.task1.CrudRESTTask.model.OfficeMaster;
import com.jupiter.task1.CrudRESTTask.repository.CityRepo;
import com.jupiter.task1.CrudRESTTask.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityservice;
	
	@GetMapping("city/getAll")
	public List<CityMaster> getAll() {
		return cityservice.getAllCity();
	}
	
	@PostMapping("city/add")
	private int add(@RequestBody CityMaster city)
	{
		cityservice.save(city);
		return (int) city.getId();
	}
	
	@GetMapping("city/getByCityId/{cityid}")  
	private CityMaster getcitybyid(@PathVariable("cityid") int cityid)   
	{  
	return cityservice.getByid(cityid); 
	}  
	
	@DeleteMapping("/city/delete/{cityid}")  
	private void deleteOffice(@PathVariable("cityid") int cityid)   
	{  
	cityservice.CityDeleteByid(cityid);  
	}  
	
	
}
