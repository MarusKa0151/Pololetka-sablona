package cz.alisma.alej.text.wrapping;

import java.util.List;

public class Template {
	public static void main(String[] args) {
				
	}
	
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
		String cheque = "Od: Dodavatel elektøtiny\r\n" + 
				"Pro: {{ zakaznik }}\r\n" + 
				"Vìc: Úhrada za mìsíc {{ mesic }} {{ rok }}\r\n" + 
				" \r\n" + 
				"Dobrý den,\r\n" + 
				"  posíláme informace k zaplacení úhrady za další mìsíc.\r\n" + 
				" \r\n" + 
				"S pozdravem,\r\n" + 
				" loupežníci\r\n" + 
				" \r\n" + 
				"Variabilní symbol: {{ vs }}\r\n" + 
				"Èástka: {{ castka }} Kè\r\n" + 
				"Uhraïte na úèet: 000-123456789/1234";
	}
}
