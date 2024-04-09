package com.paballokunutu.cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/2024")
     public String sayHello(){
        return "SWEEEETIE NGWANGO KE BUSY";
     }
}
