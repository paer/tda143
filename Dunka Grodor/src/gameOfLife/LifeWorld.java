package gameOfLife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class LifeWorld extends JPanel implements MouseListener {
	private LifeModel model;
	private int xside, yside;

	public LifeWorld(LifeModel model, int size) {
		this.model = model;
		xside = size / model.getWidth();
		yside = size / model.getHeight();
		setPreferredSize(new Dimension(size, size));
		setBackground(Color.WHITE);
		setOpaque(true);
		addMouseListener(this);
	} // constructor

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		int width = model.getWidth();
		int height = model.getHeight();
		for (int i = 0; i < width; i = i + 1) {
			for (int j = 0; j < height; j = j + 1) {
				if (model.getCell(i, j)) {
					g.fillRect(i * xside, j * yside, xside, yside);
				}
			}
		}
	}// paintComponent

	public void mouseClicked(MouseEvent e) {
		int i = e.getX() / xside;
		int j = e.getY() / yside;
		model.invertCell(i, j);
		repaint();
	}// mouseClicked

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}// LifeWorld
