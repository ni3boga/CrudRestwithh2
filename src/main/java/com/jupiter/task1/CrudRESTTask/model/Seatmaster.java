package com.jupiter.task1.CrudRESTTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seatmaster")
public class Seatmaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int seatid;
	
	@Column(name = "isactive")
	boolean isactive;
	@Column(name = "cubicleposition")
	int cubicleposition;
	@Column(name = "qrnumber")
	String qrnumber;
	
	int seatnumber;
	
	String seattype;
	
	int floorid;
	
	int seattypeid;

	public int getSeatid() {
		return seatid;
	}

	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public int getCubicleposition() {
		return cubicleposition;
	}

	public void setCubicleposition(int cubicleposition) {
		this.cubicleposition = cubicleposition;
	}

	public String getQrnumber() {
		return qrnumber;
	}

	public void setQrnumber(String qrnumber) {
		this.qrnumber = qrnumber;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public int getFloorid() {
		return floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}

	public int getSeattypeid() {
		return seattypeid;
	}

	public void setSeattypeid(int seattypeid) {
		this.seattypeid = seattypeid;
	}

	@Override
	public String toString() {
		return "Seatmaster [seatid=" + seatid + ", isactive=" + isactive + ", cubicleposition=" + cubicleposition
				+ ", qrnumber=" + qrnumber + ", seatnumber=" + seatnumber + ", seattype=" + seattype + ", floorid="
				+ floorid + ", seattypeid=" + seattypeid + "]";
	}
	
	
	
}
