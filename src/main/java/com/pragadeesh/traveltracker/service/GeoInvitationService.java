package com.pragadeesh.traveltracker.service;

import com.pragadeesh.traveltracker.model.GeoInvitation;
import com.pragadeesh.traveltracker.repository.GeoInvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoInvitationService {

    @Autowired
    private GeoInvitationRepository geoInvitationRepository;
    public List<GeoInvitation> getAllGeoInvitations() {
       return geoInvitationRepository.findAll();
    }
}
