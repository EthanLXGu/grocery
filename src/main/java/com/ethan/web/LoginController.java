package com.ethan.web;

import com.ethan.config.WebSecurityConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingxingu on 2017/3/1.
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginGrocery")
    public @ResponseBody Map<String, Object> loginGrocery(String name, String password, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        if (!password.equals("123456")) {
            map.put("success", false);
            map.put("message", "Password Error");
            return map;
        }

        // session setting
        session.setAttribute(WebSecurityConfig.SESSION_KEY, name);

        map.put("success", true);
        map.put("message", "Login Successfully");
        return map;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // remove session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
}
