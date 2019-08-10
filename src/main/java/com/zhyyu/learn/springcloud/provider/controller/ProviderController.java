package com.zhyyu.learn.springcloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @RequestMapping("helloObj")
    public String helloObj(MyObj1 myObj1) {
        return myObj1.toString();
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class MyObj1 {
        private String key1;
        private String key2;
    }

}
