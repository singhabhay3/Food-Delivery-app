package com.abhay.FoodDeliveryApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhay.FoodDeliveryApp.entities.User;

public interface UserRepository  extends CrudRepository<User,Integer>{

   public User findUserByUemail(String email);

}
