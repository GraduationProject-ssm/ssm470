package com.entity.vo;

import com.entity.KaoshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考试成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-28 12:09:06
 */
public class KaoshichengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学员姓名
	 */
	
	private String xueyuanxingming;
		
	/**
	 * 考试项目
	 */
	
	private String kaoshixiangmu;
		
	/**
	 * 考试时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoshishijian;
		
	/**
	 * 考试成绩
	 */
	
	private Float kaoshichengji;
		
	/**
	 * 考试结果
	 */
	
	private String kaoshijieguo;
				
	
	/**
	 * 设置：学员姓名
	 */
	 
	public void setXueyuanxingming(String xueyuanxingming) {
		this.xueyuanxingming = xueyuanxingming;
	}
	
	/**
	 * 获取：学员姓名
	 */
	public String getXueyuanxingming() {
		return xueyuanxingming;
	}
				
	
	/**
	 * 设置：考试项目
	 */
	 
	public void setKaoshixiangmu(String kaoshixiangmu) {
		this.kaoshixiangmu = kaoshixiangmu;
	}
	
	/**
	 * 获取：考试项目
	 */
	public String getKaoshixiangmu() {
		return kaoshixiangmu;
	}
				
	
	/**
	 * 设置：考试时间
	 */
	 
	public void setKaoshishijian(Date kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	
	/**
	 * 获取：考试时间
	 */
	public Date getKaoshishijian() {
		return kaoshishijian;
	}
				
	
	/**
	 * 设置：考试成绩
	 */
	 
	public void setKaoshichengji(Float kaoshichengji) {
		this.kaoshichengji = kaoshichengji;
	}
	
	/**
	 * 获取：考试成绩
	 */
	public Float getKaoshichengji() {
		return kaoshichengji;
	}
				
	
	/**
	 * 设置：考试结果
	 */
	 
	public void setKaoshijieguo(String kaoshijieguo) {
		this.kaoshijieguo = kaoshijieguo;
	}
	
	/**
	 * 获取：考试结果
	 */
	public String getKaoshijieguo() {
		return kaoshijieguo;
	}
			
}
