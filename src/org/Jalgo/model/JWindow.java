package org.Jalgo.model;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	
	public void createMenuBar(){
		JMenuBar windowMenuBar;
		JMenu windowMenu;
		JMenuItem windowMenuItem;
		
		windowMenuBar = new JMenuBar();
		
		windowMenu = new JMenu("Fichier");
		windowMenuBar.add(windowMenu);
		
		windowMenuItem = new JMenuItem("Nouveau Projet");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Nouvelle fonction");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Importer un Projet");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Sauvegarder");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Fermer");
		windowMenu.add(windowMenuItem);
		
		windowMenu = new JMenu("Actions");
		windowMenuBar.add(windowMenu);
		
		windowMenuItem = new JMenuItem("Nouvelle opération");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Nouvelle condition");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Nouvelle Boucle");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("Appel fonction");
		windowMenu.add(windowMenuItem);
		
		windowMenu = new JMenu("Aide");
		windowMenuBar.add(windowMenu);
		
		windowMenuItem = new JMenuItem("Documentation");
		windowMenu.add(windowMenuItem);
		windowMenuItem = new JMenuItem("A propos");
		windowMenu.add(windowMenuItem);
		
		this.setJMenuBar(windowMenuBar);
	}
	
	public static void main(String args[]){
		JWindow mainWindow = new JWindow();
		
		mainWindow.createMenuBar();
		mainWindow.pack();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}
}
