/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.controller;

import com.htv.nttv.pojo.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/user")
public class CalendarController {
    
    @GetMapping("/calendar")
    public String fullCalendar() {
        return "calendar";
    }
    
    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
