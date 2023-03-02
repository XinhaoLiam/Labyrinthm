package mazeUI;

import maze.*;
import java.awt.*;
import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JPanel}, 
 * this Panel combines all the panels necessary for a game, including:
 * <p> - Panel for the maze {@link MazePanel}
 * <p> - Panel for the operation buttons {@link MazeButtonPanel} 
 * @author Liamxh
 * @version 2.1
 */

public class WindowPanel extends JPanel{
	private final MazeGame mazeGame;
	private MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public WindowPanel(MazeGame mazeGame, Maze maze,int row,int colume) {
		this.mazeGame=mazeGame;
		setLayout(new BorderLayout());
		add(mazePanel = new MazePanel(mazeGame,maze,row,colume),BorderLayout.CENTER);
		add(mazeButtonPanel = new MazeButtonPanel(mazeGame,maze,mazePanel),BorderLayout.SOUTH);
	}
	/**
	 * @return the mazePanel
	 */
	public MazePanel getMazePanel() {
		return mazePanel;
	}
	/**
	 * @param mazePanel the mazePanel to set
	 */
	public void setMazePanel(MazePanel mazePanel) {
		this.mazePanel = mazePanel;
	}
	/**
	 * @return the mazeButtonPanel
	 */
	public MazeButtonPanel getMazeButtonPanel() {
		return mazeButtonPanel;
	}
	
	
	
}
