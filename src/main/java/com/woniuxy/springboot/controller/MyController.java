package com.woniuxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.springboot.entity.Stu;
import com.woniuxy.springboot.service.StuService;

//相当于在每个方法上添加@ResponseBody,所有的处理器方法返回的都是JSON
@RestController
@Controller
public class MyController {
	
	@Autowired
	StuService stuService;

	@RequestMapping("/getall")
	public List<Stu> getAll() {
		return stuService.getAllStus();
	}
}
