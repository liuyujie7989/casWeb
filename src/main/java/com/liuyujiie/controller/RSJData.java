package com.liuyujiie.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-01-09 10:29
 **/
@RestController
public class RSJData {
    @RequestMapping("/rsjDate")
    public void  test(@RequestBody String data) {
        System.out.println(data);
    }
}
