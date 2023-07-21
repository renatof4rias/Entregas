package com.softwarek.entregas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwarek.entregas.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	 List<Product> findAllByOrderByNameAsc();
	
}
