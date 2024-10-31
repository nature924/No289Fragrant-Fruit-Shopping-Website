package com.entity.model;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public class HuiyuankaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 折扣
	 */
	
	private Float zhekou;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：折扣
	 */
	 
	public void setZhekou(Float zhekou) {
		this.zhekou = zhekou;
	}
	
	/**
	 * 获取：折扣
	 */
	public Float getZhekou() {
		return zhekou;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
