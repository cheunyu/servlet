package cookie;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author:cheunyu
 * @date:2018/4/28 11:22
 */
public class CookieServlet extends HttpServlet {

    /**
     * @description:处理Post请求
     * @param:[]
     * @return:void
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

        Cookie cookie = new Cookie("name",URLEncoder.encode(request.getParameter("name"),"UTF-8"));
        cookie.setMaxAge(60*60*24); //设置cookie保存时间，最长24小时
        response.addCookie(cookie); //发送cookie到Http响应头
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies(); //读取cookie
        Cookie cookie = null;
        for (int i=0;i<cookies.length;i++) {
            cookie = cookies[i];
            cookie.setMaxAge(0);    //设置cookie立即失效
            response.addCookie(cookie);
        }
    }
}
