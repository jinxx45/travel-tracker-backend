package com.pragadeesh.traveltracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "geoInvitations")
public class GeoInvitation {
    @Id
    public String Id;
    public String invitationFrom;
    public String invitationDescription;
    public String geoLocation;
    public String eventDate;

    public String getInvitationFrom() {
        return invitationFrom;
    }

    public void setInvitationFrom(String invitationFrom) {
        this.invitationFrom = invitationFrom;
    }

    public String getInvitationDescription() {
        return invitationDescription;
    }

    public void setInvitationDescription(String invitationDescription) {
        this.invitationDescription = invitationDescription;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

}
