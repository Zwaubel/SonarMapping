package gui;

import javax.swing.JFrame;

import guiElements.DotVisualization;

public class GUI {
	JFrame test;

	public GUI() {
		test = new JFrame("Test");
		test.setSize(800, 600);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DotVisualization visualizer = new DotVisualization();
		double x = 350.5, y = 200;
		for(int i = 0; i < 9; i++) {
			visualizer.addDot(x, y);
			if(i < 4) {
				x += 10;
			} else {
				x -= 10;				
			}
			y += 10;
		}
		visualizer.removeDot(390.5, 240);
		test.add(visualizer);
	}

	public void repaint() {
		test.setVisible(true);
	}

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.repaint();

	}


}
