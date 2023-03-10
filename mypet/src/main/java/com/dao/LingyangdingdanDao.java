package com.dao;

import com.entity.LingyangdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangdingdanVO;
import com.entity.view.LingyangdingdanView;


/**
 * 领养订单
 * 
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
public interface LingyangdingdanDao extends BaseMapper<LingyangdingdanEntity> {
	
	List<LingyangdingdanVO> selectListVO(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
	
	LingyangdingdanVO selectVO(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
	
	List<LingyangdingdanView> selectListView(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);

	List<LingyangdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
	
	LingyangdingdanView selectView(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
	

}
