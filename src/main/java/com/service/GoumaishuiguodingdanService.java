package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaishuiguodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaishuiguodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaishuiguodingdanView;


/**
 * 购买水果订单
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface GoumaishuiguodingdanService extends IService<GoumaishuiguodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaishuiguodingdanVO> selectListVO(Wrapper<GoumaishuiguodingdanEntity> wrapper);
   	
   	GoumaishuiguodingdanVO selectVO(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
   	
   	List<GoumaishuiguodingdanView> selectListView(Wrapper<GoumaishuiguodingdanEntity> wrapper);
   	
   	GoumaishuiguodingdanView selectView(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaishuiguodingdanEntity> wrapper);
   	
}

