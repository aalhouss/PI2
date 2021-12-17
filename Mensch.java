package praktikum4;
//"src/daten.txt";
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
public class Mensch implements Serializable {
private String name;
private double groesse;
private int alter;
static int a;
protected Mensch array[];
public Mensch() {};
public Mensch(String a,double b,int c) {
	this.name=a;
	this.groesse=b;
	this.alter=c;
	}


String getName() {
return this.name;
}
double getGroesse() {
	return this.groesse;
}
int getAlter() {
	return this.alter;
}

 public void print() {
	 System.out.println("Name: "+this.name);
	 System.out.println("Groesse: "+this.groesse);
	 System.out.println("Alter: "+this.alter);
 }




 
 public static void main(String [] args) throws Exception{
	 Mensch m =new Mensch();
	 String path="src/daten.txt";
	 int anz=0;
	 try {
		    FileReader fr = new FileReader(path);
		    BufferedReader br = new BufferedReader(fr);
		    String line = br.readLine();
		    while(line != null) {
		        line = br.readLine();
		        anz++;
		    }
		    br.close();
		} catch (Exception ex) {
		}
	 System.out.println(anz);
	Mensch [] array=new Mensch [anz];
	
	Scanner scan = null;
	try {
	    scan = new Scanner(new File("src/daten.txt"));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	
	int [] integer=new int [6];
	double [] dbl= new double[6]; 
	String [] string =new String[6];
	int i=0,d=0,s=0;
	
	while (scan.hasNext()) {
		
		if (scan.hasNextInt()) {
            integer[i] = scan.nextInt();
            i++;
    }else if (scan.hasNextDouble()) {
        dbl[d] = scan.nextDouble();
        d++;
    } else {
        string[s]=scan.next();
        s++;
    }
		
}
    Mensch m0= new Mensch(string[0],dbl[0],integer[0]);
    m0.print();
    array[0]=m0;
	Mensch m1= new Mensch(string[1],dbl[1],integer[1]);
	m1.print();
	array[1]=m1;
	Mensch m2= new Mensch(string[2],dbl[2],integer[2]);
	m2.print();
	array[2]=m2;
	Mensch m3= new Mensch(string[3],dbl[3],integer[3]);
	m3.print();
	array[3]=m3;
	Mensch m4= new Mensch(string[4],dbl[4],integer[4]);
	m4.print();
	array[4]=m4;
	try {
	Mensch m5= new Mensch(string[5],dbl[5],integer[5]);
     m5.print();
    array[5]=m5;
	} 
	catch(NullPointerException e)
    {
		e.printStackTrace();
        System.out.print("NullPointerException Caught");
    }

    //array[5]=m5;
	
	for(int k=0;k<=5;k++) {
	    System.out.print("die "+k+" Personn heißt "+array[k].getName());
	    System.out.print(", ist "+array[k].getGroesse()+" groß");
	    System.out.println(" und ist "+array[k].getAlter()+" alt.");
	    System.out.println("************");
		
	}
	   
	 scan.close();
	 
	 //Serialisierte Ausgabe des Arrays in eine Datei "daten2
	
	 try (FileOutputStream fos = new FileOutputStream ("daten2");
		      ObjectOutputStream oos = new ObjectOutputStream (fos)) {
		   oos.writeObject (array);
		   System.out.println("done!");
		 }
	 
	 //Serialisiertes Einlesen des Inhalts von "daten2" in einen zweiten Array 
	 Mensch [] newArray=new Mensch [anz];
	 ObjectInputStream objInStr = new 
			 ObjectInputStream(new FileInputStream("daten2"));
			//Objekte serialisiert einlesen
			newArray = (Mensch[]) objInStr.readObject();
	 
	//   Ausgabe des Arrayinhalts auf den Bildschirm
			for(int k=0;k<=5;k++) {
				System.out.println(" Ausgabe des Arrayinhalts auf den Bildschirm");
			    System.out.print("die "+k+" Personn heißt "+newArray[k].getName());
			    System.out.print(", ist "+newArray[k].getGroesse()+" groß");
			    System.out.println(" und ist "+newArray[k].getAlter()+" alt.");
			    System.out.println("************");
				
			}
			   		
			
			
			
		 
 }
/*
 File f=new File ("daten2.txt","w");
 for(int i=0;i<anz;i++) {
 f.write( array[i]).serialize());
 
 }
*/

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}