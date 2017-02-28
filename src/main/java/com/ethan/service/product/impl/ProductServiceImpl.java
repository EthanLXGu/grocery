package com.ethan.service.product.impl;

import com.ethan.dao.api.ProductRepository;
import com.ethan.domain.Product;
import com.ethan.service.product.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lingxingu on 2017/2/27.
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id);
    }
}
