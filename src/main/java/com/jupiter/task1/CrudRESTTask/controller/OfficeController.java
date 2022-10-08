package com.jupiter.task1.CrudRESTTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jupiter.task1.CrudRESTTask.model.OfficeMaster;
import com.jupiter.task1.CrudRESTTask.repository.CityRepo;
import com.jupiter.task1.CrudRESTTask.repository.OfficeRepo;
import com.jupiter.task1.CrudRESTTask.service.OfficeMasterService;

@RestController
public class OfficeController {

	@Autowired
	OfficeMasterService officeservice;
	
	@GetMapping("office/getAll")
	private List<OfficeMaster> getAllOffice() {
		return officeservice.getAllOffice();
	}

	
	
	@PostMapping("office/addOffice")
	private int createOffice(@RequestBody OfficeMaster office)
	{
		officeservice.save(office);
		return (int) office.getCityid();
	}
	
	
	@GetMapping("office/getByOfficeId/{officeid}")  
	private OfficeMaster getofficebyidd(@PathVariable("officeid") int officeid)   
	{  
	return officeservice.getOfficeById(officeid);  
	}  
	
	
	@DeleteMapping("/office/delete/{officeid}")  
	private void deleteOffice(@PathVariable("officeid") int officeid)   
	{  
	officeservice.delete(officeid);  
	}  
	
}
