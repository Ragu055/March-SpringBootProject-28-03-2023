package com.Ragu.SpringBootProjecgt.Springbootproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="/Mall")
public class ShopMall {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopNo;
	private String shopName;
	private String ShopLocation;
	private String email;
	public ShopMall() {
		super();
	}
	public ShopMall(int shopNo, String shopName, String shopLocation, String email) {
		super();
		this.shopNo = shopNo;
		this.shopName = shopName;
		ShopLocation = shopLocation;
		this.email = email;
	}
	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopLocation() {
		return ShopLocation;
	}
	public void setShopLocation(String shopLocation) {
		ShopLocation = shopLocation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
        

}
