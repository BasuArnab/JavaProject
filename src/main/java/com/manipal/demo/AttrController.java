package com.manipal.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import io.java.springbootstarter.topic.Topic;

@RestController
public class AttrController {
	
	@Autowired
	private AttrService attrService;

	@RequestMapping(method = RequestMethod.GET, value = "/ATTR")
	private List<Attr> getAllAttributes() {
		return attrService.getAllAttributes();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/ATTR")
	public List<Attr> addAttribute(@RequestBody Attr attr) {
		return attrService.addAttribute(attr);
//		
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/ATTR")
//	private void updateAttributes() {
//		
//	}

	@RequestMapping(method = RequestMethod.PUT, value = "/ATTR/{id}")
	private List<Attr> updateAttribute(@RequestBody Attr attr  ,@PathVariable Integer id) {
		return attrService.updateAttribute(id,attr);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/ATTR/{id}")
	private List<Attr> deleteAttributes(@PathVariable Integer id) {
		return attrService.deleteAttributes(id);
	}

}
