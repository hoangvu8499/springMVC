package com.springMVC.intercepter;

import com.springMVC.serviceImpl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Class nay se dc thang Handler trong Dispatcher goi khi buil
public class MenuHandleInterceptor implements HandlerInterceptor {
    @Autowired
    HomeServiceImpl homeService;

    // Truoc khi request vao URL thi chay cai nay trc. CHU YEU LA MINH DUNG CAI NAY THOI
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        request.setAttribute("menu", homeService.loadMenu());
        return true;
    }

    // Trong khi request vao URL thi chay cai nay trc
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    // Sau khi request vao URL thi chay cai nay trc
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
