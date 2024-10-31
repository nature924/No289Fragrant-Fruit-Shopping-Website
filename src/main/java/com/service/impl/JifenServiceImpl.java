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


import com.dao.JifenDao;
import com.entity.JifenEntity;
import com.service.JifenService;
import com.entity.vo.JifenVO;
import com.entity.view.JifenView;

@Service("jifenService")
public class JifenServiceImpl extends ServiceImpl<JifenDao, JifenEntity> implements JifenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenEntity> page = this.selectPage(
                new Query<JifenEntity>(params).getPage(),
                new EntityWrapper<JifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenEntity> wrapper) {
		  Page<JifenView> page =new Query<JifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenVO> selectListVO(Wrapper<JifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenVO selectVO(Wrapper<JifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenView> selectListView(Wrapper<JifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenView selectView(Wrapper<JifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
