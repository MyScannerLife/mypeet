package com.dao;

import com.entity.ShenqinglingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqinglingyangVO;
import com.entity.view.ShenqinglingyangView;


/**
 * 申请领养
 * 
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
public interface ShenqinglingyangDao extends BaseMapper<ShenqinglingyangEntity> {
	
	List<ShenqinglingyangVO> selectListVO(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
	
	ShenqinglingyangVO selectVO(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
	
	List<ShenqinglingyangView> selectListView(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);

	List<ShenqinglingyangView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
	
	ShenqinglingyangView selectView(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
	

}
