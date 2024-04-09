package com.paballokunutu.cms.config;

import com.paballokunutu.cms.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This class is responsible for configuring a new filter for a web application.
// It's like setting up a new security camera at a specific entrance.
// When a request comes through that entrance, this filter will be applied to it.
// This filter is called MyNewFilter, and it's implemented elsewhere in the code.
// The purpose of this configuration class is to register and define the rules for using MyNewFilter.

@Configuration
public class MyFilterConfig {

    // Method inside the class that creates and configures a new filter

    // This method creates and configures a new filter for the application
    // It's like installing and setting up the security camera at the entrance
    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean(){
        // Create a new registration bean for the filter
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();


        // Set the filter to be used for this registration bean
        // This is like telling the security camera what type of camera it should use
        registrationBean.setFilter(new MyNewFilter());

        // Add URL patterns to which this filter should be applied
        // This is like specifying which entrance or path should have the security camera installed
        registrationBean.addUrlPatterns("/customers/");
        return registrationBean;

    }
}
