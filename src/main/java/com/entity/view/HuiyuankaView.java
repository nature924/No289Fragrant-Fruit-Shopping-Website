package com.entity.view;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
@TableName("huiyuanka")
public class HuiyuankaView  extends HuiyuankaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuankaView(){
	}
 
 	public HuiyuankaView(HuiyuankaEntity huiyuankaEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuankaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
