package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIntegerList implements IntegerList {
	
	private int [] Array;
	private int laenge=0; 
	
	public ArrayIntegerList(int maxwert){ 
		Array=new int[maxwert];
			}
   
	public int  getLength() {
	   return this.laenge;
   }
   public int insertLast(int value) {
	   if(laenge!=Array.length) {
		   Array[laenge]=value;
		   laenge=laenge+1;
		return 0;
	   }
	   
		return -1;
   }
   public int getFirst() {
	   if(laenge==0) { 
			   return -9999;	  
			   }
	   return Array[0];
   }
   public int deleteFirst() {   
	   if(laenge==0) 
		   return -1;
		   for(int i=0;i<laenge-1;i++) 
	   Array[i]=Array[i+1];
	   laenge--;
		   
	   return 0;
	   }
	
   public boolean search(int value) {
	   for(int i=0;i<Array.length;i++) {
		   if(Array[i]==value)
			   return true;
	   }
	   return false;
   }
   public void print() {
	   for(int i=0;i<laenge;i++) {
		   System.out.print(Array[i]+" ");
	   }
   }
   
	public static void main(String[] args) throws IOException ,NumberFormatException{
		// TODO Auto-generated method stub
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
int wert,a,b,c,d;
int FLAG=1;
String antwort,answer;
      System.out.println("Bitte die maximal laenge des array eingeben :");
       wert=Integer.parseInt(in.readLine());
       ArrayIntegerList obj=new ArrayIntegerList(wert);
 while(FLAG==1) {
	
	 /*System.out.println("Bitte die laenge der List eingeben");
	 c=Integer.parseInt(in.readLine());
	 d=setlength(c);*/

	 System.out.println("Bitte wahlen von der Methoden: getLength,insertLast,getFirst,deleteFirst,search und print");
	 System.out.println("Ihre Antwort");
	 antwort=in.readLine();
	 if(antwort.equals("getLength")) 
		 System.out.println(obj.getLength());
	 else if(antwort.equals("insertLast")){
		System.out.println("Bitte erst den Wert , die zum Array addieren,eingeben");
		a=Integer.parseInt(in.readLine());
		System.out.println(obj.insertLast(a));
	 }
		else if(antwort.equals("getFirst")) {
			System.out.println(obj.getFirst());
	 }
		else if(antwort.equals("deleteFirst")){
	 System.out.println(obj.deleteFirst());
     }
		else if(antwort.equals("search")) {
			System.out.println("bitte erst welche wert ,der Sie suchen,eingeben");
			b=Integer.parseInt(in.readLine());
			System.out.println(obj.search(b));
		}
		else if(antwort.equals("print")) {
			obj.print();
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
