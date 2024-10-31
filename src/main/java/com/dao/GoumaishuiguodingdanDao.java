package com.dao;

import com.entity.GoumaishuiguodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaishuiguodingdanVO;
import com.entity.view.GoumaishuiguodingdanView;


/**
 * 购买水果订单
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface GoumaishuiguodingdanDao extends BaseMapper<GoumaishuiguodingdanEntity> {
	
	List<GoumaishuiguodingdanVO> selectListVO(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
	
	GoumaishuiguodingdanVO selectVO(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
	
	List<GoumaishuiguodingdanView> selectListView(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);

	List<GoumaishuiguodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
	
	GoumaishuiguodingdanView selectView(@Param("ew") Wrapper<GoumaishuiguodingdanEntity> wrapper);
	
}
