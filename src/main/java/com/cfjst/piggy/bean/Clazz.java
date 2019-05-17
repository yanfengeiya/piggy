package com.cfjst.piggy.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Clazz {

	/**
	 * 这里需要一丢丢注释
	 * 由于class为Java关键字，故取名为clazz
	 */
	
	private Integer id;
	private String name;
	private List<Course> courses;

}