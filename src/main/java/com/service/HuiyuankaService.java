package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuankaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuankaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuankaView;


/**
 * 会员卡
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuankaService extends IService<HuiyuankaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuankaVO> selectListVO(Wrapper<HuiyuankaEntity> wrapper);
   	
   	HuiyuankaVO selectVO(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
   	
   	List<HuiyuankaView> selectListView(Wrapper<HuiyuankaEntity> wrapper);
   	
   	HuiyuankaView selectView(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuankaEntity> wrapper);
   	
}

