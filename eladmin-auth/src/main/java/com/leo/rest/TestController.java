package com.leo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController.java
 * @program: eladmin-cloud
 * @author: Jjcc
 * @create: 2021-06-29 23:15
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/testGateway")
    public ResponseEntity<String> testController() {
        return ResponseEntity.ok("hello world！！！");
    }
}
