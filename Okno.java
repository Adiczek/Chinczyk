package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Okno extends JFrame{
	
	public Okno(){
		super("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int PoleGracza1[] = {1,2,21,22,50,70,90,110};
		int PoleGracza2[] = {19,20,39,40,176,175,174,173};
		int PoleGracza3[] = {381,382,361,362, 166,165,164,167 };
		int PoleGracza4[] = {379,380,399,400,250,230,270,290};
		
		int Trasa[] = {
				
				29,30,31,
				
				49,51,
				
				69,71,
				
				89,91,
				
				109,111,
				
				129,131,
				143,163,183,184,185,186,187,188,189,
				144,145,146,147,148,149,151,152,153,
				154,156,155,157,177,197,196,195,194,
				193,192,191,211,231,251,271,291,311,
				310,309,289,269,249,229,209,
				
				
		
		
		};
		
		
	
	

		
		GridLayout szablon = new GridLayout(20,20);
		setLayout(szablon);
		JPanel panel[] = new JPanel[401];
		
		for(int i=1;i<401;i++)
			panel[i] = new JPanel();
		
		
		
		for(int i=1;i<401;i++)
			add(panel[i]);
		
		
		for(int i=0;i<PoleGracza1.length;i++){
		int d = PoleGracza1[i];
			panel[d].setBackground(Color.red);
			panel[PoleGracza1[i]].setBorder(BorderFactory.createLineBorder(Color.black));
		}
		panel[41].setAlignmentX(RIGHT_ALIGNMENT);
		panel[41].add(new JLabel("Gracz"));		
		
		panel[42].add(new JLabel("1"));
		panel[42].setAlignmentX(LEFT_ALIGNMENT);
		
		for(int i=0;i<PoleGracza2.length;i++){
			int d = PoleGracza2[i];
				panel[d].setBackground(Color.blue);
				panel[PoleGracza2[i]].setBorder(BorderFactory.createLineBorder(Color.black));
			}
		panel[41].setAlignmentX(RIGHT_ALIGNMENT);
		panel[41].add(new JLabel("Gracz"));		
		
		panel[60].add(new JLabel("2"));
		panel[60].setAlignmentX(LEFT_ALIGNMENT);
		
		for(int i=0;i<PoleGracza3.length;i++){
			int d = PoleGracza3[i];
				panel[d].setBackground(Color.green);
				panel[PoleGracza3[i]].setBorder(BorderFactory.createLineBorder(Color.black));
			}
		
		for(int i=0;i<PoleGracza4.length;i++){
			int d = PoleGracza4[i];
				panel[d].setBackground(Color.yellow);
				panel[PoleGracza4[i]].setBorder(BorderFactory.createLineBorder(Color.black));
			}
		
		
		for(int i=0;i<Trasa.length;i++){
			panel[Trasa[i]].setBackground(Color.white);
			panel[Trasa[i]].setBorder(BorderFactory.createLineBorder(Color.black));
		}
		panel[41].setAlignmentX(RIGHT_ALIGNMENT);
		panel[41].add(new JLabel("Gracz"));		
		
		panel[42].add(new JLabel("1"));
		panel[42].setAlignmentX(LEFT_ALIGNMENT);
		
		
		
		
		//panel[1].add(new )
	}
}
