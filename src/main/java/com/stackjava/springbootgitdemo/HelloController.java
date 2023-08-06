/*
 * HelloController.java
 *
 * Copyright (c) 2023 Chip One Stop, Inc. All right reserved.
 * This software is the confidential and proprietary information of Chip One Stop, Inc.
 *
 */
package com.stackjava.springbootgitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author GM
 */
@RestController
public class HelloController {

    private String name;
    @GetMapping("/hello")
    public String index() {
        return "index";
    }

    @GetMapping("/hello1")
    public String index2() {
        return "index2";
    }

    @GetMapping("/hello3")
    public String index4() {
        return "index4";
    }


}