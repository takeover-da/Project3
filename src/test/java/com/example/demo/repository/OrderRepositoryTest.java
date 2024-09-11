package com.example.demo.repository;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Order;



@SpringBootTest
public class OrderRepositoryTest {

	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void 데이터등록() {
		List<Order> list = new ArrayList<>();
		Order order1 = new Order();
	}
}
