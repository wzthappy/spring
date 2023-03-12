package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyIntceptor1 implements HandlerInterceptor {
  // 在目标方法之前 执行
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//    System.out.println("preHandle.....");
//    String param = request.getParameter("param");
//    if ("yes".equals(param)) {  // 如果param为yes就放行
    return true;
//    } else {
//      request.getRequestDispatcher("/error.jsp").forward(request, response); // 转载到这个页面
//      return false;  // 拒绝放行
//    }

//    HttpSession session = request.getSession(true);  // Session
//    if(session != null) {
//      return true;    // false 表示 拒绝放行,  true表示放行
//    }
//    return false;
  }

  // 在目标方法执行之后 视图返回之前 执行
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    modelAndView.addObject("name", "itheima");
    System.out.println("postHandle.....");
  }

  // 在流程都执行完毕后 执行
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    System.out.println("afterCompletion......");
  }
}
