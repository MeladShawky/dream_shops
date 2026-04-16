package com.meloCoding.dream_shops.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meloCoding.dream_shops.models.Category;

public interface categoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
