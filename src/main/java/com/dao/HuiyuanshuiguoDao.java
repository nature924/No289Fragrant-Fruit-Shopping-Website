package com.dao;

import com.entity.HuiyuanshuiguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanshuiguoVO;
import com.entity.view.HuiyuanshuiguoView;


/**
 * 会员水果
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuanshuiguoDao extends BaseMapper<HuiyuanshuiguoEntity> {
	
	List<HuiyuanshuiguoVO> selectListVO(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
	
	HuiyuanshuiguoVO selectVO(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
	
	List<HuiyuanshuiguoView> selectListView(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);

	List<HuiyuanshuiguoView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
	
	HuiyuanshuiguoView selectView(@Param("ew") Wrapper<HuiyuanshuiguoEntity> wrapper);
	
}
