package session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:cheunyu
 * @date:2018/4/28 17:21
 */
public class SessionExample extends HttpServlet {

    public void init() {
        System.out.println("Servlet初始化方法，仅在类加载时运行一次");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        this.doPost(request, response);
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Date createDate = new Date(session.getCreationTime());  //session创建时间
        Date lastAccessTime = new Date(session.getLastAccessedTime());  //网页最后一次访问的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Integer visitCount = (Integer) session.getAttribute("visitCount");    //访问统计
        String userId = (String) session.getAttribute("userID");    //用户ID
        System.out.println("session创建时间" + createDate);
        System.out.println("网页最后一次访问的时间" + lastAccessTime);
        System.out.println("访问统计" + visitCount);
        System.out.println("用户ID" + userId);
    }

    public void destory() {
        System.out.println("销毁Servlet");
    }
}
