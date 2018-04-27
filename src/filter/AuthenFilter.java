package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/27 13:47
 */
public class AuthenFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器AuthenFilter初始化方法，仅在在容器加载时执行一次");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截器AuthenFilter鉴权");
        filterChain.doFilter(servletRequest,servletResponse);   //请求传回过滤链
    }

    @Override
    public void destroy() {
        System.out.println("容器移除AuthenFilter前调用销毁方法");
    }
}
