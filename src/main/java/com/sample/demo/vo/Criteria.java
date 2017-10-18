package com.sample.demo.vo;

import java.util.List;

public class Criteria {
	
	private String opt;
	private String keyword;
	private String phone;
	private List<Integer> depts;
	private List<String> jobId;
	private String minSalary;
	private String maxSalary;
	private String beginDate;
	private String endDate;
	

	
	public List<String> getJobId() {
		return jobId;
	}
	public void setJobId(List<String> jobId) {
		this.jobId = jobId;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}
	public String getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Integer> getDepts() {
		return depts;
	}
	public void setDepts(List<Integer> depts) {
		this.depts = depts;
	}
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
