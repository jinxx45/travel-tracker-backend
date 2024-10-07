package com.pragadeesh.traveltracker.service;

import com.pragadeesh.traveltracker.model.FootPrint;
import com.pragadeesh.traveltracker.repository.FootPrintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootPrintService {
    @Autowired
    FootPrintRepository footPrintRepository;
    public List<FootPrint> getAllMyFootPrints(String type){
        return footPrintRepository.getAllMyFootPrintsByType(type);
    }
}
