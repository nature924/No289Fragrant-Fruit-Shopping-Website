package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenduihuanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenduihuanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenduihuanjiluView;


/**
 * 积分兑换记录
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JifenduihuanjiluService extends IService<JifenduihuanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenduihuanjiluVO> selectListVO(Wrapper<JifenduihuanjiluEntity> wrapper);
   	
   	JifenduihuanjiluVO selectVO(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
   	
   	List<JifenduihuanjiluView> selectListView(Wrapper<JifenduihuanjiluEntity> wrapper);
   	
   	JifenduihuanjiluView selectView(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenduihuanjiluEntity> wrapper);
   	
}

