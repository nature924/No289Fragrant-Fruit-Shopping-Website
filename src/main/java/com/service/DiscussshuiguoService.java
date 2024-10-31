package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshuiguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshuiguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshuiguoView;


/**
 * 水果评论表
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface DiscussshuiguoService extends IService<DiscussshuiguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuiguoVO> selectListVO(Wrapper<DiscussshuiguoEntity> wrapper);
   	
   	DiscussshuiguoVO selectVO(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
   	
   	List<DiscussshuiguoView> selectListView(Wrapper<DiscussshuiguoEntity> wrapper);
   	
   	DiscussshuiguoView selectView(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshuiguoEntity> wrapper);
   	
}

