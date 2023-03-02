package startUI;

import javax.swing.*;

/**
 * This is a button that leads to the window for modification using {@link javax.swing.JButton}
 * <p> Its action is to open a new window {@link ModifyButtonAction} to modify the maze.
 * @author Liamxh
 * @version 2.1
 */

public class ModifyButton extends JButton{
	private final StartMenu startMenu;
	public ModifyButton(StartMenu startMenu) {
		super("Modify");
		this.startMenu=startMenu;
		addActionListener(new ModifyButtonAction());
	}
}
