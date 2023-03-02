package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton}, 
 * this button is created to realize the movement of going right in the maze.
 * @see ButtonRightAction
 * @author Liamxh
 * @version 2.1
 */

public class ButtonRight extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonRight(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super("¡ú");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.setEnabled(false);
		this.addActionListener(new ButtonRightAction(mazeGame,mazePanel,mazeButtonPanel));
	}
}
