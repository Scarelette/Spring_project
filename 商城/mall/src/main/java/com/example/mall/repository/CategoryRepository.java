package com.example.mall.repository;

import com.example.mall.bean.Product_category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Product_category,Integer> {
}
