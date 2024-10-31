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


import com.dao.JiajifenjiluDao;
import com.entity.JiajifenjiluEntity;
import com.service.JiajifenjiluService;
import com.entity.vo.JiajifenjiluVO;
import com.entity.view.JiajifenjiluView;

@Service("jiajifenjiluService")
public class JiajifenjiluServiceImpl extends ServiceImpl<JiajifenjiluDao, JiajifenjiluEntity> implements JiajifenjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiajifenjiluEntity> page = this.selectPage(
                new Query<JiajifenjiluEntity>(params).getPage(),
                new EntityWrapper<JiajifenjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiajifenjiluEntity> wrapper) {
		  Page<JiajifenjiluView> page =new Query<JiajifenjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiajifenjiluVO> selectListVO(Wrapper<JiajifenjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiajifenjiluVO selectVO(Wrapper<JiajifenjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiajifenjiluView> selectListView(Wrapper<JiajifenjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiajifenjiluView selectView(Wrapper<JiajifenjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
