package com.desofme.springbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.desofme.springbootgraphql.dto.VehicleDto;
import com.desofme.springbootgraphql.model.Vehicle;
import com.desofme.springbootgraphql.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepo vehicleRepo;

    public Vehicle saveVehicle(VehicleDto vehicleDto){
        return vehicleRepo.save(toVehicle(vehicleDto));
    }

    private Vehicle toVehicle(VehicleDto vehicleDto){
        Vehicle vehicle = new ModelMapper().map(vehicleDto, Vehicle.class);
        vehicle.setProductionDate(new Date());
        return vehicle;
    }

}
