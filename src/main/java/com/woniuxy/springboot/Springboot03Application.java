package com.woniuxy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//启用事务管理
@EnableTransactionManagement
//自动生成所有dao接口的实现类
@MapperScan("com.woniuxy.springboot.mapper")
@SpringBootApplication
public class Springboot03Application {

	public static void main(String[] args) {
		System.out.println("zs bbbb");
		SpringApplication.run(Springboot03Application.class, args);
	}

}
