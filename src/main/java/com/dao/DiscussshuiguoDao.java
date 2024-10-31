package com.dao;

import com.entity.DiscussshuiguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshuiguoVO;
import com.entity.view.DiscussshuiguoView;


/**
 * 水果评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface DiscussshuiguoDao extends BaseMapper<DiscussshuiguoEntity> {
	
	List<DiscussshuiguoVO> selectListVO(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
	
	DiscussshuiguoVO selectVO(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
	
	List<DiscussshuiguoView> selectListView(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);

	List<DiscussshuiguoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
	
	DiscussshuiguoView selectView(@Param("ew") Wrapper<DiscussshuiguoEntity> wrapper);
	
}
