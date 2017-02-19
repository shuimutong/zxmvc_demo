package cn.ourpass.testm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ourpass.zxmvc.annotation.XController;
import cn.ourpass.zxmvc.annotation.XRequestMapping;

@XController
@XRequestMapping("/test")
public class TestController {

    @XRequestMapping("/testA")
    public void testA(HttpServletRequest request, HttpServletResponse reponse) {
        System.out.println("Hi, this is TestA");
    }
}