import java.util.Random;
import java.util.Scanner;
public class Raten {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int i = rng.nextInt(100);
		
		int gerateneZahl;
		
		Scanner derScanner=new Scanner(System.in);
		while (true) {
			System.out.print("Eingabe bitte:");
			gerateneZahl = derScanner.nextInt();
			
			if (gerateneZahl < i) {
				System.out.println("die geratene Zahl ist zu klein.");
			} else if (gerateneZahl > i) {
				System.out.println("die geratene Zahl ist zu groﬂ.");
			} else {
				System.out.println("Das war die richtige Zahl.");
				break;
			}
			
			if (Math.abs(i-gerateneZahl)<5) {
				System.out.println("Du bist dicht dran.");
			}
			
		}
		
		
		derScanner.close();
	

	}

}
