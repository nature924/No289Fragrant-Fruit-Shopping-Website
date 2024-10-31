package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanshuiguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanshuiguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanshuiguoView;


/**
 * 会员水果
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuanshuiguoService extends IService<HuiyuanshuiguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanshuiguoVO> selectListVO(Wrapper<HuiyuanshuiguoEntity> wrapper);
   	
   	HuiyuanshuiguoVO selectVO(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
   	
   	List<HuiyuanshuiguoView> selectListView(Wrapper<HuiyuanshuiguoEntity> wrapper);
   	
   	HuiyuanshuiguoView selectView(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanshuiguoEntity> wrapper);
   	
}

