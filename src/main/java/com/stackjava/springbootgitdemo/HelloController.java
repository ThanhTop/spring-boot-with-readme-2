/*
 * HelloController.java
 *
 * Copyright (c) 2023 Chip One Stop, Inc. All right reserved.
 * This software is the confidential and proprietary information of Chip One Stop, Inc.
 *
 */
package com.stackjava.springbootgitdemo;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 *
 * @author GM
 */
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "index";
    }
}