package com.thoughtworks.spike.services;

import com.thoughtworks.spike.domain.Application;
import com.thoughtworks.spike.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private final ApplicationRepository repository;

    @Autowired
    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public Application findApplicationById(Long id) {
        return repository.findOne(id);
    }
}
