package com.pragadeesh.traveltracker.repository;

import com.pragadeesh.traveltracker.model.FootPrint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootPrintRepository extends MongoRepository<FootPrint, String> {
    @Query("{ 'type': ?0 }")
    List<FootPrint> getAllMyFootPrintsByType(String type);
}
