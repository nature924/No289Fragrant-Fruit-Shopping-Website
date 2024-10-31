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


import com.dao.KaitonghuiyuanjiluDao;
import com.entity.KaitonghuiyuanjiluEntity;
import com.service.KaitonghuiyuanjiluService;
import com.entity.vo.KaitonghuiyuanjiluVO;
import com.entity.view.KaitonghuiyuanjiluView;

@Service("kaitonghuiyuanjiluService")
public class KaitonghuiyuanjiluServiceImpl extends ServiceImpl<KaitonghuiyuanjiluDao, KaitonghuiyuanjiluEntity> implements KaitonghuiyuanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaitonghuiyuanjiluEntity> page = this.selectPage(
                new Query<KaitonghuiyuanjiluEntity>(params).getPage(),
                new EntityWrapper<KaitonghuiyuanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaitonghuiyuanjiluEntity> wrapper) {
		  Page<KaitonghuiyuanjiluView> page =new Query<KaitonghuiyuanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaitonghuiyuanjiluVO> selectListVO(Wrapper<KaitonghuiyuanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaitonghuiyuanjiluVO selectVO(Wrapper<KaitonghuiyuanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaitonghuiyuanjiluView> selectListView(Wrapper<KaitonghuiyuanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaitonghuiyuanjiluView selectView(Wrapper<KaitonghuiyuanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
