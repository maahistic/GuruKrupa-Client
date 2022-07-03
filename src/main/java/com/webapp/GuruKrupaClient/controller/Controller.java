package com.webapp.GuruKrupaClient.controller;

import com.netflix.discovery.converters.Auto;
import com.webapp.GuruKrupaClient.delegate.AppDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AppDelegate delegate;

    //NOrmal Git Commit 
    @GetMapping("/getCount")
    public String getCount()
    {
        return delegate.getCount();
    }
}

