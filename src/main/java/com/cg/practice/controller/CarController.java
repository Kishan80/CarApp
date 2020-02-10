package com.cg.practice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.practice.entity.Car;
import com.cg.practice.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService service;
	
	@PostMapping(value = "/addCar", consumes = "application/json")
	public String addCar(@Valid @RequestBody Car car){
//		System.out.println(car.toString());
		service.addCar(car);
		return "Car Added";
	}
	
	@GetMapping(value = "/getAll", produces = "application/json")
	public List<Car> getAll(){
		return service.getAll();
	}
	
	@GetMapping(value = "/getBycarNo/{no}", produces = "application/json")
	public Car get(@PathVariable int no) {
		return service.getBycarNo(no);
	}
	
	@DeleteMapping(value = "/removeCar/{no}")
	public String delete(@PathVariable int no) {
		service.removeCar(no);
		return "Car Removed";
	}
	
	@PutMapping(value = "/updateCar", produces = "application/json")
	public String update(@Valid @RequestBody Car car) {
		service.updateCar(car);
		return "Car Updated";
	}
}
