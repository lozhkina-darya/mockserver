package com.example.mockserver.service;

import com.example.mockserver.model.Lead;

import java.util.List;

public interface ILeadService {
    Lead save(Lead lead);

    List<Lead> findAll();
}
