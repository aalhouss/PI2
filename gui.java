package praktikum4;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui extends WindowAdapter implements ActionListener  {
	private static JLabel zahl1; 
	private static JLabel zahl2; 
	private static JLabel ergbnis;
	private static JTextField tf;
	private static JTextField tf2;
	private static JTextField tf3;
	private static JButton plus;
	private static JButton minus;
	private static JButton loesche;
	private static int a;
	private static int b;
	private static int c;
	private static JRadioGroup c2;
	
public static void main(String [] args) {
	JFrame frame =new JFrame("calculator"); // titel der frame und frame entwerfen
	frame.setLocation(100,200);
	frame.setSize(300,300);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // um den Fenster zu schlieﬂen
	 // panel addieren
	 JPanel panel=new JPanel();
	 frame.add(panel);
	 panel.setLayout(null);
	 // ein label zahl1 mit eigenschaften kreaieren 
	  zahl1=new JLabel("Zahl1:");
	 zahl1.setFont(new Font("Arial",Font.BOLD,20));
	 zahl1.setForeground(Color.BLACK);
	 zahl1.setBounds(10,20,80,25);
	 panel.add(zahl1);
	 // textfield , mit bounds um direkt next zu zahl setzen
	 tf =new JTextField();
	 tf.setBounds(100,20,165,25);   
	 panel.add(tf);
	 // ein label zahl2 mit eigenschaften kreaieren 
	 zahl2=new JLabel("Zahl2:");
	 zahl2.setFont(new Font("Arial",Font.BOLD,20));
	 zahl2.setForeground(Color.BLACK);
	 zahl2.setBounds(10,50,80,25);
	 panel.add(zahl2);
	// textfield , mit bounds um direkt next zu zahl setzen
	 tf2=new JTextField();
	 tf2.setBounds(100,50,165,25);
	 panel.add(tf2);
	 
	 plus =new JButton("+");
	 plus.setBounds(10,80,80,25);
	 plus.addActionListener(new gui());
     panel.add(plus);
	 
	minus=new JButton(" - ");
	minus.setBounds(150,80,80,25);
	minus.addActionListener(new gui());
	panel.add(minus);
	
	loesche=new JButton("ergbnis loeschen");
	loesche.setBounds(60,120,150,25);
	loesche.addActionListener(new gui());
	panel.add(loesche);	
	
	ergbnis=new JLabel("Ergbnis:");
	ergbnis.setFont(new Font("Arial",Font.BOLD,20));
	ergbnis.setForeground(Color.RED);
	ergbnis.setBounds(10,150,80,25);
	panel.add(ergbnis);
	
	tf3=new JTextField();
	tf3.setBounds(100,150,160,25);
	panel.add(tf3);
	
	
	//frame.pack();
	frame.setVisible(true);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	//String zahl1=tf.getText();
	//String zahl2=tf2.getText();
	
	String buttonText = new String ( ( ( JButton ) e.getSource ( ) ).getText ( ) );
	if(buttonText.equals("+")) {
		 a=Integer.parseInt(tf.getText());
		 b=Integer.parseInt(tf2.getText());
		 c=a+b;
		 tf3.setText(   (new Integer(c)).toString());
	}
	if(buttonText.equals(" - ")) {
		a=Integer.parseInt(tf.getText());
		 b=Integer.parseInt(tf2.getText());
		 c=a-b;
		 tf3.setText((new Integer(c).toString()));
	}
	if(buttonText.equals("ergbnis loeschen")) {
		tf3.setText("");
	}
	
}
}
/*public void windowClosing(WindowEvent e) {  
    int a=JOptionPane.showConfirmDialog(frame,"Are you sure?");  
if(a==JOptionPane.YES_OPTION){  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
}*/
