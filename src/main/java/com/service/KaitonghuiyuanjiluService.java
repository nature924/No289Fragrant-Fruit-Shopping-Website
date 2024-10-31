package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaitonghuiyuanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaitonghuiyuanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaitonghuiyuanjiluView;


/**
 * 开通会员记录
 *
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface KaitonghuiyuanjiluService extends IService<KaitonghuiyuanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaitonghuiyuanjiluVO> selectListVO(Wrapper<KaitonghuiyuanjiluEntity> wrapper);
   	
   	KaitonghuiyuanjiluVO selectVO(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
   	
   	List<KaitonghuiyuanjiluView> selectListView(Wrapper<KaitonghuiyuanjiluEntity> wrapper);
   	
   	KaitonghuiyuanjiluView selectView(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaitonghuiyuanjiluEntity> wrapper);
   	
}

