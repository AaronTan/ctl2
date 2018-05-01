package net.ysjss.config;

import net.ysjss.interceptor.PrivilegeHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ExtraWebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PrivilegeHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/tologin","/login");
    }
}
