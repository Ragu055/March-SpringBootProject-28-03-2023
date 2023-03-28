package com.Ragu.SpringBootProjecgt.Springbootproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ragu.SpringBootProjecgt.Springbootproject.Model.ShopMall;
import com.Ragu.SpringBootProjecgt.Springbootproject.Service.ShopService;

@RestController
@RequestMapping("/shopMall")
public class ShopController {
	
	
	@Autowired
	private ShopService shopserv;
	
	@PostMapping("/addUser")
	public ShopMall addUser(@RequestBody ShopMall sm) {
		return shopserv.addUser(sm);
	}
	@RequestMapping("/shopMall")
	public List<ShopMall> getName() {
		return shopserv.findAll();
	}
	@GetMapping("/ragu")
		public String getNa() {
			return "raguvaran";
		}
	

}
