package io.java.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
	//get all topics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)

}