package com.convertor;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ConvertorAction extends ActionSupport{
	private static final long serialVersionUID = -122055988813768554L;
	private Date utilDate;
	
	public String execute(){
		return "input";
		
	}
	
	public String convert(){
		System.out.println(utilDate);
		return "success";
	}


	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}
	
	
}