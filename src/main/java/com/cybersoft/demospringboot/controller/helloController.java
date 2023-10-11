package com.cybersoft.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *   Annatation Định nghĩa đường dẫn
 *  @ Controller: Định nghĩa đường dẫn được dùng đẻ trả ra nội dung HTML
 *  @ ResponseBody: Trả nội dung kểu String
 *  @ RestController: Định nghĩa đường dẫn, nội dung trả về nội dung - API
 *
 */
// /hello
@RestController
@RequestMapping("/hello")
public class helloController {

    @GetMapping("")
    public String hello(){
        return "Hello String Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft";
    }
}
