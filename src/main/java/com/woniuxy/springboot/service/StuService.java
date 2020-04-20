package com.woniuxy.springboot.service;

import java.util.List;

import com.woniuxy.springboot.entity.Stu;

public interface StuService {

	void stuTransaction();
	List<Stu> getAllStus();
}
