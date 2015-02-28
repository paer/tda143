package v1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");

	public ButtonPanel(PlayEngine theEngine) {
		this.setLayout(new GridLayout(1, 2));
		this.add(button1);
		this.add(button2);
		// TODO Auto-generated constructor stub
	}

}
