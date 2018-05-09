package net.ysjss.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrivilegeHandlerInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //静态资源貌似会被拦截
        if(request.getRequestURI().startsWith("/assets")){
            return true;
        }
        if(request.getRequestURI().startsWith("/vue")){
            return true;
        }
        if(request.getRequestURI().startsWith("/static")){
            return true;
        }
        Object user = request.getSession().getAttribute("user");
        if(user == null){
            request.setAttribute("msg","没有权限操作");
            request.getRequestDispatcher("/tologin").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
