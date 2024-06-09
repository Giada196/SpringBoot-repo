package com.example.demo_middleware2.configurations;

import com.example.demo_middleware2.interceptors.APILoggingInterceptor;
import com.example.demo_middleware2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private MonthInterceptor monthInterceptor;
    @Override
    public void addInterceptor(InterceptorRegistry registry){
        registry.addInterceptor(monthInterceptor);
    }
}
