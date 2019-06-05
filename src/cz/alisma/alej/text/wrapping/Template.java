package cz.alisma.alej.text.wrapping;

import java.util.List;

public class Template {
	public static void main(String[] args) {
		//in this class use Patterns and Matches - it will be useful!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
	}
	//this move to class Variables, use hash map!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void csv(String[] args) {
		for (String arg : args) {
			if (arg.startsWith("--csv=")) {
				String name = arg.substring(6);
			}
			else if (arg.startsWith("--template=")) {
				String template = arg.substring(11);
			}
			else if (arg.startsWith("--out=")) {
				String output = arg.substring(6);
			}
		}
	}
	
	public static void easyInput(String[] args) {
		for (String arg : args) {
			if (arg.startsWith("--var=zakaznik=")) {
				String zakaznik = arg.substring(15);
			}
			else if (arg.startsWith("--var=mesic=")) {
				String mesic = arg.substring(12);
			}
			else if (arg.startsWith("--var=rok=")) {
				String rok = arg.substring(10);
			}
			else if (arg.startsWith("--var=vs=")) {
				String vs = arg.substring(9);
			}
			else if (arg.startsWith("--var=castka=")) {
				String castka = arg.substring(13);
			}
		}
	}
	
	
	public static void templet(List<String> input) {
		String cheque = "Od: Dodavatel elekt�tiny\r\n" + 
				"Pro: {{ zakaznik }}\r\n" + 
				"V�c: �hrada za m�s�c {{ mesic }} {{ rok }}\r\n" + 
				" \r\n" + 
				"Dobr� den,\r\n" + 
				"  pos�l�me informace k zaplacen� �hrady za dal�� m�s�c.\r\n" + 
				" \r\n" + 
				"S pozdravem,\r\n" + 
				" loupe�n�ci\r\n" + 
				" \r\n" + 
				"Variabiln� symbol: {{ vs }}\r\n" + 
				"��stka: {{ castka }} K�\r\n" + 
				"Uhra�te na ��et: 000-123456789/1234";
	}
}
