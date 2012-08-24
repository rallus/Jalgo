package org.Jalgo.model;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JWindow extends JFrame{
	
	public JWindow(){
		super("Jalgo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel windowPanel = new JPanel();
		windowPanel.setPreferredSize(new Dimension(800,600));
		setContentPane(windowPanel);
	}
	
	public static void main(String args[]){
		JWindow mainWindow = new JWindow();
		
		mainWindow.pack();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}
}
