package mazeUI;

import maze.*;
import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JButton},
 * this button can load the maze from the text file chosen in the file system.
 * @see LoadButtonAction
 * @author Liamxh
 * @version 2.1
 */

public class LoadButton extends JButton {
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final DirectionPanel directionPanel;
	private final SolutionButton solutionButton;
	public LoadButton(MazeGame mazeGame,Maze maze,MazePanel mazePanel, DirectionPanel directionPanel, SolutionButton solutionButton) {
		super("Load");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.directionPanel=directionPanel;
		this.solutionButton=solutionButton;
		addActionListener(new LoadButtonAction(mazeGame, maze,mazePanel,directionPanel,solutionButton));
	}
}
