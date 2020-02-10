package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.practice.entity.Car;
import com.cg.practice.service.CarServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CarServiceImpl.class)
class CarAppApplicationTests {
	
	@MockBean
	private CarServiceImpl carSer;

	@Test
	public void  addCarTest() throws Exception {
		
		Car mockCar = new Car(1,"tata","nano","red",10000.00);
		
		when(carSer.addCar(Mockito.any(Car.class))).thenReturn(mockCar.getCarNo());
		assertEquals(mockCar.getCarNo(), carSer.addCar(mockCar));
		
	}
	
	@Test
	public void  getAllTest() throws Exception{
		
		Car mockCar = new Car(1,"tata","nano","red",10000.00);
		Car mockCar1 = new Car(2,"tata","nano","red",20000.00);
		Mockito.when(carSer.getAll()).thenReturn(Arrays.asList(mockCar,mockCar1));
		assertEquals(2, carSer.getAll().size());
	}

}
