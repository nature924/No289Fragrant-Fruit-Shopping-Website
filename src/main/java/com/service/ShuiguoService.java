package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguoView;


/**
 * 水果
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface ShuiguoService extends IService<ShuiguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguoVO> selectListVO(Wrapper<ShuiguoEntity> wrapper);
   	
   	ShuiguoVO selectVO(@Param("ew") Wrapper<ShuiguoEntity> wrapper);
   	
   	List<ShuiguoView> selectListView(Wrapper<ShuiguoEntity> wrapper);
   	
   	ShuiguoView selectView(@Param("ew") Wrapper<ShuiguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguoEntity> wrapper);
   	
}

