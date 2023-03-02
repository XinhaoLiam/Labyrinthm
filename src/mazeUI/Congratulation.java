package mazeUI;

import java.awt.GridLayout;
import javax.swing.*;

/**
 * This is a simple to celebrate your success, with only one button to confirm that you are happy about it...
 * @see CongratulationOk
 * @author Liamxh
 * @version 2.1
 */

public class Congratulation extends JFrame{
	private final MazeButtonPanel mazeButtonPanel;
	public Congratulation(MazeButtonPanel mazeButtonPanel) {
		this.setTitle("You win!!");
		this.mazeButtonPanel=mazeButtonPanel;
		
		JLabel label1=new JLabel(),label3=new JLabel(),label4=new JLabel(),label6=new JLabel();
		JLabel label2=new JLabel("Congratulations!");
		JButton ok=new JButton("OK");
		ok.addActionListener(new CongratulationOk(this,mazeButtonPanel));
		JPanel panel1=new JPanel(new GridLayout(1,3)), panel2=new JPanel(new GridLayout(1,3));
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		
		panel2.add(label4);
		panel2.add(ok);
		panel2.add(label6);
		
		this.setLayout(new GridLayout(2,1));
		this.add(panel1);
		this.add(panel2);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
