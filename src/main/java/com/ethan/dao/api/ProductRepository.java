package com.ethan.dao.api;

import com.ethan.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lingxingu on 2017/2/27.
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    Product findById(Integer id);
}
