package com.fileupload;

import java.io.File;

import org.apache.struts.chain.contexts.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	// 对应表单：<input type="file" name="file1">
	private File file1;
	//文件名
	private String file1FileName;
	//文件类型
	private String file1ContextType;
	
	//setxx方法
	public void setFile1(File file1) {
		this.file1 = file1;
	}
	public void setFile1FileName(String file1FileName) {
		this.file1FileName = file1FileName;
	}
	public void setFile1ContextType(String file1ContextType) {
		this.file1ContextType = file1ContextType;
	}




}
