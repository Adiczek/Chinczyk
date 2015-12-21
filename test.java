package test;


// @author Adrian

import java.awt.Container;
import java.awt.EventQueue;
import java.util.Scanner;

public class test extends Okno {
	
	public static void wyczysc()
	{
	System.out.println("\n\n\n\n\n\n\n\n\n");//dowolna ilosc n
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Okno okno = new Okno();
				okno.setTitle("Tytu³");
				okno.setLocation(200, 200);
				okno.setSize(700, 500);
				okno.setVisible(true);
				
				
			}
		});
		
		

}}
