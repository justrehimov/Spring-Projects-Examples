package com.desofme.springbootgraphql.repo;

import com.desofme.springbootgraphql.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByTypeLike(String type);

}
