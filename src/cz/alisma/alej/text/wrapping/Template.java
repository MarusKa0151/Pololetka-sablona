package cz.alisma.alej.text.wrapping;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Template {
		
	public static String valuesReplaceVars(Scanner template, Map<String, String> vars) {
		//using Patterns and Matches, learned from https://www.tutorialspoint.com/java/java_regular_expressions.htm
		StringBuilder output = new StringBuilder();
		Pattern recognizeVars = Pattern.compile("\\{\\{ [\\w ]+ \\}\\}"); //searching for {{ variable }}
		//idk why i should use [] in this but then the spaceInVariable test started working...
		
		while (template.hasNextLine()) {
			String line = template.nextLine();
			Matcher matcher = recognizeVars.matcher(line);
			
			while (matcher.find()) {
				String varName = getVarName(matcher.group(0)); //group(0) is special, represents the entire expression
				String varValue = vars.get(varName);
				
				line = matcher.replaceFirst(varValue);
				matcher = recognizeVars.matcher(line);
			}
			if (template.hasNextLine()) {
				output.append(String.format("%s\n", line));
			}
			else {
				output.append(line); //without the last empty line
			}
		}	
		
		return output.toString();
	}
	
	public static String getVarName(String varFromMatcher) {
		String correctVarName = varFromMatcher.substring(3, varFromMatcher.length() - 3);
		return correctVarName;
	}
	
	
}
