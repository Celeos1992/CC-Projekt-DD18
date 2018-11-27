
public class Auto {
	//Attribute=Eigenschaften
	String marke;
	String modell;
	String seriennummer;
	int kw;
	int hubRaum;
	int Sitze;
	int tankvolumen;
	int verbrauch;
	int reichweite;
	
	//Methoden= Fähigkeiten
	void druckeMarkeundModell() {
		System.out.println("Autotyp:"+" "+marke+" "+modell);
		System.out.println("Seriennummer:"+" "+seriennummer);		
	}	
	void berechneReichwweite() {
		reichweite = tankvolumen/verbrauch*100;	
	}
	void druckeReichweite(){
		System.out.println("Tankvolumen:"+" "+tankvolumen+"l");
		System.out.println("Verbrauch:"+" "+verbrauch+"l"+" "+"auf"+" "+100+"km");
		System.out.println("Reichweite:"+" "+reichweite+"km");
		System.out.println();		
	}
	void druckeInfo(){
		druckeMarkeundModell();
		berechneReichwweite();
		druckeReichweite();
		System.out.println();
	}
}
