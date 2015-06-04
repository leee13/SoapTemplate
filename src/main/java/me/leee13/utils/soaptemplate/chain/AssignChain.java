package me.leee13.utils.soaptemplate.chain;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignChain extends Chain {
	
	private static final Pattern pattern = Pattern.compile("\\$\\{([a-zA-Z0-9]*)\\}");

	@Override
	protected String doProcess(Map<String, ?> param, String template)
			throws Exception {
		
		StringBuffer sb = new StringBuffer();
		
		Matcher m = pattern.matcher(template);
		
		while (m.find()) {
			m.appendReplacement(sb, param.get(m.group(1)).toString());
		}
		
		m.appendTail(sb);
		
		return sb.toString();
	}

}
