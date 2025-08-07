package com.abhay.FoodDeliveryApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhay.FoodDeliveryApp.entities.Admin;



public interface AdminRepository  extends CrudRepository<Admin, Integer>{

   public Admin findByAdminEmail(String email);

}
