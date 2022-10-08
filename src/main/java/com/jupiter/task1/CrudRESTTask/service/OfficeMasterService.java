package com.jupiter.task1.CrudRESTTask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.task1.CrudRESTTask.model.OfficeMaster;
import com.jupiter.task1.CrudRESTTask.repository.OfficeRepo;

@Service
public class OfficeMasterService {
	@Autowired
	private OfficeRepo officerepo;
	
	public List<OfficeMaster> getAllOffice(){
		List<OfficeMaster> officemaster=new ArrayList<OfficeMaster>();
		
		officerepo.findAll().forEach(office1->officemaster.add(office1));
		return officemaster;
	}
	
	
	public void save(OfficeMaster office) {
		officerepo.save(office);
	}
	
	public OfficeMaster getOfficeById(int id)   
	{  
	return officerepo.findById((long) id).get();  
	}  
	
	public void delete(int id)   
	{  
	officerepo.deleteById((long) id);  
	}

}
