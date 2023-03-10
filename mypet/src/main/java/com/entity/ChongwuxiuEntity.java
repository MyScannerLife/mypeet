package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物秀
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-06 14:30:46
 */
@TableName("chongwuxiu")
public class ChongwuxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuxiuEntity() {
		
	}
	
	public ChongwuxiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宠物编号
	 */
					
	private String chongwubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物编号
	 */
	public void setChongwubianhao(String chongwubianhao) {
		this.chongwubianhao = chongwubianhao;
	}
	/**
	 * 获取：宠物编号
	 */
	public String getChongwubianhao() {
		return chongwubianhao;
	}
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
