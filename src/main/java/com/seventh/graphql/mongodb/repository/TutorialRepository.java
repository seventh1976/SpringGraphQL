package com.seventh.graphql.mongodb.repository;

import com.seventh.graphql.mongodb.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
}
