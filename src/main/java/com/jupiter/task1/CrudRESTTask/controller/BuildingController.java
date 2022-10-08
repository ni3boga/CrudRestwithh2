package com.jupiter.task1.CrudRESTTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.task1.CrudRESTTask.model.BuildingMaster;
import com.jupiter.task1.CrudRESTTask.service.BuildingMasterService;
import com.jupiter.task1.CrudRESTTask.service.CityService;

@RestController
public class BuildingController {
	@Autowired
	private BuildingMasterService buildservice;
	
	@GetMapping("Building/getAll")
	public List<BuildingMaster> getAll() {
		return buildservice.getAllBuilding();
	}
	
	@PostMapping("Building/add")
	private int add(@RequestBody BuildingMaster building)
	{
		buildservice.save(building);
		return building.getBuildingid();
	}
	
	@GetMapping("Building/getByBuildingId/{building}")  
	private BuildingMaster getBuildingbyid(@PathVariable("building") int buildid)   
	{  
	return buildservice.getByidbuilding(buildid);
	}  
	
	@DeleteMapping("Building/delete/{buildid}")  
	private void deleteOffice(@PathVariable("buildid") int buildingid)   
	{  
	buildservice.buildingDeleteByid(buildingid); 
	}  
}

