package com.dao;

import com.entity.JifenduihuanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenduihuanjiluVO;
import com.entity.view.JifenduihuanjiluView;


/**
 * 积分兑换记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JifenduihuanjiluDao extends BaseMapper<JifenduihuanjiluEntity> {
	
	List<JifenduihuanjiluVO> selectListVO(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
	
	JifenduihuanjiluVO selectVO(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
	
	List<JifenduihuanjiluView> selectListView(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);

	List<JifenduihuanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
	
	JifenduihuanjiluView selectView(@Param("ew") Wrapper<JifenduihuanjiluEntity> wrapper);
	
}
