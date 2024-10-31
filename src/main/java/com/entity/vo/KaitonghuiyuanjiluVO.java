package com.entity.vo;

import com.entity.KaitonghuiyuanjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 开通会员记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public class KaitonghuiyuanjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 折扣
	 */
	
	private String zhekou;
		
	/**
	 * 开通时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaitongshijian;
		
	/**
	 * 购买天数
	 */
	
	private Integer goumaitianshu;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 开通费用
	 */
	
	private String kaitongfeiyong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：折扣
	 */
	 
	public void setZhekou(String zhekou) {
		this.zhekou = zhekou;
	}
	
	/**
	 * 获取：折扣
	 */
	public String getZhekou() {
		return zhekou;
	}
				
	
	/**
	 * 设置：开通时间
	 */
	 
	public void setKaitongshijian(Date kaitongshijian) {
		this.kaitongshijian = kaitongshijian;
	}
	
	/**
	 * 获取：开通时间
	 */
	public Date getKaitongshijian() {
		return kaitongshijian;
	}
				
	
	/**
	 * 设置：购买天数
	 */
	 
	public void setGoumaitianshu(Integer goumaitianshu) {
		this.goumaitianshu = goumaitianshu;
	}
	
	/**
	 * 获取：购买天数
	 */
	public Integer getGoumaitianshu() {
		return goumaitianshu;
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
	 * 设置：开通费用
	 */
	 
	public void setKaitongfeiyong(String kaitongfeiyong) {
		this.kaitongfeiyong = kaitongfeiyong;
	}
	
	/**
	 * 获取：开通费用
	 */
	public String getKaitongfeiyong() {
		return kaitongfeiyong;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
