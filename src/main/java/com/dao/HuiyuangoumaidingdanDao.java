package com.dao;

import com.entity.HuiyuangoumaidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuangoumaidingdanVO;
import com.entity.view.HuiyuangoumaidingdanView;


/**
 * 会员购买订单
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuangoumaidingdanDao extends BaseMapper<HuiyuangoumaidingdanEntity> {
	
	List<HuiyuangoumaidingdanVO> selectListVO(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
	
	HuiyuangoumaidingdanVO selectVO(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
	
	List<HuiyuangoumaidingdanView> selectListView(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);

	List<HuiyuangoumaidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
	
	HuiyuangoumaidingdanView selectView(@Param("ew") Wrapper<HuiyuangoumaidingdanEntity> wrapper);
	
}
