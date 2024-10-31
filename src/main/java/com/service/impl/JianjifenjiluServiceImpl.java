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


import com.dao.JianjifenjiluDao;
import com.entity.JianjifenjiluEntity;
import com.service.JianjifenjiluService;
import com.entity.vo.JianjifenjiluVO;
import com.entity.view.JianjifenjiluView;

@Service("jianjifenjiluService")
public class JianjifenjiluServiceImpl extends ServiceImpl<JianjifenjiluDao, JianjifenjiluEntity> implements JianjifenjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianjifenjiluEntity> page = this.selectPage(
                new Query<JianjifenjiluEntity>(params).getPage(),
                new EntityWrapper<JianjifenjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianjifenjiluEntity> wrapper) {
		  Page<JianjifenjiluView> page =new Query<JianjifenjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianjifenjiluVO> selectListVO(Wrapper<JianjifenjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianjifenjiluVO selectVO(Wrapper<JianjifenjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianjifenjiluView> selectListView(Wrapper<JianjifenjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianjifenjiluView selectView(Wrapper<JianjifenjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
