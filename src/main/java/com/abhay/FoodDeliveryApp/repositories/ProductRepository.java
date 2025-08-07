package com.abhay.FoodDeliveryApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhay.FoodDeliveryApp.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

   public Product findByPname(String name);

}
