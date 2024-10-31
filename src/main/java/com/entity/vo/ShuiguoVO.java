package com.entity.vo;

import com.entity.ShuiguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 水果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public class ShuiguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 水果名称
	 */
	
	private String shuiguomingcheng;
		
	/**
	 * 水果种类
	 */
	
	private String shuiguozhonglei;
		
	/**
	 * 水果详情
	 */
	
	private String shuiguoxiangqing;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 积分
	 */
	
	private Integer jifen;
		
	/**
	 * 水果照片
	 */
	
	private String shuiguozhaopian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：水果名称
	 */
	 
	public void setShuiguomingcheng(String shuiguomingcheng) {
		this.shuiguomingcheng = shuiguomingcheng;
	}
	
	/**
	 * 获取：水果名称
	 */
	public String getShuiguomingcheng() {
		return shuiguomingcheng;
	}
				
	
	/**
	 * 设置：水果种类
	 */
	 
	public void setShuiguozhonglei(String shuiguozhonglei) {
		this.shuiguozhonglei = shuiguozhonglei;
	}
	
	/**
	 * 获取：水果种类
	 */
	public String getShuiguozhonglei() {
		return shuiguozhonglei;
	}
				
	
	/**
	 * 设置：水果详情
	 */
	 
	public void setShuiguoxiangqing(String shuiguoxiangqing) {
		this.shuiguoxiangqing = shuiguoxiangqing;
	}
	
	/**
	 * 获取：水果详情
	 */
	public String getShuiguoxiangqing() {
		return shuiguoxiangqing;
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
	 * 设置：积分
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：水果照片
	 */
	 
	public void setShuiguozhaopian(String shuiguozhaopian) {
		this.shuiguozhaopian = shuiguozhaopian;
	}
	
	/**
	 * 获取：水果照片
	 */
	public String getShuiguozhaopian() {
		return shuiguozhaopian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
