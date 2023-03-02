package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton}, 
 * this button is created to realize the movement of going up in the maze.
 * @see ButtonUpAction
 * @author Liamxh
 * @version 2.1
 */

public class ButtonUp extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonUp(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super("¡ü");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.setEnabled(false);
		this.addActionListener(new ButtonUpAction(mazeGame,mazePanel,mazeButtonPanel));
	}
}
