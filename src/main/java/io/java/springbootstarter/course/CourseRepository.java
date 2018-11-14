package io.java.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
	
	
	//get all topics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	public List<Course> findByTopicId(String topicId);
	

}
