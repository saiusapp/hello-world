package com.webapps.hibernate;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "userdetails")
public class HibernateAnnotations implements Serializable {
	@Id 
	@Column(name = "SID")
	private Integer SID;
	@Column(name = "LNAME")
	private String LNAME;
	@Column(name = "FNAME")
	private String FNAME;
	@Column(name = "EMAIL") 
	private String EMAIL;
	@Column(name = "ADDRESS")
	private String ADDRESS;
	
	
	public Integer getSID() {
		return SID;
	}
	public void setSID(Integer sID) {
		SID = sID;
	}
	public String getLNAME() {
		return LNAME;
	}
	public void setLNAME(String lNAME) {
		LNAME = lNAME;
	}
	public String getFNAME() {
		return FNAME;
	}
	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	
	
}
