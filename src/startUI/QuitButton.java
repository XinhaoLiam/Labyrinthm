package startUI;

import javax.swing.*;

/**
 * This is a button to quit the application{@link javax.swing.JButton}
 * <p> Its action is to close the window {@link QuitButtonAction} to play the maze.
 * @author Liamxh
 * @version 2.1
 */

public class QuitButton extends JButton{
	private final StartMenu startMenu;
	public QuitButton(StartMenu startMenu) {
		super("Quit");
		this.startMenu=startMenu;
		addActionListener(new QuitButtonAction());
	}
}
