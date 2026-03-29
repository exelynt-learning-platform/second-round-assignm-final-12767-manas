package com.example.demo.repository;

import com.example.demo.entity.Product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Product productId);
}