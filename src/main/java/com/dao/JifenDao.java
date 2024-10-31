package com.dao;

import com.entity.JifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenVO;
import com.entity.view.JifenView;


/**
 * 积分
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JifenDao extends BaseMapper<JifenEntity> {
	
	List<JifenVO> selectListVO(@Param("ew") Wrapper<JifenEntity> wrapper);
	
	JifenVO selectVO(@Param("ew") Wrapper<JifenEntity> wrapper);
	
	List<JifenView> selectListView(@Param("ew") Wrapper<JifenEntity> wrapper);

	List<JifenView> selectListView(Pagination page,@Param("ew") Wrapper<JifenEntity> wrapper);
	
	JifenView selectView(@Param("ew") Wrapper<JifenEntity> wrapper);
	
}
