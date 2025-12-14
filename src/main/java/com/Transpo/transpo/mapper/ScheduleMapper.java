package com.Transpo.transpo.mapper;

import com.Transpo.transpo.dto.ScheduleDTO;
import com.Transpo.transpo.model.Schedule;

public class ScheduleMapper {

    public static ScheduleDTO toDto(Schedule s) {
        if (s == null) {
            return null;
        }

        ScheduleDTO d = new ScheduleDTO();
        d.setId(s.getId()); // MongoDB ID is usually String

        if (s.getBus() != null) {
            d.setBusId(s.getBus().getId()); // also String in MongoDB
            d.setBusNumber(s.getBus().getBusNumber());
        }

        if (s.getRoute() != null) {
            d.setRouteId(s.getRoute().getId()); // also String in MongoDB
            d.setOrigin(s.getRoute().getOrigin());
            d.setDestination(s.getRoute().getDestination());
        }

        d.setDepartureTime(s.getDepartureTime()); // fixed typo
        d.setFare(s.getFare());
        d.setAvailableSeats(s.getAvailableSeats());

        return d;
    }
}
