package com.Ragu.SpringBootProjecgt.Springbootproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ragu.SpringBootProjecgt.Springbootproject.Model.ShopMall;
import com.Ragu.SpringBootProjecgt.Springbootproject.Repository.ShopRepository;
import com.Ragu.SpringBootProjecgt.Springbootproject.Service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	 @Autowired
	 private ShopRepository shoprep;
	 
	 
	 @Override
	 public ShopMall addUser(ShopMall sm) {
		return shoprep.save(sm); 
	 }


	@Override
	public List<ShopMall> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
