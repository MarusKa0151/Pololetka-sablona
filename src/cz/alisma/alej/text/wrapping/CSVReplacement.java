package cz.alisma.alej.text.wrapping;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CSVReplacement {
	public static String CSVName = null; //could be undefined
	public static String TemplateName; //should be defined
	public static String OutputName = null; //could be undefined

	public static void main(String[] args) throws IOException {
		//input processing
		csvArguments(args);
		Scanner fileCSV;
		if (CSVName == null) {
			fileCSV = new Scanner(System.in);
		}
		else {
			fileCSV = new Scanner(new File(CSVName));
		}
		
		int templateNumber = 1;
		String[] varsNames = fileCSV.nextLine().split(",");
		
		//for each line
		while (fileCSV.hasNextLine()) {
			Scanner template = new Scanner(new File(TemplateName));
			Map<String, String> mapOfVarsAndValues = new HashMap<>();
			String[] valuesNames = fileCSV.nextLine().split(",");
			
			for (int i = 0; i < valuesNames.length; i++) {
				mapOfVarsAndValues.put(varsNames[i], valuesNames[i]);
			}
			
			String output;
			if (OutputName == null) {
				output = String.format("--out=templater-out-%05d.txt", templateNumber);
			}
			else {
				output = String.format(OutputName, templateNumber);
			}
			
			templateNumber++;
			//writing into file with FileWriter
			FileWriter outputFile = new FileWriter(new File(output));
			outputFile.write(Template.valuesReplaceVars(template, mapOfVarsAndValues));
			outputFile.close();
			template.close();			
		}
		
		fileCSV.close();		
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
}
