package aufgabe4;

public class Substitution {

//	char[] alphabetKlein = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

	public static void main(String[] args) {
//		entschluesseln("Test");
		entschluesseln("Ebowifzebk Dirbzhtrkpze! Pfb exybk afb	Sbopzeirbppbirkd dbhkxzhq rka ybhljjbk yxia bfk Gly-Xkdbylq slj xjbofhxkfpzebk	Dbebfjafbkpq.");
	}

	public static void entschluesseln(String text) {
		for (int i = 0; i < 26; i++) { // Alle 26 Varianten
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < text.length(); j++) {
				char buchstabe = text.charAt(j);
				if (65 <= buchstabe && buchstabe <= 90) { // 65 - 90 ; A - Z
					buchstabe = (char) (buchstabe + i);
					if (buchstabe > 90) {
						buchstabe = (char) (buchstabe - 26);
					}
				} else if (97 <= buchstabe && buchstabe <= 122) { // 97 - 122 ; a - z
					buchstabe = (char) (buchstabe + i);
					if (buchstabe > 122) {
						buchstabe = (char) (buchstabe - 26);
					}
				}
				str.append(buchstabe);
			}
			System.out.println(i + ": " + str.toString());
		}
	}
}
