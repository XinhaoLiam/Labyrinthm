package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton},
 * this button can quit the game.
 * @see QuitButtonAction
 * @author Liamxh
 * @version 2.1
 */

public class QuitButton extends JButton{
	private final MazeGame mazeGame;
	public QuitButton(MazeGame mazeGame) {
		super("Quit");
		this.mazeGame=mazeGame;
		addActionListener(new QuitButtonAction(mazeGame));
	}
}
