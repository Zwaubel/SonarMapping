package guiElements;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Vector;

import javax.swing.JPanel;

public class DotVisualization extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Graphics2D renderer;
	Vector<Dot> dots;
	
	public DotVisualization() {
		dots = new Vector<Dot>();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		renderer = (Graphics2D) g;
		if(dots.size() > 0) {
			for(Dot dot : dots) {
				renderer.fill(dot);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public void addDot(double x, double y) {
		dots.add(new Dot(x, y));
	}
	
	public void removeDot(double x, double y) {
		for(int i = 0; i < dots.size(); i++) {
			if(dots.get(i).getCenterX() == x && dots.get(i).getCenterY() == y) {
				dots.remove(i);
			}
		}
	}
	
	public void clearAllDots() {
		dots.clear();
	}
	
	
	
	private class Dot extends Ellipse2D.Double {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		final static double size = 5;
		
		public Dot(double x, double y) {
			super((x - size/2), (y - size/2), size, size);
		}	
		
		@Override
		public String toString() {
			return "Dot -> x: " + getCenterX() + "; y: " + getCenterY();
		}
	}
}
