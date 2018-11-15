package com.manipal.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemAttrMapping {
	public int getItemAttrMappingid() {
		return itemAttrMappingid;
	}
	public void setItemAttrMappingid(int itemAttrMappingid) {
		this.itemAttrMappingid = itemAttrMappingid;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getAttrId() {
		return attrId;
	}
	public void setAttrId(int attrId) {
		this.attrId = attrId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
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
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	@Id
	private int itemAttrMappingid;
	private int  itemId;
	private int  attrId;
	private String  attrValue;
	private String field1;
	private String field2;
	private Date created_date;
	private Date updated_date;	
	
}
