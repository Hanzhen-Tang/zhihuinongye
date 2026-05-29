package com.itbaizhan.farm_main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.itbaizhan.farm_system",
											"com.itbaizhan.farm_common"})
@MapperScan(basePackages = {		"com.itbaizhan.farm_system.mapper"})
public class FarmMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmMainApplication.class, args);
	}

}
