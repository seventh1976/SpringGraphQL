package com.seventh.graphql.mongodb.repository;

import com.seventh.graphql.mongodb.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
