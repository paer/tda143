package v1;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class OutPutPanel extends JPanel {
	JLabel label1 = new JLabel("1");
	JLabel label2 = new JLabel("2");
	JLabel label3 = new JLabel("3");

	public OutPutPanel() {
		this.setLayout(new GridLayout(3, 1));
		this.add(label1);
		this.add(label2);
		this.add(label3);

	}

	public void setLabel2(int score) {
		label2.setText("Score:" + score);
	}

}
