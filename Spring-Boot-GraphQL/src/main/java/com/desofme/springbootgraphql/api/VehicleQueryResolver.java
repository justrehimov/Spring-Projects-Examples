package com.desofme.springbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.desofme.springbootgraphql.model.Vehicle;
import com.desofme.springbootgraphql.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepo vehicleRepo;

    public List<Vehicle> getVehicles(String type){
        return vehicleRepo.findByTypeLike(type);
    }

    public Optional<Vehicle> getById(Long id){
        return vehicleRepo.findById(id);
    }
}
