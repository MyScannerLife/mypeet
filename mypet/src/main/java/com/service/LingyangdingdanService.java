package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangdingdanView;


/**
 * 领养订单
 *
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
public interface LingyangdingdanService extends IService<LingyangdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangdingdanVO> selectListVO(Wrapper<LingyangdingdanEntity> wrapper);
   	
   	LingyangdingdanVO selectVO(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
   	
   	List<LingyangdingdanView> selectListView(Wrapper<LingyangdingdanEntity> wrapper);
   	
   	LingyangdingdanView selectView(@Param("ew") Wrapper<LingyangdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangdingdanEntity> wrapper);
   	

}

