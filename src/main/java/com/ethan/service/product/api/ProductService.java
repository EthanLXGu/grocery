package com.ethan.service.product.api;

import com.ethan.domain.Product;

import java.util.List;

/**
 * Created by lingxingu on 2017/2/27.
 */
public interface ProductService {
    List<Product> findAll();
    Product findById(Integer id);
}
