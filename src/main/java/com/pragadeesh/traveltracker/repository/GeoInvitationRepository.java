package com.pragadeesh.traveltracker.repository;

import com.pragadeesh.traveltracker.model.GeoInvitation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoInvitationRepository extends MongoRepository<GeoInvitation,String> {
}
