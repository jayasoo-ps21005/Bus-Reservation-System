package com.Transpo.transpo.mapper;

import com.Transpo.transpo.dto.RouteDTO;
import com.Transpo.transpo.model.Route;

public class RouteMapper {
    public static RouteDTO toDto(Route r) {
        if (r == null)
            return null;
        RouteDTO d = new RouteDTO();
        d.setId(r.getId());
        d.setOrigin(r.getOrigin());
        d.setDestination(r.getDestination());
        d.setDistance(r.getDistance());
        return d;
    }

    public static Route toEntity(RouteDTO d) {
        if (d == null)
            return null;
        Route r = new Route();
        // MongoDB auto-generates IDs, no need to set
        r.setOrigin(d.getOrigin());
        r.setDestination(d.getDestination());
        r.setDistance(d.getDistance());
        return r;
    }
}
