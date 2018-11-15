package com.manipal.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	/*
	 * All EBOM + MBOM
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/ITEM")
	private List<ItemVO> getAllItem() {
		return null;
	}
	
	/*
	 * Type of Ebom/MBOM
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/ITEM/{type}")
	private List<ItemVO> getItemType() {
		return null;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/ITEM")
	private List<ItemVO> updateItems() {
		return null;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/ITEM/{id}")
	private List<ItemVO> updateItem() {
		return null;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/ITEM/{id}")
	private List<ItemVO> deleteItem() {
		return null;
	}

}
