package com.yoong.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Desc FirstServlet
 * http://localhost:8080/first
 * <p>
 * @Author yoong
 * <p>
 * @Date 2011-9-1
 * <p>
 * @Version 1.0
 */
public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        PrintStream printStream = new PrintStream(resp.getOutputStream());
        printStream.println("<html>");
        printStream.println("<head>");
        printStream.println("<title>FirstServlet " + name + "</title>");
        printStream.println("</head>");
        printStream.println("<body>");
        printStream.println("FirstServlet: Your name is " + name);
        printStream.println("</body>");
        printStream.println("</html>");
    }
}
