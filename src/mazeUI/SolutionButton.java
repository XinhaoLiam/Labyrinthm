package mazeUI;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton},
 * this button can show the solution of the current maze.
 * @see SolutionButtonAction
 * @author Liamxh
 * @version 2.1
 */

public class SolutionButton extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final DirectionPanel directionPanel;
	public SolutionButton(MazeGame mazeGame, MazePanel mazePanel, DirectionPanel directionPanel) {
		super("Solution");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.directionPanel=directionPanel;
		this.setEnabled(false);
		addActionListener(new SolutionButtonAction(mazeGame,mazePanel,directionPanel));
	}
}
