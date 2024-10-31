package com.entity.view;

import com.entity.ShuiguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
@TableName("shuiguo")
public class ShuiguoView  extends ShuiguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguoView(){
	}
 
 	public ShuiguoView(ShuiguoEntity shuiguoEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
