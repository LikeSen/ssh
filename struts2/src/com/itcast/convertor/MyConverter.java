package com.itcast.convertor;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;


public class MyConverter extends StrutsTypeConverter {

	
	DateFormat[] df = { new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd"),
			new SimpleDateFormat("yyyy年MM月dd日") };



	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {


		if (values == null || values.length == 0) {
			return null;
		}

		if (Date.class != toClass) {
			return null;
		}
		

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
	public String convertToString(Map context, Object o) {
		return null;
	}

}
