package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaishuiguodingdanDao;
import com.entity.GoumaishuiguodingdanEntity;
import com.service.GoumaishuiguodingdanService;
import com.entity.vo.GoumaishuiguodingdanVO;
import com.entity.view.GoumaishuiguodingdanView;

@Service("goumaishuiguodingdanService")
public class GoumaishuiguodingdanServiceImpl extends ServiceImpl<GoumaishuiguodingdanDao, GoumaishuiguodingdanEntity> implements GoumaishuiguodingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaishuiguodingdanEntity> page = this.selectPage(
                new Query<GoumaishuiguodingdanEntity>(params).getPage(),
                new EntityWrapper<GoumaishuiguodingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaishuiguodingdanEntity> wrapper) {
		  Page<GoumaishuiguodingdanView> page =new Query<GoumaishuiguodingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaishuiguodingdanVO> selectListVO(Wrapper<GoumaishuiguodingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaishuiguodingdanVO selectVO(Wrapper<GoumaishuiguodingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaishuiguodingdanView> selectListView(Wrapper<GoumaishuiguodingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaishuiguodingdanView selectView(Wrapper<GoumaishuiguodingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
