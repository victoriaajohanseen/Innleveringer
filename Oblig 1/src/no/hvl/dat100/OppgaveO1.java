// Oblig 1 – Oppgave B4/O1

package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {
	public static void main(String[] args) {
		Scanner lesInn = new Scanner(System.in);
		System.out.println("Skriv inn din bruttoinntekt: ");
		double inntekt = Double.parseDouble(lesInn.nextLine());

		// regner ut skatt for hvert trinn
		double t1 = (inntekt - 164101) * 0.0093;
		double t2 = (inntekt - 230951) * 0.0241;
		double t3 = (inntekt - 580651) * 0.1152;
		double t4 = (inntekt - 934051) * 0.1452;

		// setter maksverdier for hvert trinn
		double t1max = (230951 - 164101) * 0.0093;
		double t2max = (580651 - 230951) * 0.0241;
		double t3max = (934051 - 580651) * 0.1152;

		// Trinn 0
		if (inntekt <= 164100) {
			System.out.println("Ingen skatt!");
		// Trinn 1
		} else if (inntekt > 164100 && inntekt <= 230950) {
			System.out.println("Trinnskatt: " + t1 + " kr.");
		// Trinn 2
		} else if (inntekt > 230950 && inntekt <= 580650) {
			System.out.println("Trinnskatt: " + (t2 + t1max) + " kr.");
		// Trinn 3
		} else if (inntekt > 580650 && inntekt < 934050) {
			System.out.println("Trinnskatt: " + (t3 + t1max + t2max) + " kr.");
		// Trinn 4
		} else {
			System.out.println("Trinnskatt: " + (t4 + t1max + t2max + t3max) + " kr.");
		}
		lesInn.close();
	}
}