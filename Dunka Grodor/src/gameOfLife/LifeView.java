package gameOfLife;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LifeView extends JPanel implements ActionListener {
	private LifeModel model;
	private LifeWorld world;
	private JButton stepButton = new JButton("Step");
	private JButton runButton = new JButton("Run");
	private JButton stopButton = new JButton("Stop");
	private JButton clearButton = new JButton("Clear");
	private JLabel generationLabel = new JLabel();
	private Timer timer = new Timer(200, this);

	public LifeView(LifeModel model, LifeWorld world) {
		this.model = model;
		this.world = world;
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 3));
		buttonPanel.add(stepButton);
		buttonPanel.add(runButton);
		buttonPanel.add(stopButton);
		buttonPanel.add(clearButton);
		generationLabel.setText("Generation: " + model.getNrOfGeneration());
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));
		southPanel.add(generationLabel);
		southPanel.add(buttonPanel);
		setLayout(new BorderLayout());
		add(world, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		stepButton.addActionListener(this);
		runButton.addActionListener(this);
		stopButton.addActionListener(this);
		clearButton.addActionListener(this);
	} // constructor

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == stepButton || e.getSource() == timer) {
			model.newGeneration();
			world.repaint();
			generationLabel.setText("Generation: " + model.getNrOfGeneration());
		} else if (e.getSource() == runButton) {
			timer.start();
		} else if (e.getSource() == stopButton) {
			timer.stop();
		} else if (e.getSource() == clearButton) {
			model.clearPopulation();
			world.repaint();
			System.out.print("Here");
		}
	}// actionPerformed
}// LifeView