package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton}, 
 * this button is created to realize the reset of the maze.
 * @see ButtonResetAction
 * @author Liamxh
 * @version 2.1
 */

public class ButtonReset extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonReset(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super("¡ð");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.setEnabled(false);
		this.addActionListener(new ButtonResetAction(mazeGame,mazePanel,mazeButtonPanel));
	}
}
