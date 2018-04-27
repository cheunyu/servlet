package test;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author:cheunyu
 * @date:2018/4/27 11:44
 */
public class FirstServlet extends HttpServlet {

    private String msg;
    

    public void init() {
        System.out.printf("初始化方法，仅在类加载时运行一次");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String uname = request.getParameter("username");
        System.out.printf("uname");
    }

    public void destory() {
        System.out.printf("销毁实例");
    }
}
