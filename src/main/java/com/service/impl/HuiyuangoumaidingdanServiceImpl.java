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


import com.dao.HuiyuangoumaidingdanDao;
import com.entity.HuiyuangoumaidingdanEntity;
import com.service.HuiyuangoumaidingdanService;
import com.entity.vo.HuiyuangoumaidingdanVO;
import com.entity.view.HuiyuangoumaidingdanView;

@Service("huiyuangoumaidingdanService")
public class HuiyuangoumaidingdanServiceImpl extends ServiceImpl<HuiyuangoumaidingdanDao, HuiyuangoumaidingdanEntity> implements HuiyuangoumaidingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuangoumaidingdanEntity> page = this.selectPage(
                new Query<HuiyuangoumaidingdanEntity>(params).getPage(),
                new EntityWrapper<HuiyuangoumaidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuangoumaidingdanEntity> wrapper) {
		  Page<HuiyuangoumaidingdanView> page =new Query<HuiyuangoumaidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuangoumaidingdanVO> selectListVO(Wrapper<HuiyuangoumaidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuangoumaidingdanVO selectVO(Wrapper<HuiyuangoumaidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuangoumaidingdanView> selectListView(Wrapper<HuiyuangoumaidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuangoumaidingdanView selectView(Wrapper<HuiyuangoumaidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
