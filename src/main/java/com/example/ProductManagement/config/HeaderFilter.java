package com.example.ProductManagement.config; // 👈 adjust package name

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletResponse httpResp = (HttpServletResponse) response;

        // Disable CSP completely (dev only)
        httpResp.setHeader("Content-Security-Policy", "");

        chain.doFilter(request, response);
    }
}