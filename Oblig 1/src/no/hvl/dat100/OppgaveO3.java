// Oblig 1 – Oppgave O3

package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {
	public static void main(String[] args) {
		Scanner lesInn = new Scanner(System.in);
		System.out.print("Skriv inn et tall: ");

		int n = Integer.parseInt(lesInn.nextLine());
		int fak = 1;
		int teller = n;

		for (int i = 0; i < n; i++) {
			if (teller == 1) {
				System.out.print(teller);
			} else {
				System.out.print(teller + " * ");
			}
			fak = fak * teller;
			teller--;
		}
		System.out.println("\nResultatet er: " + fak);

		lesInn.close();
	}
}