package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 经营异常
 * @version 1.0
 * @date Jun 18, 2007
 */
public class CompanyAbnormalInfo {

	private Long id;
	
	private Long companyId;
	
	private String putReason;
	
	private Date putDate;
	
	private String putDepartment;
	
	private String removeReason;
	
	private Date removeDate;
	
	private String removeDepartment;
	
	private Date createtime;
	
	private int deleted;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	public String getPutReason() {
		return this.putReason;
	}

	public void setPutReason(String putReason) {
		this.putReason = putReason;
	}
	
	public Date getPutDate() {
		return this.putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	
	public String getPutDepartment() {
		return this.putDepartment;
	}

	public void setPutDepartment(String putDepartment) {
		this.putDepartment = putDepartment;
	}
	
	public String getRemoveReason() {
		return this.removeReason;
	}

	public void setRemoveReason(String removeReason) {
		this.removeReason = removeReason;
	}
	
	public Date getRemoveDate() {
		return this.removeDate;
	}

	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
	}
	
	public String getRemoveDepartment() {
		return this.removeDepartment;
	}

	public void setRemoveDepartment(String removeDepartment) {
		this.removeDepartment = removeDepartment;
	}
	
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	public int getDeleted() {
		return this.deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
}
