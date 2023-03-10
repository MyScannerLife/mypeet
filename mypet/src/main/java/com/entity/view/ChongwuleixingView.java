package com.entity.view;

import com.entity.ChongwuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
@TableName("chongwuleixing")
public class ChongwuleixingView  extends ChongwuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuleixingView(){
	}
 
 	public ChongwuleixingView(ChongwuleixingEntity chongwuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
