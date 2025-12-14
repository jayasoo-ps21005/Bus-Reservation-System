package com.Transpo.transpo.repository;

import com.Transpo.transpo.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface RouteRepository extends MongoRepository<Route, String> {
    Optional<Route> findByOriginAndDestination(String origin, String destination);
}
