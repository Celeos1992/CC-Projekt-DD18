import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//Scanner der Scanner=new Scanner(System.in)
		Auto A1 =new Auto();
		Auto A2 =new Auto();
		Auto A3 =new Auto();
		Auto A4 =new Auto();
		
		A1.marke="Mazda";
		A1.modell="CX-5";
		A1.seriennummer="F78556992";
		A1.tankvolumen=120;
		A1.verbrauch=5;
		
		A2.marke="Ford";
		A2.modell="Mondeo";
		A2.seriennummer="F99858652";
		A2.tankvolumen=90;
		A2.verbrauch=3;
		
		A3.marke="VW";
		A3.modell="Golf";
		A3.seriennummer="F58764228";
		A3.tankvolumen=90;
		A3.verbrauch=9;
		
		A4.marke="Feuersteinwagen";
		A4.modell="Modell 1";
		A4.seriennummer="A100100100";
		
				
		
		
//		A1.berechneReichwweite();
//		A4.druckeReichweite();
//		A2.druckeMarkeundModell();
//		A3.druckeMarkeundModell();
		
		A1.druckeInfo();
		A2.druckeInfo();
		A3.druckeInfo();
		A4.druckeMarkeundModell();
		
		
		}
}
