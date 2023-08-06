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

     @GetMapping("/hello2")
    public String index3() {
        return "index3";
    }

    @GetMapping("/hello5")
    public String index5() {
        return "index3";
    }

    @GetMapping("/hello6")
    public String index6() {
        return "index3";
    }

    @GetMapping("/hello7")
    public String index7() {
        return "index3";
    }
     @GetMapping("/hello8")
    public String index8() {
        return "index3";
    }

    @GetMapping("/hello9")
    public String index9() {
        return "index3";
    }


}
