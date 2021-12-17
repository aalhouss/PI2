package praktikum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unterklasse extends Stacks {

	public unterklasse(int a, int wert) {
		super(a);
		for (int i = 0; i < Eintrag.length; i++) {
			this.pushmeth(wert + i);
		}

	}
	public int popmeth(int n) {
		if(top>n) {
		for (int i=0;i<n;i++) {
			this.popmeth();
		}
		return Eintrag[top]; }
		else 
			return -1;

		
	}

	public boolean leermeth() {
		 return(this.top==0);
	}
	
	public int pushmeth(int[] array) {
		if (array.length <= Eintrag.length - top) {
			for (int i=0 ;i<array.length;i++) {
				Eintrag[top++]=array[i];
			     }
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		unterklasse stack2 = new unterklasse(6, 10);
		int f;
		int k[];
		int m,p;
		String antwort1, answer;
		int check = 1;
		while (check == 1) {
			System.out.println("Bitte waehlen Sie, welche Methode machen moechten");
			System.out.println("push,pop,print,push2,leer");
			System.out.println("Ihre Antwort");
			antwort1 = in.readLine();
			if (antwort1.equals("push")) {
				System.out.println("Bitte erst den Zahl , der Sie hinzuefuegen moechten, eingeben");
				m = Integer.parseInt(in.readLine());
				System.out.println(stack2.pushmeth(m));
			} else if (antwort1.equals("pop")) {
				System.out.println(stack2.popmeth());
			} else if (antwort1.equals("print")) {
				stack2.printmeth();
			} else if (antwort1.equals("push2")) {
				System.out.println("Bitte den array length eingeben");
				f = Integer.parseInt(in.readLine());
				k = new int[f];
				for(int j=0;j<k.length;j++)
				{ 
					System.out.println("arrayeinträge");
				    k[j]=Integer.parseInt(in.readLine());
					}
				System.out.println(stack2.pushmeth(k));
			}
			
			  else if (antwort1.equals("leermeth")) {
			  System.out.println(stack2.leermeth()); 
			  }
			  else if (antwort1.equals("pop2"))  { 
				  System.out.println("Bitte eingeben , wie viel mal popen möchten");
				  p=Integer.parseInt(in.readLine());
				  System.out.println(stack2.popmeth(p)); 
				  
			  }
			else {
				System.out.println("was Sie eingegeben haben , ist kein Methode");
			}
			System.out.println(
					"weiter berechnen ? ja ? wenn nein bitte no eingeben , ansosnt wird das Programm durchgefuehrt");
			System.out.println("Ihre Antwort");
			answer = in.readLine();
			if (answer.equals("nein")) {
				System.out.println("Auf wiedersehen");
				break;
			} else {
				check = 1;
			}
		}
	}
}

