package com.techline.spareparts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Home Controller for TechLine Computers
 * Handles main landing page
 *
 * @author IT_WD_ITP_17
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}