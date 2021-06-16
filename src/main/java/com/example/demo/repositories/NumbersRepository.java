package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Numbers;

@Repository
public interface NumbersRepository extends MongoRepository<Numbers,Long>{

}
