package mazeUI;

import maze.*;
import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JFrame}, 
 * this is the main body of the window for the maze, including :
 * <p> - A window panel containing all the necessary components {@link WindowPanel}
 * @author Liamxh
 * @version 2.1
 */

public class MazeGame extends JFrame{
	private WindowPanel windowPanel;
	private Maze maze;
	public MazeGame(Maze maze,int row,int colume) {
		this.maze=maze;
		this.setTitle("Let's begin!");
		setContentPane(windowPanel=new WindowPanel(this,maze,row,colume));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
		this.setResizable(true);
	}
	/**
	 * @return the windowPanel
	 */
	public WindowPanel getWindowPanel() {
		return windowPanel;
	}
	/**
	 * @param windowPanel the windowPanel to set
	 */
	public void setWindowPanel(WindowPanel windowPanel) {
		this.windowPanel = windowPanel;
	}
	/**
	 * @return the maze
	 */
	public Maze getMaze() {
		return maze;
	}
	/**
	 * @param maze the maze to set
	 */
	public void setMaze(Maze maze) {
		this.maze = maze;
	}
	
	
}
