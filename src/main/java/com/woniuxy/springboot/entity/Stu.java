package com.woniuxy.springboot.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {

	private Integer sid;
	private String sname;
	private Integer age;
	private Date birthdate;
} 
