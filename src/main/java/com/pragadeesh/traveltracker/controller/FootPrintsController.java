package com.pragadeesh.traveltracker.controller;

import com.pragadeesh.traveltracker.model.FootPrint;
import com.pragadeesh.traveltracker.repository.FootPrintRepository;
import com.pragadeesh.traveltracker.service.FootPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/footprints")
public class FootPrintsController {
    @Autowired
    private FootPrintService footPrintService;
    @Autowired
    private FootPrintRepository footPrintRepository;

    @PostMapping("getAllMyFootPrints/{type}")
    public List<FootPrint> getAllMyFootPrints(@PathVariable("type") String type){
        return  footPrintService.getAllMyFootPrints(type);
    }



    @PostMapping("/add")
    public FootPrint addFootPrint(@RequestBody FootPrint footPrint) {
        return footPrintRepository.save(footPrint);
    }

}
