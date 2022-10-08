package com.jupiter.task1.CrudRESTTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citymaster")
public class CityMaster{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "city_name")
	private String cityName;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	private String pincode;
	@Column(name = "statename")
	private String statename;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public CityMaster(long id, String cityName, String country, String pincode, String statename) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.country = country;
		this.pincode = pincode;
		this.statename = statename;
	}
	
	public CityMaster() {
		
	}
	@Override
	public String toString() {
		return "CityMaster [id=" + id + ", cityName=" + cityName + ", country=" + country + ", pincode=" + pincode
				+ ", statename=" + statename + "]";
	}
	
	
	
}
