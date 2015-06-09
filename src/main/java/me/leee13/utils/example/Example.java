package me.leee13.utils.example;

import java.util.HashMap;
import java.util.Map;

import me.leee13.utils.soaptemplate.SoapTemplate;

public class Example {

	public static void main(String[] args) {
		
		Map<String, String> param = new HashMap<>();
		param.put("aaa", "1111");
		param.put("bbb", "2222");
		
		String soapTemplate = "<a>${aaa}</a><b>${bbb}</b>";
		
		try {
			
			String soap = SoapTemplate.process(param, soapTemplate);
			
			System.out.println(soap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}
