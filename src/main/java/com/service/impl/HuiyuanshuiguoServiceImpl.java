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


import com.dao.HuiyuanshuiguoDao;
import com.entity.HuiyuanshuiguoEntity;
import com.service.HuiyuanshuiguoService;
import com.entity.vo.HuiyuanshuiguoVO;
import com.entity.view.HuiyuanshuiguoView;

@Service("huiyuanshuiguoService")
public class HuiyuanshuiguoServiceImpl extends ServiceImpl<HuiyuanshuiguoDao, HuiyuanshuiguoEntity> implements HuiyuanshuiguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanshuiguoEntity> page = this.selectPage(
                new Query<HuiyuanshuiguoEntity>(params).getPage(),
                new EntityWrapper<HuiyuanshuiguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanshuiguoEntity> wrapper) {
		  Page<HuiyuanshuiguoView> page =new Query<HuiyuanshuiguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanshuiguoVO> selectListVO(Wrapper<HuiyuanshuiguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanshuiguoVO selectVO(Wrapper<HuiyuanshuiguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanshuiguoView> selectListView(Wrapper<HuiyuanshuiguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanshuiguoView selectView(Wrapper<HuiyuanshuiguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
