package com.dao;

import com.entity.ChongwuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuleixingVO;
import com.entity.view.ChongwuleixingView;


/**
 * 宠物类型
 * 
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
public interface ChongwuleixingDao extends BaseMapper<ChongwuleixingEntity> {
	
	List<ChongwuleixingVO> selectListVO(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
	
	ChongwuleixingVO selectVO(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
	
	List<ChongwuleixingView> selectListView(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);

	List<ChongwuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
	
	ChongwuleixingView selectView(@Param("ew") Wrapper<ChongwuleixingEntity> wrapper);
	

}
