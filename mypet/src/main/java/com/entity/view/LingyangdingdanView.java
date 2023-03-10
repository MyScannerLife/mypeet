package com.entity.view;

import com.entity.LingyangdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领养订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
@TableName("lingyangdingdan")
public class LingyangdingdanView  extends LingyangdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyangdingdanView(){
	}
 
 	public LingyangdingdanView(LingyangdingdanEntity lingyangdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, lingyangdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
