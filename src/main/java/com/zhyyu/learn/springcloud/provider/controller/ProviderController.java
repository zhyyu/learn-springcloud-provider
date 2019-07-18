package com.zhyyu.learn.springcloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juror
 * @datatime 2019/7/18 17:46
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

}
