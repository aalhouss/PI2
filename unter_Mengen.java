package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unter_Mengen extends Mengen {

	public unter_Mengen(int a, int wert) {
		super(a); //Aufruf der Konstruktur der Oberklasse 
		for (byte i = 0; i <= wert; i++) { // die Elemente 0, 1, ..., wert würden in der Menge eingefügt
			this.addmeth(i);               // durch Aufruf der Methode addmeth().
		}
	}
	public boolean leermeth() {
		return(array.length==0);
	}
	
	public int addmeth(Byte unten , Byte oben) { 
		 if(array[unten]!=1||array[oben]!=1) {//Es wird überprüft, ob die beiden Werte unten und oben der Grundmenge GM angehörn
		 for(byte e=(byte)(unten+1);e<oben;e++)//Flls ja : die Methode fügt alle Werte e mit unten < e < oben in die Menge ein.
			 this.addmeth(e);                  //durch Aufruf der Methode addmeth().
		 return 0;                             //liefert 0 zurück .
		 }
		 else
	    return -1;                             //Falls Nein : liefert -1 zurück .
		 }
	public int add3(int[] arr) {
		for (int i = 0; i<arr.length;i++){
			if(arr[i]<0 || arr[i] >= super.array.length)
				return -1;	
		    }
		for (int i = 0; i < arr.length; i++) 
			super.array[arr[i]]=1;
		return 0;
		}

public static void main(String [] args) throws NumberFormatException, IOException {
	BufferedReader in=
			new BufferedReader(new InputStreamReader(System.in));
String antwort,answer;
int FLAG=1;
int [] arry;
byte wert;
byte b,oben,unten;



/*System.out.println("Bitte die Menge grosse eingeben"); 
k=Byte.parseByte(in.readLine());*/
unter_Mengen Objekt=new unter_Mengen(10,2); //Erzeugen eines Objekt für die unter-Menge-Klasse und Initialisierung der grösse des Arrays und der wert durch den Konstruktor 

while(FLAG==1) {
System.out.println("Bitte waehlen Sie von der folgenden Methoden : add,add2,add3,size ,print,leer");
System.out.println("Ihre Antwort:");
antwort=in.readLine();
if(antwort.equals("add")) { 
	System.out.println("Bitte der ertse Element , der Sie hinzuefuegen moechten, eingeben");
	b=Byte.parseByte(in.readLine());
	System.out.println(Objekt.addmeth(b));	
}
else if(antwort.equals("add2")) { 
	System.out.println("Bitte der erster Element(oben) , der Sie hinzuefuegen moechten, eingeben");
	oben=Byte.parseByte(in.readLine());
	System.out.println("Bitte der zweiter Element(unten) , der Sie hinzuefuegen moechten, eingeben");
	unten=Byte.parseByte(in.readLine());
	System.out.println(Objekt.addmeth(unten,oben));	
}
else if (antwort.equals("size")) { 
    System.out.println(Objekt.size());
}
else if (antwort.equals("leer")) { 
    System.out.println(Objekt.leermeth());
}
else if(antwort.equals("print")) { 
	Objekt.print();
}
else if(antwort.equals("add3")) { 
	System.out.println("Bitte erst die länge der Array eingeben");
	wert=Byte.parseByte(in.readLine());
	arry=new int[wert];
	System.out.println("Bitte die werte der Array eingeben ,die zur Menge gehoeren sollen");
	for(int i =0;i<arry.length;i++) {
		arry[i]=Integer.parseInt(in.readLine());}
	Objekt.add3(arry);
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
	
