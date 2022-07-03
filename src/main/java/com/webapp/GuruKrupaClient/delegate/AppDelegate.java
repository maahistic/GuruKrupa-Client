package com.webapp.GuruKrupaClient.delegate;


import com.webapp.GuruKrupaClient.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {

    @Autowired
    RestTemplate restTemplate;

    public String getCount()
    {
        return restTemplate.getForObject("http://localhost:8888/countUser", String.class);
    }


}

