package com.woniuxy.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.woniuxy.springboot.LoginHandlerInterceptor;

//@Configuration
//public class MyWebMvcConfig implements WebMvcConfigurer {
//
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		//注册自定义映射路径,有模板引擎，viewname会经过模板引擎解析
//		registry.addViewController("/").setViewName("login");
//		registry.addViewController("/index.html").setViewName("login");
//	}
//}

@Configuration
public class MyWebMvcConfig {

	@Bean
	public WebMvcConfigurer mvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				// 注册自定义映射路径,有模板引擎，viewname会经过模板引擎解析
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("login");
				registry.addViewController("/main").setViewName("index");
			}
			
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginHandlerInterceptor())
					//指定要拦截的路径
					.addPathPatterns("/**")
					//特殊路径放行
					.excludePathPatterns("/","/index.html","/user/login","/css/**");
			}
		};
	}
}
