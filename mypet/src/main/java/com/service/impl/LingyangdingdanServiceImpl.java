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


import com.dao.LingyangdingdanDao;
import com.entity.LingyangdingdanEntity;
import com.service.LingyangdingdanService;
import com.entity.vo.LingyangdingdanVO;
import com.entity.view.LingyangdingdanView;

@Service("lingyangdingdanService")
public class LingyangdingdanServiceImpl extends ServiceImpl<LingyangdingdanDao, LingyangdingdanEntity> implements LingyangdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangdingdanEntity> page = this.selectPage(
                new Query<LingyangdingdanEntity>(params).getPage(),
                new EntityWrapper<LingyangdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangdingdanEntity> wrapper) {
		  Page<LingyangdingdanView> page =new Query<LingyangdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangdingdanVO> selectListVO(Wrapper<LingyangdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangdingdanVO selectVO(Wrapper<LingyangdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangdingdanView> selectListView(Wrapper<LingyangdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangdingdanView selectView(Wrapper<LingyangdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
