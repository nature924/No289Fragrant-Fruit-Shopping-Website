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


import com.dao.JifenduihuanjiluDao;
import com.entity.JifenduihuanjiluEntity;
import com.service.JifenduihuanjiluService;
import com.entity.vo.JifenduihuanjiluVO;
import com.entity.view.JifenduihuanjiluView;

@Service("jifenduihuanjiluService")
public class JifenduihuanjiluServiceImpl extends ServiceImpl<JifenduihuanjiluDao, JifenduihuanjiluEntity> implements JifenduihuanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenduihuanjiluEntity> page = this.selectPage(
                new Query<JifenduihuanjiluEntity>(params).getPage(),
                new EntityWrapper<JifenduihuanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenduihuanjiluEntity> wrapper) {
		  Page<JifenduihuanjiluView> page =new Query<JifenduihuanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenduihuanjiluVO> selectListVO(Wrapper<JifenduihuanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenduihuanjiluVO selectVO(Wrapper<JifenduihuanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenduihuanjiluView> selectListView(Wrapper<JifenduihuanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenduihuanjiluView selectView(Wrapper<JifenduihuanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
