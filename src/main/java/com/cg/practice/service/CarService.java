package com.cg.practice.service;

import java.util.List;

import com.cg.practice.entity.Car;



public interface CarService {
	
	int addCar(Car car);
	
	List<Car> getAll();

	Car getBycarNo(int no);

	boolean removeCar(int no);
	
	void updateCar(Car car);



}
