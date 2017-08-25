package main;

import javax.swing.JFrame;

import ui.GamePanel;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame("2DJavaGame");
		window.add(new GamePanel());
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
