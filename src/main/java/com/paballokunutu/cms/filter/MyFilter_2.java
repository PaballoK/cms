package com.paballokunutu.cms.filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

// This class is a part of a web application and it's responsible for filtering requests before they reach the main part of the application.
// It's like a gatekeeper checking incoming requests.
// If this gatekeeper allows a request, it prints a message saying it's processing the request.
// Then, it lets the request pass through to the next gatekeeper (or the main part of the application).
// This class is marked with @Component, which means it's managed by a special framework called Spring.

@Component
@Order(3)
public class MyFilter_2 implements Filter {
    // Method inside the class that checks and processes requests

    // This method is called whenever a new request comes in
    // It's like a rulebook for what to do with each request

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called...");

        // Then, we allow the request to continue its journey to the main part of the application
        // We're letting the request pass through this gatekeeper
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
