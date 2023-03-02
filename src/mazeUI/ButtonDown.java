package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton}, 
 * this button is created to realize the movement of going under in the maze.
 * @see ButtonDownAction
 * @author Liamxh
 * @version 2.1
 */

public class ButtonDown extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;

	public ButtonDown(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super("¡ý");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.setEnabled(false);
		this.addActionListener(new ButtonDownAction(mazeGame,mazePanel,mazeButtonPanel));
	}
}
