package com.ethan.web;

import com.ethan.domain.Product;
import com.ethan.service.product.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lingxingu on 2017/2/27.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("prods", products);
        return "product/list";
    }
}
