package cz.alisma.alej.text.wrapping;

import static org.junit.Assert.*;
import org.junit.Test;

public class TemplateTest {

	
	@Test
	public void oneVariable() {
		//remake, tbd
		String testString = "--var=customer=Ferda the Ant";
		String goodString = "sth";
		assertEquals(testString, goodString);
	}
}
