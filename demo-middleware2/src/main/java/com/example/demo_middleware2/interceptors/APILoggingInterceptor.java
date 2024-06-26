package com.example.demo_middleware2.interceptors;

import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
    public class APILoggingInterceptor implements HandlerInterceptor {

        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handles) throws Exception {
            return true;
        }

        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

        }

        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        }

    }

