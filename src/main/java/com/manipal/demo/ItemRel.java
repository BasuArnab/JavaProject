package com.manipal.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemRel {
	
	public int getItemRelId() {
		return itemRelId;
	}
	public void setItemRelId(int itemRelId) {
		this.itemRelId = itemRelId;
	}
	public int getItemIdParent() {
		return itemIdParent;
	}
	public void setItemIdParent(int itemIdParent) {
		this.itemIdParent = itemIdParent;
	}
	public int getItemIdChild() {
		return itemIdChild;
	}
	public void setItemIdChild(int itemIdChild) {
		this.itemIdChild = itemIdChild;
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
	@Id
	private int itemRelId;
	private int itemIdParent;
	private int itemIdChild;
	private String field1;
	private String field2;

}
