package timerTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class TimerTest extends JFrame {
	JButton button;
	Timer timer;

	public TimerTest() {
		button = new JButton();
		timer.addActionListener(timerAction());
		setLayout(new GridLayout());
		setSize(300, 300);
		this.add(button);
		setVisible(true);
	}

	private ActionListener timerAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				timer.stop();
			}
		};
	}

	public static void main(String[] args) {
		TimerTest t = new TimerTest();

	}

}
