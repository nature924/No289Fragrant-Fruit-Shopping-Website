package com.dao;

import com.entity.JianjifenjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianjifenjiluVO;
import com.entity.view.JianjifenjiluView;


/**
 * 减积分记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JianjifenjiluDao extends BaseMapper<JianjifenjiluEntity> {
	
	List<JianjifenjiluVO> selectListVO(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
	
	JianjifenjiluVO selectVO(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
	
	List<JianjifenjiluView> selectListView(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);

	List<JianjifenjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
	
	JianjifenjiluView selectView(@Param("ew") Wrapper<JianjifenjiluEntity> wrapper);
	
}
