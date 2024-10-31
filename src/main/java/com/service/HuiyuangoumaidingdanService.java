package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuangoumaidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuangoumaidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuangoumaidingdanView;


/**
 * 会员购买订单
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuangoumaidingdanService extends IService<HuiyuangoumaidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuangoumaidingdanVO> selectListVO(Wrapper<HuiyuangoumaidingdanEntity> wrapper);
   	
   	HuiyuangoumaidingdanVO selectVO(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
   	
   	List<HuiyuangoumaidingdanView> selectListView(Wrapper<HuiyuangoumaidingdanEntity> wrapper);
   	
   	HuiyuangoumaidingdanView selectView(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuangoumaidingdanEntity> wrapper);
   	
}

