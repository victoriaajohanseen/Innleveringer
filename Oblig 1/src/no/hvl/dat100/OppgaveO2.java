// Oblig 1 – Oppgave B5/O2

package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {
	public static void main(String[] args) {
		Scanner lesInn = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {

			boolean gyldig = false;

			while (!gyldig) {
				gyldig = true;

				try {

					System.out.println("Skriv inn din poengsum: ");
					int poeng = Integer.parseInt(lesInn.nextLine());

					System.out.println("Studentnr. " + (i) + ", poeng: " + poeng);
					if (poeng <= 39) {
						System.out.println("Karakter: F");
					} else if (poeng <= 49) {
						System.out.println("Karakter: E");
					} else if (poeng <= 59) {
						System.out.println("Karakter: D");
					} else if (poeng <= 79) {
						System.out.println("Karakter: C");
					} else if (poeng <= 89) {
						System.out.println("Karakter: B");
					} else if (poeng <= 100) {
						System.out.println("Karakter: A");
					} else {
						System.out.println("Ugyldig poeng");
						gyldig = false;
					}
				} catch (Exception error) {
					System.out.println("Feilmelding: " + error.getMessage());
				}
			}
		}
		lesInn.close();
	}
}