package com.meloCoding.dream_shops.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meloCoding.dream_shops.models.Product;

public interface productRepository extends JpaRepository<Product, Long> {

}
