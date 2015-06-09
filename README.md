# SoapTemplate
SoapTemplate is a template engine for soap-message.


example:

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
		
		
result:

		<a>1111</a><b>2222</b>