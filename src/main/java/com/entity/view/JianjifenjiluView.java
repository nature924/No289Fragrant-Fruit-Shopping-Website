package com.entity.view;

import com.entity.JianjifenjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 减积分记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
@TableName("jianjifenjilu")
public class JianjifenjiluView  extends JianjifenjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianjifenjiluView(){
	}
 
 	public JianjifenjiluView(JianjifenjiluEntity jianjifenjiluEntity){
 	try {
			BeanUtils.copyProperties(this, jianjifenjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
