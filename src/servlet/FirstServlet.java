package servlet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/27 11:44
 */
public class FirstServlet extends HttpServlet {

    private String msg;
    

    public void init() {
        System.out.println("Servlet初始化方法，仅在类加载时运行一次");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String uname = request.getParameter("username");
        System.out.println(uname);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("进入doPost方法");
        try {
            response.sendRedirect("/redirect.html");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/forward.html");
//            dispatcher.forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destory() {
        System.out.println("销毁Servlet");
    }
}
