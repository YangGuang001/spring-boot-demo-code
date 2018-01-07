package com.springboot.demo.autoconfiguration;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by yz on 2017/12/26.
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.printf("filter :" + servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
