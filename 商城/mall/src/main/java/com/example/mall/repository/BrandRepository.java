package com.example.mall.repository;

import com.example.mall.bean.Product_brand;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<Product_brand, Integer> {
}
