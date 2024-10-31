package com.dao;

import com.entity.ShuiguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguoVO;
import com.entity.view.ShuiguoView;


/**
 * 水果
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface ShuiguoDao extends BaseMapper<ShuiguoEntity> {
	
	List<ShuiguoVO> selectListVO(@Param("ew") Wrapper<ShuiguoEntity> wrapper);
	
	ShuiguoVO selectVO(@Param("ew") Wrapper<ShuiguoEntity> wrapper);
	
	List<ShuiguoView> selectListView(@Param("ew") Wrapper<ShuiguoEntity> wrapper);

	List<ShuiguoView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguoEntity> wrapper);
	
	ShuiguoView selectView(@Param("ew") Wrapper<ShuiguoEntity> wrapper);
	
}
