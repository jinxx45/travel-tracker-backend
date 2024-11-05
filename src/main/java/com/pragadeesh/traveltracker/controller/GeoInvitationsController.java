package com.pragadeesh.traveltracker.controller;

import com.pragadeesh.traveltracker.model.GeoInvitation;
import com.pragadeesh.traveltracker.service.GeoInvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/geoInvitations")
public class GeoInvitationsController {

    @Autowired
    private GeoInvitationService geoInvitationService;

    @GetMapping
    public List<GeoInvitation> getAllGeoInvitations(){
        return geoInvitationService.getAllGeoInvitations();
    }
}
