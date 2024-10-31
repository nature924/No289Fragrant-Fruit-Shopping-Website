package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 水果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
@TableName("shuiguo")
public class ShuiguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuiguoEntity() {
		
	}
	
	public ShuiguoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 水果编号
	 */
					
	private String shuiguobianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
