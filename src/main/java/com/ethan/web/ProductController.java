package com.ethan.web;

import com.ethan.config.WebSecurityConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lingxingu on 2017/2/27.
 */
@Controller
public class ProductController {

    @RequestMapping("/home")
    public String home(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String name, Model model) {
        Calendar now = Calendar.getInstance();
        Date date = now.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        model.addAttribute("today", dateFormat.format(date));
        model.addAttribute("name", name);
        return "home";
    }
}
