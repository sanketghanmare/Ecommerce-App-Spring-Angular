package com.sk101.ecommerce.dao;

import com.sk101.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {




}
