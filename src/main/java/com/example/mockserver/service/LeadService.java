package com.example.mockserver.service;

import com.example.mockserver.dao.LeadRepository;
import com.example.mockserver.model.Lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadService implements ILeadService{

    @Autowired
    LeadRepository leadRepository;

    @Override
    public Lead save(Lead lead) {
        return leadRepository.save(lead);
    }

    @Override
    public List<Lead> findAll() {
        return leadRepository.findAll();
    }






}
