package com.abhay.FoodDeliveryApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhay.FoodDeliveryApp.entities.Orders;
import com.abhay.FoodDeliveryApp.entities.User;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
	List<Orders> findOrdersByUser(User user);
}
