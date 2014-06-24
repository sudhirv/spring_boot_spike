package com.thoughtworks.spike.repositories;

import com.thoughtworks.spike.domain.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
