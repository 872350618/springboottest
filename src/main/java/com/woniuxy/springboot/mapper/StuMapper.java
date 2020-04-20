package com.woniuxy.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.springboot.entity.Stu;

//生成接口的实现类，要在每个类上添加
//@Mapper
public interface StuMapper {

	void insertStu(Stu stu);
	List<Stu> selectAllStus();
}
