package com.Transpo.transpo.repository;

import com.Transpo.transpo.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, String> {

}
