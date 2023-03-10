package com.entity.model;

import com.entity.ChongwuxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宠物秀
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
public class ChongwuxiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物名称
	 */
	
	private String chongwumingcheng;
		
	/**
	 * 宠物类型
	 */
	
	private String chongwuleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 宠物特征
	 */
	
	private String chongwutezheng;
		
	/**
	 * 健康状况
	 */
	
	private String jiankangzhuangkuang;
		
	/**
	 * 领养状况
	 */
	
	private String lingyangzhuangkuang;
		
	/**
	 * 宠物简介
	 */
	
	private String chongwujianjie;
				
	
	/**
	 * 设置：宠物名称
	 */
	 
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
				
	
	/**
	 * 设置：宠物类型
	 */
	 
	public void setChongwuleixing(String chongwuleixing) {
		this.chongwuleixing = chongwuleixing;
	}
	
	/**
	 * 获取：宠物类型
	 */
	public String getChongwuleixing() {
		return chongwuleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：宠物特征
	 */
	 
	public void setChongwutezheng(String chongwutezheng) {
		this.chongwutezheng = chongwutezheng;
	}
	
	/**
	 * 获取：宠物特征
	 */
	public String getChongwutezheng() {
		return chongwutezheng;
	}
				
	
	/**
	 * 设置：健康状况
	 */
	 
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
	}
				
	
	/**
	 * 设置：领养状况
	 */
	 
	public void setLingyangzhuangkuang(String lingyangzhuangkuang) {
		this.lingyangzhuangkuang = lingyangzhuangkuang;
	}
	
	/**
	 * 获取：领养状况
	 */
	public String getLingyangzhuangkuang() {
		return lingyangzhuangkuang;
	}
				
	
	/**
	 * 设置：宠物简介
	 */
	 
	public void setChongwujianjie(String chongwujianjie) {
		this.chongwujianjie = chongwujianjie;
	}
	
	/**
	 * 获取：宠物简介
	 */
	public String getChongwujianjie() {
		return chongwujianjie;
	}
			
}
