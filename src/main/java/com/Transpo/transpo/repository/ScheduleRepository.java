package com.Transpo.transpo.repository;

import com.Transpo.transpo.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {

    List<Schedule> findByRouteOriginAndRouteDestination(String origin, String destination);

    @Query("{ '_id': ?0 }")
    Schedule findScheduleById(@Param("id") String id);
}
