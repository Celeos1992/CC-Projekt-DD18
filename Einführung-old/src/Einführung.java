import jdk.management.cmm.SystemResourcePressureMXBean;

public class Einf�hrung {

	public static void main(String[] args) {
		// Was sind Variablen?
		// Variablen sind Speicherbausteine
		// Jede Variable ist von einem bestimmten Typ 
		// Es gibt ganze Zahlen, Kommazahlen, Worte, Buchstaben, Wahrheitswert
		// typ Name
		
		// Ganze Zahl
	int meineGanzeZahl=5;
	
		// Komma Zahl
	double meineKommaZahl=7.92;
	
	System.out.print("Meine Zahl ist zwar Geheim aber ich verrate Sie dir. Sie ist: ");						// was is "" steht wird immer ausgegeben 
	System.out.println(meineKommaZahl);																		// Gibt den Wert aus

	
	double zahl2=meineKommaZahl/2;																			// Da meineKommaZahl vom Typ double ist, muss .0 nicht erg�nzt werden
	System.out.print("Meine Zahl ist zwar Geheim aber ich verrate Sie dir. Sie ist: "+zahl2);
	
	double zahl21=meineGanzeZahl /2.0;																		// Wichtig! 2.0 Da sonst eine int Zahl entsteht un der Kommateil abgetrennt wird
	System.out.println(zahl21);		
	
	
	// Worte und Texte
	String meinWort="Hello";																				// Einzelne Worte
	String meinText="Java nervt und st�rst bei MC immer wieder ab";											// Ganze Texte
	
	//sysout+STRG + Leertaste gibt System.out.println();
	
	System.out.println(meinWort);
	System.out.println(meinText);
	
	// Einlene Buchstaben
	char meinBuchstabe='C';
	System.out.println(meinBuchstabe);
	
	// Wahrheitstypen
	boolean meinWahrheit=false;																				// K�nne nur true (wahr) oder false (falsch) annehmen
	System.out.println(meinWahrheit);
	
	
	// Verzweigung																							//! Pr�fe ob meineGanzezahl gr��er als 10 ist. Wenn ja gege "Zahl ist gr��er aus, wenn nein gebe"zahl ist kleiner als 10"
	if (meinWahrheit) {
		System.out.println("If wurde ausgef�hrt");
	}
	else {
		System.out.println("Else wurde ausgef�hrt");
		}
	}
}	
