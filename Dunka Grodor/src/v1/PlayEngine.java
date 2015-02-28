package v1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

public class PlayEngine {
	OutPutPanel outPanel;
	InPutPanel inPanel;
	int score;
	Timer gameTimer;
	Timer frogTimer;
	int row;
	int col;

	public PlayEngine(int row, int col, InPutPanel inPanel, OutPutPanel outPanel) {
		this.outPanel = outPanel;
		this.inPanel = inPanel;
		gameTimer = new Timer(60000, gameOverAction());
		frogTimer = new Timer(1000, frogTimerAction());
		frogTimer.start();
		// inPanel.showAliveFrog(0, 0, 1000);
		this.row = row;
		this.col = col;
	}

	private ActionListener frogTimerAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = randomInt(row);
				int c = randomInt(col);
				inPanel.showAliveFrog(r, c, 1000);
				System.out.print("He" + row + "" + col);
			}
		};
	}

	private int randomInt(int x) {
		Random rn = new Random();
		return (int) rn.nextInt(x);
	}

	private ActionListener gameOverAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		};
	}

	public void increaseScore() {
		score++;
		System.out.print(score);
		outPanel.setLabel2(score);
		// TODO Auto-generated method stub

	}

}
