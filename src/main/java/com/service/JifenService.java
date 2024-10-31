package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenView;


/**
 * 积分
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JifenService extends IService<JifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenVO> selectListVO(Wrapper<JifenEntity> wrapper);
   	
   	JifenVO selectVO(@Param("ew") Wrapper<JifenEntity> wrapper);
   	
   	List<JifenView> selectListView(Wrapper<JifenEntity> wrapper);
   	
   	JifenView selectView(@Param("ew") Wrapper<JifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenEntity> wrapper);
   	
}

