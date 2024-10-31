package com.entity.model;

import com.entity.HuiyuangoumaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员购买订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public class HuiyuangoumaidingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 水果编号
	 */
	
	private String shuiguobianhao;
		
	/**
	 * 水果名称
	 */
	
	private String shuiguomingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 会员等级
	 */
	
	private String huiyuandengji;
		
	/**
	 * 折扣
	 */
	
	private Float zhekou;
		
	/**
	 * 总金额
	 */
	
	private String zongjine;
		
	/**
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 收货人
	 */
	
	private String shouhuoren;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
		
	/**
	 * 收货人电话
	 */
	
	private String shouhuorendianhua;
		
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
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
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：会员等级
	 */
	 
	public void setHuiyuandengji(String huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	
	/**
	 * 获取：会员等级
	 */
	public String getHuiyuandengji() {
		return huiyuandengji;
	}
				
	
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
	 * 设置：总金额
	 */
	 
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：收货人
	 */
	 
	public void setShouhuoren(String shouhuoren) {
		this.shouhuoren = shouhuoren;
	}
	
	/**
	 * 获取：收货人
	 */
	public String getShouhuoren() {
		return shouhuoren;
	}
				
	
	/**
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
				
	
	/**
	 * 设置：收货人电话
	 */
	 
	public void setShouhuorendianhua(String shouhuorendianhua) {
		this.shouhuorendianhua = shouhuorendianhua;
	}
	
	/**
	 * 获取：收货人电话
	 */
	public String getShouhuorendianhua() {
		return shouhuorendianhua;
	}
				
	
	/**
	 * 设置：会员账号
	 */
	 
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
				
	
	/**
	 * 设置：会员姓名
	 */
	 
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
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
