package com.Ragu.SpringBootProjecgt.Springbootproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ragu.SpringBootProjecgt.Springbootproject.Model.ShopMall;


@Repository
public interface ShopRepository extends JpaRepository<ShopMall,Long> {

}
