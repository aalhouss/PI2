package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mengen {
	protected byte [] array; // Array zur Bitmap-Darstellung der Menge

public  Mengen(int x) {
	array=new byte [x];    //Array Erzeugung mit groesse x
	for(int i=0;i<array.length;i++) {
		array[i]=0; // Der Array ist mit Nullen vorbesetzt 
	}
}

	public int addmeth(byte a) {
		if(a<=array.length-1) { // Die Bedingung prüft ob der eingegebene Index kleiner als die groesse des Arrays ist 
			if(array[a]!=1)    // Die Bedingung prüft ob der Wert a der Menge nicht gehört 
			array[a]=1;        // Das Bit im Array wird auf 1 gesetzt 
			return 0;
		}
		else 
		return -1;
	}
		public int size() {
		int j=0;  // j ist die Anfangsgrösse des Arrays 
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0)
				j++;        // j wird um 1 erhöht solange ein neuer Element hinzugefügt wurde.
			}
		return j;          // letzte Wert von j präsentieret die gesuchte Länge
	}
	public void print() {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" "); //Ausgabe der Ellemente auf den Bildschirm 
	}
		


public static void main(String [] args) throws NumberFormatException, IOException {
	BufferedReader in=
			new BufferedReader(new InputStreamReader(System.in));
String antwort,answer;
int FLAG=1;
byte k=0,b=0; 
boolean Input=false;
System.out.println("Bitte die Menge grosse eingeben"); 
while(!Input) {
	try { 
        k=Byte.parseByte(in.readLine());
        Input=true;
  } catch (NumberFormatException e) {
      System.out.println("\nBitte nur ganze Zahlen eingeben!");
  }
}

/*System.out.println("Bitte die Menge grosse eingeben"); 
k=Byte.parseByte(in.readLine());*/
Mengen menge=new Mengen(k);

while(FLAG==1) {
System.out.println("Bitte waehlen Sie von der folgenden Methoden : add,size oder print");
System.out.println("Ihre Antwort:");
antwort=in.readLine();
if(antwort.equals("add")) { 
	System.out.println("Bitte der neuer Element , der Sie hinzuefuegen moechten, eingeben");
	b=Byte.parseByte(in.readLine());
	/*while(!Input) {
		try { 
			b=Byte.parseByte(in.readLine());
	        Input=true;
	  } catch (NumberFormatException e) {
	      System.out.println("\nBitte nur ganze Zahlen eingeben!");
	  }
	}*/
	System.out.println(menge.addmeth(b));	
}
else if (antwort.equals("size")) { 
    System.out.println(menge.size());
}
else if(antwort.equals("print")) { 
	menge.print();
}
else { 
	System.out.println("was Sie eingegeben kein methode ist , bitte probieren noch mal ");
}
System.out.println("Weiter berechnen ? falls ja , bitte yes eingeben");
System.out.println("Ihre Antwort"); 
answer=in.readLine();
if (answer.equals("yes")) {
	FLAG=1;
}
else { 
	System.out.println("Auf wiedersehen");
	break;
}
	
}
}
}