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


import com.dao.DiscussshuiguoDao;
import com.entity.DiscussshuiguoEntity;
import com.service.DiscussshuiguoService;
import com.entity.vo.DiscussshuiguoVO;
import com.entity.view.DiscussshuiguoView;

@Service("discussshuiguoService")
public class DiscussshuiguoServiceImpl extends ServiceImpl<DiscussshuiguoDao, DiscussshuiguoEntity> implements DiscussshuiguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshuiguoEntity> page = this.selectPage(
                new Query<DiscussshuiguoEntity>(params).getPage(),
                new EntityWrapper<DiscussshuiguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuiguoEntity> wrapper) {
		  Page<DiscussshuiguoView> page =new Query<DiscussshuiguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshuiguoVO> selectListVO(Wrapper<DiscussshuiguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshuiguoVO selectVO(Wrapper<DiscussshuiguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshuiguoView> selectListView(Wrapper<DiscussshuiguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshuiguoView selectView(Wrapper<DiscussshuiguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
