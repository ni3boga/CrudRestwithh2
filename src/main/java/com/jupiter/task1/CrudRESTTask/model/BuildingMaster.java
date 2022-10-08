package com.jupiter.task1.CrudRESTTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Buildingmaster")
public class BuildingMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int buildingid;
	
	@Column(name = "isactive")
	boolean isactive;
	@Column(name="building_name")
	String buildingname;
	@Column(name="officeid")
	int officeid;
	public int getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(int buildingid) {
		this.buildingid = buildingid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	@Override
	public String toString() {
		return "BuildingMaster [buildingid=" + buildingid + ", isactive=" + isactive + ", buildingname=" + buildingname
				+ ", officeid=" + officeid + "]";
	}
	
	
}
