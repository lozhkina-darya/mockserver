package com.example.mockserver.rest;

import com.example.mockserver.service.ILeadService;
import com.example.mockserver.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;

public class TestController {

    @Autowired
    private ILeadService iLeadService;
}
