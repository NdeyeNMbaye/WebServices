package com.groupeisi.m2gl.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class Ms2Controller {
        @GetMapping("/helloword")
        public String helloword() {return "helloword ms2";}
}

