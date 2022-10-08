package com.jupiter.task1.CrudRESTTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.task1.CrudRESTTask.model.BuildingMaster;
import com.jupiter.task1.CrudRESTTask.repository.BuildingMasterRepo;

@Service
public class BuildingMasterService {
	@Autowired
	BuildingMasterRepo buildingrepo;
	
	public List<BuildingMaster> getAllBuilding(){
	List<BuildingMaster> buildingmaster=new ArrayList<BuildingMaster>();
	buildingrepo.findAll().forEach(building1->buildingmaster.add(building1));
	return buildingmaster;
	}
	
	public void save(BuildingMaster build) {
		buildingrepo.save(build);
	}
	
	public BuildingMaster getByidbuilding(int id) {
		return buildingrepo.findById((long) id).get();
	}
	
	public void buildingDeleteByid(int id) {
		buildingrepo.deleteById((long) id);
	}

}



