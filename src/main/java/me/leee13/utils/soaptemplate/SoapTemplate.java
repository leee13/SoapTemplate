package me.leee13.utils.soaptemplate;

import java.util.Map;

import me.leee13.utils.soaptemplate.chain.AssignChain;
import me.leee13.utils.soaptemplate.chain.Chain;
import me.leee13.utils.soaptemplate.chain.ValidateChain;

public class SoapTemplate {
	
	private final Chain processChain;
	
	private SoapTemplate(){
		processChain = new ValidateChain();
		processChain.setNextChain(new AssignChain());
	};
	
	private static class SoapTemplateHolder {
		private static SoapTemplate instance = new SoapTemplate();
	} 
	
	public static String  process(Map<String, ?> param, String template) throws Exception {
		String result = SoapTemplateHolder.instance.processChain.process(param, template);
		return result;
	}

}
