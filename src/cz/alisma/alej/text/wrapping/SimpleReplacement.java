package cz.alisma.alej.text.wrapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleReplacement {

	public static void main(String[] args) {
		//input
		Map<String, String> mapOfVarsAndValues = createMapOfVarsAndValues(args);
		Scanner template = new Scanner(System.in);
		
		//output
		System.out.println(Template.valuesReplaceVars(template, mapOfVarsAndValues));
		template.close();
	}
	
	public static Map<String, String> createMapOfVarsAndValues(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		for (String arg : args) {
			if (arg.startsWith("--var=")) {
				String newArg = arg.substring(6);
				String[] parts = newArg.split("=");
				map.put(parts[0], parts[1]); 
			}
		}
		return map;
	}

}
