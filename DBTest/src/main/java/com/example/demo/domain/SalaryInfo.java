package com.example.demo.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 給与情報Bean
 */
@Component
@Data
public class SalaryInfo {
	/** 社員番号 **/
	String id;
	/** 役職 **/
	String position;
	/** 基本給 **/
	int basicSalary;
}
