package com.example.springdage2.Controller;

import com.example.springdage2.util.ListCreator;
import com.example.springdage2.Model.Something;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    private ListCreator listCreator;


    @GetMapping("/")
    public String home(Model model) {
        ArrayList<Something> list = listCreator.getList();
        model.addAttribute("list", list);
        return "home/index";
    }
}
