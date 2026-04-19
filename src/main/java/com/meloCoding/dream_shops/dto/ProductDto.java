package com.meloCoding.dream_shops.dto;

import java.math.BigDecimal;
import java.util.List;

import com.meloCoding.dream_shops.models.Category;
import com.meloCoding.dream_shops.models.Image;

public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;

    private Category category;

    private List<ImageDto> images;

}
