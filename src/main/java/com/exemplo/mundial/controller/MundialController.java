package com.exemplo.mundial.controller;

import com.exemplo.mundial.service.MundialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palmeiras")
public class MundialController {

    @Autowired
    private MundialService mundialService;

    @GetMapping("/mundial")
    public String getMundial(){

        return  mundialService.getMundial1951Info();

    }

    @GetMapping("/mundial2012")
    public String getMundial2012() {
        return mundialService.getMundial2012Info();
    }
}
