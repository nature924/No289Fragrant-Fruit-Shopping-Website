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


import com.dao.ShuiguoDao;
import com.entity.ShuiguoEntity;
import com.service.ShuiguoService;
import com.entity.vo.ShuiguoVO;
import com.entity.view.ShuiguoView;

@Service("shuiguoService")
public class ShuiguoServiceImpl extends ServiceImpl<ShuiguoDao, ShuiguoEntity> implements ShuiguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguoEntity> page = this.selectPage(
                new Query<ShuiguoEntity>(params).getPage(),
                new EntityWrapper<ShuiguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguoEntity> wrapper) {
		  Page<ShuiguoView> page =new Query<ShuiguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguoVO> selectListVO(Wrapper<ShuiguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguoVO selectVO(Wrapper<ShuiguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguoView> selectListView(Wrapper<ShuiguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguoView selectView(Wrapper<ShuiguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
