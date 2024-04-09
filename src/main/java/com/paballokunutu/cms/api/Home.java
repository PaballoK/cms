package com.paballokunutu.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

// Define the package where this class resides

@RestController
// @RestController annotation indicates that this class serves as a RESTful controller.
// This means that it's responsible for handling HTTP requests and returning appropriate responses.
// It combines @Controller and @ResponseBody annotations.


public class Home {

    /**
     * The home() method serves to generate a response when called, typically for the home page of a web application.
     * This message is often displayed on the home page to reassure users of the application's operational status.
     * Essentially, it provides a simple and direct confirmation of the application's functionality.
     * @return the string "Application works fine!!!", indicating the smooth functioning of the application.
     */
    @GetMapping
    public String home(){
        return "Application works fine!!!" + new Date();
    }
}
