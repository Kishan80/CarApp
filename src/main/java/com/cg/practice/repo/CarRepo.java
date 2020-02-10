package com.cg.practice.repo;

import org.springframework.data.repository.CrudRepository;

import com.cg.practice.entity.Car;

public interface CarRepo extends CrudRepository<Car, Integer> {

}
