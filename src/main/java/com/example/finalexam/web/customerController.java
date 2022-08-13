package com.example.finalexam.web;

import com.example.finalexam.entity.customer;
import com.example.finalexam.repository.customerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class customerController {
    @Autowired
    private customerRepository customerRepository;



    @RequestMapping(path="/index")
    public String customers(Model model)
    {
        List<customer> customer;

        customer = customerRepository.findAll();

        model.addAttribute("listcustomer", customer);
        return "customer";
}}