package mazeUI;

import javax.swing.*;
import java.awt.event.*;

/**
 * Inherited from {@link javax.swing.JButton}, 
 * this button is created to realize the movement of going left in the maze.
 * @see ButtonLeftAction
 * @author Liamxh
 * @version 2.1
 */

public class ButtonLeft extends JButton{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonLeft(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super("¡û");
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.setEnabled(false);
		this.addActionListener(new ButtonLeftAction(mazeGame,mazePanel,mazeButtonPanel));
	}
}
