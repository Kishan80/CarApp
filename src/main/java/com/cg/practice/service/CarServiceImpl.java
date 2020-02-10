package com.cg.practice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.practice.entity.Car;
import com.cg.practice.repo.CarRepo;

@Service
@Transactional
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepo repo;
	
	@Override
	public int addCar(Car car) {
		// TODO Auto-generated method stub
		repo.save(car);
		return car.getCarNo();
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return (List)repo.findAll();
	}

	@Override
	public Car getBycarNo(int no) {
		// TODO Auto-generated method stub
		return repo.findById(no).orElseThrow();
	}

	@Override
	public boolean removeCar(int no) {
		// TODO Auto-generated method stub
		try {
			if(repo.findById(no).get()!=null)
			 repo.deleteById(no);
			return true;

			}
			catch(Exception e) {
			System.out.println("No such flight");
			}
		return false;
		
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		repo.save(car);
	}

	
}
