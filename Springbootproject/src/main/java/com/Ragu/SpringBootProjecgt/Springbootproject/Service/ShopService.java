package com.Ragu.SpringBootProjecgt.Springbootproject.Service;

import java.util.List;

import com.Ragu.SpringBootProjecgt.Springbootproject.Model.ShopMall;

public interface ShopService {
     ShopMall addUser(ShopMall sm);

	List<ShopMall> findAll();
}
