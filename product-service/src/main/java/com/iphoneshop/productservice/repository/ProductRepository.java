package com.iphoneshop.productservice.repository;

import com.iphoneshop.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {



}
