package com.manipal.demo;

import java.util.List;

public class ItemVO {

	public Item getItem_bom() {
		return item_bom;
	}
	public void setItem_bom(Item item_bom) {
		this.item_bom = item_bom;
	}
	public List<ItemAttrMapping> getItem_attr_mapping() {
		return item_attr_mapping;
	}
	public void setItem_attr_mapping(List<ItemAttrMapping> item_attr_mapping) {
		this.item_attr_mapping = item_attr_mapping;
	}

	private Item item_bom;
	
	private List<ItemAttrMapping> item_attr_mapping;
	
	
}
