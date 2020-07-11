package com.yoong.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Desc com.yoong.servlet.MyServlet
 * http://localhost:8080/myServlet
 * <p>
 * @Author yoong
 * <p>
 * @Date 2011-9-1
 * <p>
 * @Version 1.0
 */
public class MyServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext.getAttributeNames());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        System.out.println(servletContext.getAttributeNames());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
