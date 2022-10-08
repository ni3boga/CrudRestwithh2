package com.jupiter.task1.CrudRESTTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "floormaster")
public class Floormaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int floorid;
	
	@Column(name="isactive")
	boolean isactive;
	
	@Column(name = "floorname")
	String floorname;
	
	@Column(name="floorplan")
	String floorplan;
	
	@Column(name="buildingid")
	String buildingid;

	public int getFloorid() {
		return floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public String getFloorname() {
		return floorname;
	}

	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}

	public String getFloorplan() {
		return floorplan;
	}

	public void setFloorplan(String floorplan) {
		this.floorplan = floorplan;
	}

	public String getBuildingid() {
		return buildingid;
	}

	public void setBuildingid(String buildingid) {
		this.buildingid = buildingid;
	}

	@Override
	public String toString() {
		return "Floormaster [floorid=" + floorid + ", isactive=" + isactive + ", floorname=" + floorname
				+ ", floorplan=" + floorplan + ", buildingid=" + buildingid + "]";
	}

	public Floormaster(int floorid, boolean isactive, String floorname, String floorplan, String buildingid) {
		super();
		this.floorid = floorid;
		this.isactive = isactive;
		this.floorname = floorname;
		this.floorplan = floorplan;
		this.buildingid = buildingid;
	}
	
	
}
