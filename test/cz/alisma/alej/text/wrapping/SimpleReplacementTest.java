package cz.alisma.alej.text.wrapping;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Map;
import java.util.Scanner;

//the feeling when you made more mistakes writing this testing program than writing the original program --__--
public class SimpleReplacementTest {

	@Test
	public void nothing() {
		Scanner template = new Scanner("Something where is no var.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[0]);
		
		assertEquals("Something where is no var.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void oneVariable() {
		Scanner template = new Scanner("Our customer is {{ customer }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=customer=Ferda"});
		
		assertEquals("Our customer is Ferda.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void spaceInVariable() {
		Scanner template = new Scanner("Our best customer is {{ best customer }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=best customer=Ferda"});
		
		assertEquals("Our best customer is Ferda.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void spaceInValue() {
		Scanner template = new Scanner("Our customer is {{ customer }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=customer=Ferda the Ant"});
		
		assertEquals("Our customer is Ferda the Ant.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void twoVariables() {
		Scanner template = new Scanner("Our customers are {{ customerA }} and {{ customerB }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=customerA=Ferda", "--var=customerB=Pytlik"});
		
		assertEquals("Our customers are Ferda and Pytlik.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void numberInVariable() {
		Scanner template = new Scanner("Our customers are {{ customer1 }} and {{ customer2 }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=customer1=Ferda", "--var=customer2=Pytlik"});
		
		assertEquals("Our customers are Ferda and Pytlik.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	@Test
	public void twoLines() {
		Scanner template = new Scanner("Our customers are {{ customer1 }}\n and {{ customer2 }}.");
		Map<String, String> varsAndValues = SimpleReplacement.createMapOfVarsAndValues(new String[] {"--var=customer1=Ferda", "--var=customer2=Pytlik"});
		
		assertEquals("Our customers are Ferda\n and Pytlik.", Template.valuesReplaceVars(template, varsAndValues));
	}
	
	
	
	
	
	
	
	
	
	
}
