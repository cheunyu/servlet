package filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/27 13:25
 */
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器LogFilter初始化方法，仅在在容器加载时执行一次");
        String str = filterConfig.getInitParameter("Site");
        System.out.println("获取web.xml配置文件自定义参数--------->" + str);

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截器LogFilter记录日志");
        filterChain.doFilter(servletRequest, servletResponse);  //请求传回过滤链
    }

    @Override
    public void destroy() {
        System.out.println("容器移除LogFilter前调用销毁方法");
    }
}
