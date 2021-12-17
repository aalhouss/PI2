package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menge_unterklasse extends Mengen {
	
public menge_unterklasse(int j, int k) {
	super(j);
	for(byte i=0;i<k;i++) {
		this.addmeth(i);
	}
}
public boolean leermethode() { 
	return(this.array.length==0);
}
/*public byte addmeth(byte unten, byte oben) {
	for(int i=0;i<array.length;i++) { 
		for(int j=0;j<array.length;j++) { 
		if (i==unten && j==oben ) {
			for(int e=unten+1;e<oben;e++) {
				array[e]=(byte) e;
			}
			
			
		}
		return 0;
	}
}
	return -1;
}*/
public int addmeth(Byte unten , Byte oben) { 
	 if(array[unten]!=1||array[oben]!=1) { 
	 for(byte e=(byte)(unten+1);e<oben;e++)
		 this.addmeth(e);
	 return 0;
	 }
	 else
   return -1; 
	 }
     public static void main(String args[]) throws NumberFormatException, IOException {
      BufferedReader in =
    		  new BufferedReader(new InputStreamReader(System.in));
      menge_unterklasse obj= new menge_unterklasse(10,3);
      String antwort,answer;
      int FLAG=1;
      byte k=0,b; 
      byte unten,oben;
      boolean Input=false;
    
    /*  System.out.println("Bitte die obj grosse eingeben"); 
      k=Byte.parseByte(in.readLine());*/

      while(FLAG==1) {
      System.out.println("Bitte waehlen Sie von der folgenden Methoden : add,size, print,add2,leer");
      System.out.println("Ihre Antwort:");
      antwort=in.readLine();
      if(antwort.equals("add")) { 
      	System.out.println("Bitte erst den Zahl , die zur obj addieren moechten, eingeben");
      	b=Byte.parseByte(in.readLine());
      	/*while(!Input) {
      		try { 
      			b=Byte.parseByte(in.readLine());
      	        Input=true;
      	  } catch (NumberFormatException e) {
      	      System.out.println("\nBitte nur ganze Zahlen eingeben!");
      	  }
      	}*/
      	System.out.println(obj.addmeth(b));	
      }
      else if (antwort.equals("size")) { 
          System.out.println(obj.size());
      }
      else if(antwort.equals("print")) { 
      	obj.print();
      }
      else if(antwort.equals("leer")) { 
        	obj.leermethode();
        }
      else  if(antwort.equals("add2")) { 
        	System.out.println("Bitte erst oben und unten eingeben");
        	System.out.println("Oben:");
        	oben=Byte.parseByte(in.readLine());
        	System.out.println("unten:");
        	unten=Byte.parseByte(in.readLine());
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

