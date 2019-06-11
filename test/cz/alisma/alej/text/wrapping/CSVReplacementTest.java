package cz.alisma.alej.text.wrapping;

import static org.junit.Assert.*;
import org.junit.Test;

public class CSVReplacementTest {
	
	@Test
	public void CSVname() {
		String[] args = {"--csv=data.csv", "--template=email.tpl", "--out=templater-out-%05d.txt"};
		CSVReplacement.csvArguments(args);
		
		assertEquals("data.csv", CSVReplacement.CSVName);
	}
	
	@Test
	public void TemplateName() {
		String[] args = {"--csv=data.csv", "--template=email.tpl", "--out=templater-out-%05d.txt"};
		CSVReplacement.csvArguments(args);
		
		assertEquals("email.tpl", CSVReplacement.TemplateName);
	}
	
	@Test
	public void OutputName() {
		String[] args = {"--csv=data.csv", "--template=email.tpl", "--out=templater-out-%05d.txt"};
		CSVReplacement.csvArguments(args);
		
		assertEquals("templater-out-%05d.txt", CSVReplacement.OutputName);
	}
	
	//tbd!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test
	public void oneCustomer() {
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
