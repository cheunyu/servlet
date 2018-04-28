package exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/27 21:51
 */
public class ErrorHandler extends HttpServlet {

    /**
     * @description:Serlvet初始化方法
     * @param:[]
     * @return:void
     */
    public void init() {
        System.out.println("ErrorHandler加载");
    }

    /**
     * @description:处理get请求
     * @param:[]
     * @return:void
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
        String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
        System.out.println("错误代码--->" + statusCode);
        System.out.println("Servlet名称--->" + servletName);
        System.out.println("请求Uri--->" + requestUri);
    }
    
    /**
     * @description:处理post请求
     * @param:[]
     * @return:void
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * @description:Servlet销毁方法
     * @param:[]
     * @return:void
     */
    public void destory() {

    }
}
