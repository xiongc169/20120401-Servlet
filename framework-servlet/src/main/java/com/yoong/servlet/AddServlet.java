package com.yoong.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Desc com.yoong.servlet.AddServlet
 * http://localhost:8080/add
 * <p>
 * @Author yoong
 * <p>
 * @Date 2011-9-1
 * <p>
 * @Version 1.0
 */
public class AddServlet extends HttpServlet {

    public AddServlet() {
        System.out.println("com.yoong.servlet.AddServlet.com.yoong.servlet.AddServlet()");
    }

    @Override
    public void init() throws ServletException {
        //需调用super()，否则调用 this.getServletContext() 报空指针异常
        super.init();
        System.out.println("com.yoong.servlet.AddServlet.init()");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //需调用super(servletConfig)，否则调用 this.getServletContext() 报空指针异常
        super.init(servletConfig);
        System.out.println("com.yoong.servlet.AddServlet.init(servletConfig)");
        //org.apache.catalina.core.ApplicationContextFacade 类型
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext.getAttributeNames());
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        PrintStream printStream = new PrintStream(resp.getOutputStream());
        printStream.println("<html>");
        printStream.println("<head>");
        printStream.println("<title>com.yoong.servlet.AddServlet " + name + "</title>");
        printStream.println("</head>");
        printStream.println("<body>");
        printStream.println("com.yoong.servlet.AddServlet: Your name is " + name);
        printStream.println("</body>");
        printStream.println("</html>");

        //org.apache.catalina.core.ApplicationContextFacade 类型
        ServletContext servletContext = this.getServletContext();
        System.out.println(servletContext.getAttributeNames());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("com.yoong.servlet.AddServlet.destroy()");
    }
}
