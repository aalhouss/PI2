package praktikum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stacks {


protected int top;
protected int [] Eintrag; 

public Stacks(int a) {
	Eintrag= new int[a];
	top=0;
}
public int pushmeth (int e){
	if(top < Eintrag.length){
		Eintrag[top++] = e;
	    
	return 0; 
	}
	return -1;
	}
   public int popmeth () {
	   if(Eintrag != null && Eintrag.length != 0) 
		   return Eintrag[--top];
	   else 
		   return -1;
   }
   public  void printmeth() { 
	   for (int i=0 ; i<top;i++) {
		   System.out.println( Eintrag[top-(i+1)]);
	   }
		   
   }
   
  


public static void main(String[] args) throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	BufferedReader in =
			new BufferedReader(new InputStreamReader(System.in));
	int x;
	int k;
	int FLAG=1;
	String Antwort,antwort;
	
	System.out.println("Bitte die Stackgroesse angeben");
	x=Integer.parseInt(in.readLine());
	Stacks stack1 =new Stacks(x);
	while (FLAG==1){

System.out.println("Bitte waehlen von der folgenden Methoden, push, pop oder print"); 
System.out.println("Ihre Antwort");
Antwort=in.readLine(); 
if (Antwort.equals("push")) {
 System.out.println("Bitte erst den Zahl , der Sie hinzuefuegen moechten, eingeben");
 k=Integer.parseInt(in.readLine());
 System.out.println(stack1.pushmeth(k)); 
} 
else if ( Antwort.equals("pop")) {
 System.out.println(stack1.popmeth());
}  
else if (Antwort.equals("print")) {
 stack1.printmeth(); 
  } 
else { 
	System.out.println("was Sie eingegben haben , ist kein Methode");
}
 System.out.println("Moechten Sie weiter machen ? falls ja , bitte ja eingeben , sonst wird das Programm aufgehoert");
 System.out.println("Ihre Antwort");
 antwort=in.readLine();
  if(antwort.equals("ja")) { 
	  FLAG=1; 
  } 
  else { 
	  System.out.println("Auf wiedersehen"); 
	  break;
	  
  }
}
}
} 
