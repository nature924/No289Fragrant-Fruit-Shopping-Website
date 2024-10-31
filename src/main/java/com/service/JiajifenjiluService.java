package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajifenjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajifenjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajifenjiluView;


/**
 * 加积分记录
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JiajifenjiluService extends IService<JiajifenjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajifenjiluVO> selectListVO(Wrapper<JiajifenjiluEntity> wrapper);
   	
   	JiajifenjiluVO selectVO(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
   	
   	List<JiajifenjiluView> selectListView(Wrapper<JiajifenjiluEntity> wrapper);
   	
   	JiajifenjiluView selectView(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajifenjiluEntity> wrapper);
   	
}

