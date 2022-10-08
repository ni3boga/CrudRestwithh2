package com.jupiter.task1.CrudRESTTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.task1.CrudRESTTask.model.Floormaster;
import com.jupiter.task1.CrudRESTTask.service.Floorservice;

@RestController
public class Floorcontroller {
	@Autowired
	private Floorservice floorservice;
	
	@GetMapping("floor/getAll")
	public List<Floormaster> getAll(){
		return floorservice.getAllCity();
		
	}
	
	
	@PostMapping("floor/add")
	public int add(@RequestBody Floormaster floor) {
		floorservice.save(floor);
		return floor.getFloorid();
	}
	
	
	@GetMapping("floor/getById/{floorid}")
	private Floormaster getByid(@PathVariable("floorid") int floorid){
		return floorservice.getByid(floorid);	
	}
	
	@DeleteMapping("floor/delete/{floorid}")
	private void deleteFloor(@PathVariable("floorid") int floorid) {
		
	floorservice.FloorDeleteByid(floorid);
	}
}
