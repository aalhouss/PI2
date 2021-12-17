package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayGList<T> implements GList<T>{
	private T [] Array;
	private int laenge; 
	// initialisirung konstrukor
	ArrayGList(int maxwert){
		Array= (T[]) new Object[maxwert]; // using generic types (T)
			}
	// lieferet den aktuellen länge
   public int  getLength() { 
	   return this.laenge;
   }
   public int insertLast(T value) {
	   if(Array.length>=laenge) {
		   Array[laenge]=value;
		   laenge++;
		return  0;
	   }
	   
		return -1;
   }
   // liefert der erste element 
   public T getFirst() { 
	   if(this.laenge > 0) { 
			   return Array[0];	  
			   }
	   return null;	
   }
   // entfernet den ersten Element
   public int deleteFirst() {   
	   if(laenge==0) // if leer , return -1
		   return -1;
		   for(int i=0;i<laenge-1;i++)  
	   Array[i]=Array[i+1]; // setzen den Element mit dem nächsten 
	   laenge--;// dikriminierung der aktuellen Länge nach jeder delete
		   
	   return 0;
	   }
   //sucht für ein bestimmten wert mit beliebeg datatyp
   public boolean search(T value) {
	   for(int i=0;i<Array.length;i++) {
		   if(Array[i].equals(value))
			   return true;
	   }
	   return false;
   }
   //gibt die aktuellen werten auf dem Bilshrimm aus 
   public void print() {
	   for(int i=0;i<laenge;i++) {
		   System.out.print(Array[i]+" ");
	   }
   }
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
		int wert=0,a=0,b,c,d=0;
		double e,f;
		boolean check=false;
		int FLAG=1;
		String antwort,answer;
		while(!check){
			try {
		      System.out.println("Bitte die maximal laenge des array eingeben :");
		       wert=Integer.parseInt(in.readLine());
		       check=true;
			} catch(NumberFormatException e1) {
				System.out.println("was Sie eingeben haben, ist kein Zahl, bitte probieren Sie nochmal ");
			}
				
			} 
		//while(!check) {
			//try {
		       System.out.println("Bitte waehlen Sie von der folgenden Menu,um ein Obj zu erzeugen");
		       
		    
			   System.out.println("1 für Integer Numbers");
			   System.out.println("2 für Double Numbers");
		       d=Integer.parseInt(in.readLine());
		      
		      ArrayGList<Integer> obj1=new ArrayGList<Integer>(wert);// mit iNteger initialisieren 
		       ArrayGList<Double> obj2=new ArrayGList<Double>(wert);//mit double initialisieren 
		       System.out.println("Bitte wahlen von der Methoden: getLength,insertLast,getFirst,deleteFirst,search und print");
		       while(FLAG==1) {
		       if(d==1) {
		    	  
		    		 System.out.println("Ihre Antwort");
		    		 antwort=in.readLine();
		    		 
					if(antwort.equals("getLength")) 
		    			 System.out.println(obj1.getLength());
		    		 else if(antwort.equals("insertLast")){
		    			 while(!check) {
		    				 try {
		    			System.out.println("Bitte erst den Wert , die zum Array addieren,eingeben");
		    			a=Integer.parseInt(in.readLine());
		    			check=true;
		    				 } catch(NumberFormatException e3) {
		    					 System.out.println("was Sie eingeben haben, ist kein Zahl, bitte probieren Sie nochmal ");
		    				 }
		    			 }
		    			System.out.println(obj1.insertLast(a));
		    		 }
		    			else if(antwort.equals("getFirst")) {
		    				System.out.println(obj1.getFirst());
		    		 }
		    			else if(antwort.equals("deleteFirst")){
		    		 System.out.println(obj1.deleteFirst());
		    	     }
		    			else if(antwort.equals("search")) {
		    				System.out.println("bitte erst welche wert ,der Sie suchen,eingeben");
		    				b=Integer.parseInt(in.readLine());
		    				System.out.println(obj1.search(b));
		    			}
		    			else if(antwort.equals("print")) {
		    				obj1.print();
		    			}
		    			else {
		    				System.out.println("Was Sie eingeben haben, ist kein gueltiges Methode");
		    			}
		    		 System.out.println("weiter berechnen?falls ja , bitte y eingeben");
		    			System.out.println("Ihre Antwort :");
		    			answer=in.readLine();
		    			if(answer.equals("y"))
		    				FLAG=1;
		    			else {
		    				System.out.println("Auf wiedersehen");
		    			break;
		    			
		    			}
		    			
		    			 
		    
		    		
		    	}
		       else if(d==2) {
		    	   System.out.println("Bitte wahlen von der Methoden: getLength,insertLast,getFirst,deleteFirst,search und print");
		    		 System.out.println("Ihre Antwort");
		    		 antwort=in.readLine();
		    		 
					if(antwort.equals("getLength")) 
		    			 System.out.println(obj1.getLength());
		    		 else if(antwort.equals("insertLast")){
		    			System.out.println("Bitte erst den Wert , die zum Array addieren,eingeben");
		    			e=Double.parseDouble(in.readLine());
		    			System.out.println(obj2.insertLast(e));
		    		 }
		    			else if(antwort.equals("getFirst")) {
		    				System.out.println(obj2.getFirst());
		    		 }
		    			else if(antwort.equals("deleteFirst")){
		    		 System.out.println(obj2.deleteFirst());
		    	     }
		    			else if(antwort.equals("search")) {
		    				System.out.println("bitte erst welche wert ,der Sie suchen,eingeben");
		    				f=Double.parseDouble(in.readLine());
		    				System.out.println(obj2.search(f));
		    			}
		    			else if(antwort.equals("print")) {
		    				obj2.print();
		    			}
		    			else {
		    				System.out.println("Was Sie eingeben haben, ist kein gueltiges Methode");
		    			}
		    		 System.out.println("weiter berechnen?falls ja , bitte y eingeben");
		    			System.out.println("Ihre Antwort :");
		    			answer=in.readLine();
		    			if(answer.equals("y"))
		    				FLAG=1;
		    			else {
		    				System.out.println("Auf wiedersehen");
		    			
		    				break;
		    			}
		    			
		    			 
		    		 
		    		
		    	}
		       
		    		}
	}
		       
		       
		       
	}


