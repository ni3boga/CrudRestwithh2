package com.jupiter.task1.CrudRESTTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.task1.CrudRESTTask.model.Seatmaster;
import com.jupiter.task1.CrudRESTTask.service.Seatservice;

@RestController
public class SeatController {
	@Autowired
	private Seatservice seatservice;
	
	@GetMapping("seat/getAll")
	public List<Seatmaster> getAll(){
		return seatservice.getAll();
	}
	
	@PostMapping("seat/add")
	public int add(@RequestBody Seatmaster seat) {
		seatservice.save(seat);
		return seat.getSeatid();
	}
	
	@GetMapping("seat/getById/{seatid}")
	private Seatmaster getbySeatid(@PathVariable("seatid") int seatid) {
		return seatservice.getByid(seatid);
	}
	
	@DeleteMapping("seat/delete/{seatid}")
	private void deletebyid(@PathVariable("seatid") int seatid)
	{
		seatservice.seatDeleteByid(seatid);
	}
	
}
