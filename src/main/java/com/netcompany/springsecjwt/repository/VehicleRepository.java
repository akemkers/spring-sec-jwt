package com.netcompany.springsecjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcompany.springsecjwt.model.Vehicle;

/**
 * TODO
 *
 * @author Andreas Kemkers
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
