package com.dao;

import com.entity.JiajifenjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajifenjiluVO;
import com.entity.view.JiajifenjiluView;


/**
 * 加积分记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface JiajifenjiluDao extends BaseMapper<JiajifenjiluEntity> {
	
	List<JiajifenjiluVO> selectListVO(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
	
	JiajifenjiluVO selectVO(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
	
	List<JiajifenjiluView> selectListView(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);

	List<JiajifenjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
	
	JiajifenjiluView selectView(@Param("ew") Wrapper<JiajifenjiluEntity> wrapper);
	
}
