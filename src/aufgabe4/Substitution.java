package aufgabe4;

public class Substitution {

	public static void main(String[] args) {
//		entschluesseln("Ebowifzebk Dirbzhtrkpze! Pfb exybk afb Sbopzeirbppbirkd dbhkxzhq rka ybhljjbk yxia bfk Gly-Xkdbylq slj xjbofhxkfpzebk Dbebfjafbkpq.");
	}

	/**
	 * Gibt alle 26 Varianten der Caeser Entschluesslung, durch das Verschieben des Alphabets auf der Konsole aus.
	 * 
	 * Dafuer wird 26 mal der Code komplett durchlaufen und ein neuer String zusammengesetzt, der darauf ausgegeben wird.
	 * Dabei wird jeder Buchstabe kontrolliert ob es sich um einen Kleinbuchstaben oder Grossbuchstaben handelt und dann die Verschiebung darauf addiert.
	 * Falls der ASCII Zahlenbereich ueberschritten wurde, wird wieder vorne im Alphabet angefangen.
	 * @param code
	 */
//	public static void entschluesseln(String code) {
//		//Durchlaeuft alle 26 Verschiebungen
//		for (int i = 0; i < 26; i++) {
//			StringBuilder str = new StringBuilder();
//			//Durchlaeuft den Code
//			for (int j = 0; j < code.length(); j++) {
//				char buchstabe = code.charAt(j);
//				if (65 <= buchstabe && buchstabe <= 90) { // 65 - 90 ; A - Z
//					buchstabe = (char) (buchstabe + i);
//					if (buchstabe > 90) { //Zahlenbereich ist ueberschritten
//						buchstabe = (char) (buchstabe - 26);
//					}
//				} else if (97 <= buchstabe && buchstabe <= 122) { // 97 - 122 ; a - z
//					buchstabe = (char) (buchstabe + i);
//					if (buchstabe > 122) { //Zahlenbereich ist ueberschritten
//						buchstabe = (char) (buchstabe - 26);
//					}
//				}
//				str.append(buchstabe);
//			}
//			System.out.println(i + ": " + str.toString());
//		}
//	}
}
