package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianjifenjiluEntity;
import com.entity.view.JianjifenjiluView;

import com.service.JianjifenjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 减积分记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-11 23:50:04
 */
@RestController
@RequestMapping("/jianjifenjilu")
public class JianjifenjiluController {
    @Autowired
    private JianjifenjiluService jianjifenjiluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianjifenjiluEntity jianjifenjilu,
		HttpServletRequest request){
        EntityWrapper<JianjifenjiluEntity> ew = new EntityWrapper<JianjifenjiluEntity>();
		PageUtils page = jianjifenjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianjifenjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianjifenjiluEntity jianjifenjilu, HttpServletRequest request){
        EntityWrapper<JianjifenjiluEntity> ew = new EntityWrapper<JianjifenjiluEntity>();
		PageUtils page = jianjifenjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianjifenjilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianjifenjiluEntity jianjifenjilu){
       	EntityWrapper<JianjifenjiluEntity> ew = new EntityWrapper<JianjifenjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianjifenjilu, "jianjifenjilu")); 
        return R.ok().put("data", jianjifenjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianjifenjiluEntity jianjifenjilu){
        EntityWrapper< JianjifenjiluEntity> ew = new EntityWrapper< JianjifenjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianjifenjilu, "jianjifenjilu")); 
		JianjifenjiluView jianjifenjiluView =  jianjifenjiluService.selectView(ew);
		return R.ok("查询减积分记录成功").put("data", jianjifenjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianjifenjiluEntity jianjifenjilu = jianjifenjiluService.selectById(id);
        return R.ok().put("data", jianjifenjilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianjifenjiluEntity jianjifenjilu = jianjifenjiluService.selectById(id);
        return R.ok().put("data", jianjifenjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianjifenjiluEntity jianjifenjilu, HttpServletRequest request){
    	jianjifenjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianjifenjilu);
        jianjifenjiluService.insert(jianjifenjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianjifenjiluEntity jianjifenjilu, HttpServletRequest request){
    	jianjifenjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianjifenjilu);
        jianjifenjiluService.insert(jianjifenjilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianjifenjiluEntity jianjifenjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianjifenjilu);
        jianjifenjiluService.updateById(jianjifenjilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianjifenjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JianjifenjiluEntity> wrapper = new EntityWrapper<JianjifenjiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jianjifenjiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
