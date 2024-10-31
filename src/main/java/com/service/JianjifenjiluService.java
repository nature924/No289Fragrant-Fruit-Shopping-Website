package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianjifenjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianjifenjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianjifenjiluView;


/**
 * 减积分记录
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JianjifenjiluService extends IService<JianjifenjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianjifenjiluVO> selectListVO(Wrapper<JianjifenjiluEntity> wrapper);
   	
   	JianjifenjiluVO selectVO(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
   	
   	List<JianjifenjiluView> selectListView(Wrapper<JianjifenjiluEntity> wrapper);
   	
   	JianjifenjiluView selectView(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianjifenjiluEntity> wrapper);
   	
}

