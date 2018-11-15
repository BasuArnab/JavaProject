package com.manipal.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttrRepository extends CrudRepository<Attr, Integer>{
	
	/*@Query("select ATTRID,IDENTIFIER,ATTRTYPEID,FIELD1,FIELD2,CREATED_DATE,UPDATED_DATE from ATTR")
	List<Attr> getAllATTR();
	*/
	
}
