package com.example.mall.repository;

import com.example.mall.bean.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}