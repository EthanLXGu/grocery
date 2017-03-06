package com.ethan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lingxingu on 2017/3/5.
 */
@Controller
public class SubscribeController {
    @RequestMapping("/subscribe")
    public String subscribe() {
        return "subscribe";
    }
}
