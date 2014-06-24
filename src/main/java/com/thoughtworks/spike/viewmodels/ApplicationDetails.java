package com.thoughtworks.spike.viewmodels;

import com.thoughtworks.spike.domain.Application;

public class ApplicationDetails {
    private final Long id;
    private final String status;

    public ApplicationDetails(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public ApplicationDetails(Application application) {
        this(application.getId(), application.getStatus());
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
