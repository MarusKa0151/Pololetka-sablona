package cz.alisma.alej.text.wrapping;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CSVReplacement {
	public static String CSVName = null;
	public static String TemplateName;
	public static String OutputName = null;

	public static void main(String[] args) throws IOException {
		csvArguments(args);
		Scanner vars;
		if (CSVName == null) {
			vars = new Scanner(System.in);
			vars.close(); //lets try if it would work here
		}
		else {
			vars = new Scanner(new File(CSVName));
		}
		
		
		
		
		String outputFile;
		
		if (OutputName == null) {
			outputFile = String.format("--out=templater-out-%05d.txt", 0); //replace the 0 with sth
		}
		else {
			String name = OutputName; //tbd
		}
		
	}
	
	public static void csvArguments(String[] args) {
		for (String arg : args) {
			if (arg.startsWith("--csv=")) {
				CSVName = arg.substring(6);
			}
			else if (arg.startsWith("--template=")) {
				TemplateName = arg.substring(11);
			}
			else if (arg.startsWith("--out=")) {
				OutputName = arg.substring(6);
			}
		}
	}
	
	public static Map<String, String> mapOfVarsAndValues() {
		Map<String, String> map = new HashMap<>();
		
		return map;
	}

}
