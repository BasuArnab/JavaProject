package com.manipal.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttrService {

	@Autowired
	private AttrRepository attrRepository;
	
	public List<Attr> getAllAttributes()
	{
		List<Attr> attrs= new ArrayList<Attr>();	
		attrRepository.findAll().forEach(attrs::add);
		return attrs;
	}
	public List<Attr> addAttribute(Attr attr) 
	{
		attrRepository.save(attr);
		List<Attr> attrs= new ArrayList<Attr>();	
		attrRepository.findAll().forEach(attrs::add);
		return attrs;
		
	}
	public List<Attr> updateAttribute(Integer id,Attr attr) {
		attrRepository.save(attr);
		List<Attr> attrs= new ArrayList<Attr>();	
		attrRepository.findAll().forEach(attrs::add);
		return attrs;
	}
	
	public List<Attr> deleteAttributes(Integer id)
	{
		attrRepository.deleteById(id);
		List<Attr> attrs= new ArrayList<Attr>();	
		attrRepository.findAll().forEach(attrs::add);
		return attrs;
	}

}
