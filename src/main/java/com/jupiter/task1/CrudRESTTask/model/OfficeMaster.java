package com.jupiter.task1.CrudRESTTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfficeMaster")
public class OfficeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long officeid;
	@Column(name = "isactive")
	private boolean isactive;
	@Column(name = "officename")
	private String officename;
	@Column(name = "cityid")
	private long cityid;
	public long getOfficeid() {
		return officeid;
	}
	public void setOfficeid(long officeid) {
		this.officeid = officeid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public long getCityid() {
		return cityid;
	}
	public void setCityid(long cityid) {
		this.cityid = cityid;
	}
	@Override
	public String toString() {
		return "OfficeMaster [officeid=" + officeid + ", isactive=" + isactive + ", officename=" + officename
				+ ", cityid=" + cityid + "]";
	}
	public OfficeMaster(long officeid, boolean isactive, String officename, long cityid) {
		super();
		this.officeid = officeid;
		this.isactive = isactive;
		this.officename = officename;
		this.cityid = cityid;
	}
	
	public OfficeMaster() {}
	
	
	
}
