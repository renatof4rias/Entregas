package com.softwarek.entregas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwarek.entregas.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

	
	
}
