package startUI;

import javax.swing.*;

/**
 * This is the window that appears first when running the program {@link javax.swing.JFrame}. 
 * <p>It contains one panel {@link StartPanel} including all the buttons.
 * @author Liamxh
 * @version 2.1
 */

public class StartMenu extends JFrame{
	private final StartPanel startPanel;
	public StartMenu() {
		super("Want about a maze ?");
		setContentPane(startPanel=new StartPanel(this));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	
}
