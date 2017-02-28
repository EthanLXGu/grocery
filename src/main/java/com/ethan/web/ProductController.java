package com.ethan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lingxingu on 2017/2/27.
 */
@Controller
public class ProductController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
