package me.leee13.utils.soaptemplate.chain;

import java.util.Map;

public abstract class Chain {
	
	private Chain nextChain = null; 
	
	public String process(Map<String, ?> param, String template) throws Exception{
		
		String result = doProcess(param, template);
		
		if (null != nextChain) {
			result = nextChain.process(param, result);
		}
		
		return result;
	};
	
	protected abstract String doProcess(Map<String, ?> param, String template) throws Exception;

	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

}
