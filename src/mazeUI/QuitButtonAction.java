package mazeUI;

import java.awt.event.*;

/**
 * Implementing {@link java.awt.event.ActionListener},
 * this class is to realize the function of quitting the game.
 * @author Liamxh
 * @version 2.1
 */

public class QuitButtonAction implements ActionListener{
	private MazeGame mazeGame;
	public QuitButtonAction(MazeGame mazeGame) {
		this.mazeGame=mazeGame;
	}
	public void actionPerformed(ActionEvent e) {
		mazeGame.dispose();
	}
}
