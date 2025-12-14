package com.Transpo.transpo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Transpo.transpo.model.Reservation;
import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {

    List<Reservation> findByPassengerEmail(String email);

    List<Reservation> findByScheduleId(String scheduleId);
}
