package com.yoong.servlet;

/**
 * @Desc Servlet 实例
 * PS：创建Servlet的三种方式：实现Servlet接口、继承GenericServlet类、继承HTTPServlet类。
 * https://www.runoob.com/servlet/servlet-intro.html
 * Servlet 实例
 * PS：部署到Tomcat时，web.xml中<servlet-class>配置为类的全路径名；
 * https://www.runoob.com/servlet/servlet-first-example.html
 * <p>
 * @Author yoong
 * <p>
 * @Date 2012年2月19日14:58:32
 * <p>
 * @Version 1.0
 */
public class AppServlet {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
