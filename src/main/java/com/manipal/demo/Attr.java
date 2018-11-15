package com.manipal.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="ATTR")
public class Attr {

	public int getATTR_ID() {
		return ATTR_ID;
	}
	public void setATTR_ID(int aTTR_ID) {
		ATTR_ID = aTTR_ID;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public int getAttrtypeId() {
		return attrtypeId;
	}
	public void setAttrtypeId(int attrtypeId) {
		this.attrtypeId = attrtypeId;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public Date getCreated_Date() {
		return Created_Date;
	}
	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}
	public Date getUpdated_Date() {
		return Updated_Date;
	}
	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}
	
	@Id
	@Column(name="ATTRID")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ATTR_ID;
	
	@Column(name="IDENTIFIER")
	private String identifier;
	
	@Column(name="ATTRTYPEID")
	private int attrtypeId;
	
	@Column(name="FIELD1")
	private String field1;
	
	@Column(name="FIELD2")
	private String field2;
	
	@Column(name="CREATED_DATE")
	private Date Created_Date;
	
	@Column(name="UPDATED_DATE")
	private Date Updated_Date;

}
