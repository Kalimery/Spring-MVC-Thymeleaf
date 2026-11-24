package com.example.bdccmundiapolisspringmvc.repository;

import com.example.bdccmundiapolisspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
