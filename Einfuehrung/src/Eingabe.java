import java.util.Scanner;
public class Eingabe {
	public static void main(String[] args) {
		String meinText ="Beispiel Text";
		System.out.println(meinText);
		System.out.print("Eingabe bitte:");
		
		Scanner derScanner=new Scanner(System.in);
		
		//String meineEingabe = Eingabe von der Konsole übernehmen
		
		String meineEingabe=derScanner.nextLine();
		System.out.println("Unsere Eingabe lautet: "+meineEingabe);
		
		System.out.print("Eingabe bitte:");
		int meineZahl=derScanner.nextInt();
		System.out.print("Eingabe bitte:");
		int eineZahl=derScanner.nextInt();
		
		System.out.println("Das Ergebnis von " + meineZahl + " und " + eineZahl + " ist " + (meineZahl+eineZahl)); 
		
		// Zwei Zahlen annehmen, diese dann addieren 
	}

}
