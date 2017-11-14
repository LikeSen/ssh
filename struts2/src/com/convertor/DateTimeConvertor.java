package com.convertor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;


public class DateTimeConvertor extends StrutsTypeConverter {

	private DateFormat[] df = { new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd"),
			new SimpleDateFormat("yy-MM-dd"), };

	private DateFormat[] timeFormat = { new SimpleDateFormat("HH:mm:ssss"),
			new SimpleDateFormat("HH:mm"), };

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// 判断: 内容不能为空
				if (values == null || values.length == 0) {
					return null;
				}
				// 判断类型必须为Date
				if (Date.class != toClass) {
					return null;
				}
				
				// 迭代：转换失败继续下一个格式的转换； 转换成功就直接返回
				for (int i=0; i<df.length; i++) {
					try {
						return df[i].parse(values[0]);
					} catch (ParseException e) {
						continue;
					}
				}
				return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return null;
	}

	
}

