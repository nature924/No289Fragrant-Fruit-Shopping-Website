package com.dao;

import com.entity.HuiyuankaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuankaVO;
import com.entity.view.HuiyuankaView;


/**
 * 会员卡
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface HuiyuankaDao extends BaseMapper<HuiyuankaEntity> {
	
	List<HuiyuankaVO> selectListVO(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
	
	HuiyuankaVO selectVO(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
	
	List<HuiyuankaView> selectListView(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);

	List<HuiyuankaView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
	
	HuiyuankaView selectView(@Param("ew") Wrapper<HuiyuankaEntity> wrapper);
	
}
