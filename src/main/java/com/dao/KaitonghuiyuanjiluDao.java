package com.dao;

import com.entity.KaitonghuiyuanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaitonghuiyuanjiluVO;
import com.entity.view.KaitonghuiyuanjiluView;


/**
 * 开通会员记录
 * 
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
public interface KaitonghuiyuanjiluDao extends BaseMapper<KaitonghuiyuanjiluEntity> {
	
	List<KaitonghuiyuanjiluVO> selectListVO(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
	
	KaitonghuiyuanjiluVO selectVO(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
	
	List<KaitonghuiyuanjiluView> selectListView(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);

	List<KaitonghuiyuanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
	
	KaitonghuiyuanjiluView selectView(@Param("ew") Wrapper<KaitonghuiyuanjiluEntity> wrapper);
	
}
