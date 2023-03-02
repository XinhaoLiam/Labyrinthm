package startUI;

import javax.swing.*;

import java.awt.event.*;

/**
 * This is a button that leads to the window for the game using {@link javax.swing.JButton}
 * <p> Its action is to open a new window {@link StartButtonAction} to play the maze.
 * @author Liamxh
 * @version 2.1
 */

public class StartButton extends JButton{
	private final StartMenu startMenu;
	public StartButton(StartMenu startMenu) {
		super("Start");
		this.startMenu=startMenu;
		addActionListener(new StartButtonAction());
	}
}
