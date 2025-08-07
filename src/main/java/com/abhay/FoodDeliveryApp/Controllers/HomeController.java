package com.abhay.FoodDeliveryApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abhay.FoodDeliveryApp.entities.Product;
import com.abhay.FoodDeliveryApp.loginCredentials.AdminLogin;
import com.abhay.FoodDeliveryApp.services.ProductServices;

@Controller
public class HomeController {

   @Autowired
   private ProductServices productServices;
   
   @GetMapping(value = {"/home", "/"})
	public String home()
	{
		return "Home";
	}

	@GetMapping("/products")
	public String products( Model model)
	{ 
		List<Product> allProducts = this.productServices.getAllProducts();
		model.addAttribute("products", allProducts);
		return "Products";
	}

	@GetMapping("/location")
	public String location()
	{
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about()
	{
		return "About";
	}

	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("adminLogin",new AdminLogin());
		return "Login";
	}

}
