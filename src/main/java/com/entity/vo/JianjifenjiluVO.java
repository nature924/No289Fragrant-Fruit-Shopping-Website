package com.entity.vo;

import com.entity.JianjifenjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 减积分记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public class JianjifenjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 水果编号
	 */
	
	private String shuiguobianhao;
		
	/**
	 * 积分
	 */
	
	private String jifen;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：水果编号
	 */
	 
	public void setShuiguobianhao(String shuiguobianhao) {
		this.shuiguobianhao = shuiguobianhao;
	}
	
	/**
	 * 获取：水果编号
	 */
	public String getShuiguobianhao() {
		return shuiguobianhao;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(String jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public String getJifen() {
		return jifen;
	}
			
}
