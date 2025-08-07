package com.abhay.FoodDeliveryApp.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abhay.FoodDeliveryApp.entities.Orders;
import com.abhay.FoodDeliveryApp.entities.User;
import com.abhay.FoodDeliveryApp.services.OrderServices;
import com.abhay.FoodDeliveryApp.services.ProductServices;
import com.abhay.FoodDeliveryApp.services.UserServices;

@Controller
public class OrderController {
   @Autowired
    private OrderServices orderServices;

    @Autowired
    private ProductServices productServices;

    @Autowired
    private UserServices userServices;

    @GetMapping("/add/{productId}")
    public String placeOrder(@PathVariable("productId") int productId, Model model, Principal principal) {
        String username = principal.getName();
        User user = userServices.getUserByEmail(username);

        Orders order = new Orders();
        order.setProduct(productServices.getProduct(productId));
        order.setUser(user);

        orderServices.saveOrder(order);

        model.addAttribute("message", "Order placed successfully!");
        return "orderSuccess"; // Make sure this view exists
    }

    @GetMapping("/myorders")
    public String getUserOrders(Model model, Principal principal) {
        String username = principal.getName();
        User user = userServices.getUserByEmail(username);

        List<Orders> orders = orderServices.getOrdersForUser(user);
        model.addAttribute("orders", orders);

        return "userOrders"; // Make sure this view exists
    }
}  

