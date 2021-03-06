package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 年报变更记录
 * @version 1.0
 * @date Jun 18, 2007
 */
public class ReportChangeRecord {

	private Long id;
	
	private Long annualreportId;
	
	private String changeItem;
	
	private String contentBefore;
	
	private String contentAfter;
	
	private Date changeTime;
	
	private Date createtime;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAnnualreportId() {
		return this.annualreportId;
	}

	public void setAnnualreportId(Long annualreportId) {
		this.annualreportId = annualreportId;
	}
	
	public String getChangeItem() {
		return this.changeItem;
	}

	public void setChangeItem(String changeItem) {
		this.changeItem = changeItem;
	}
	
	public String getContentBefore() {
		return this.contentBefore;
	}

	public void setContentBefore(String contentBefore) {
		this.contentBefore = contentBefore;
	}
	
	public String getContentAfter() {
		return this.contentAfter;
	}

	public void setContentAfter(String contentAfter) {
		this.contentAfter = contentAfter;
	}
	
	public Date getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
