package mazeUI;

import maze.*;
import java.awt.*;
import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JPanel},
 * this panel contains all the buttons (direction and file operation), divided into two parts:
 * <p> - A panel with buttons that can control the movement {@link DirectionPanel}
 * <p> - A panel with buttons that can do something with the files {@link FileOperationPanel}
 * @author Liamxh
 * @version 2.1
 */

public class MazeButtonPanel extends JPanel{
	private final MazeGame mazeGame;
	private final DirectionPanel directionPanel;
	private final FileOperationPanel fileOperationPanel;
	private final MazePanel mazePanel;
	
	public MazeButtonPanel(MazeGame mazeGame,Maze maze,MazePanel mazePanel) {
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		setLayout(new GridLayout(1,2));
		this.directionPanel=new DirectionPanel(mazeGame,mazePanel,this);
		this.fileOperationPanel=new FileOperationPanel(mazeGame,maze,mazePanel,directionPanel);
		add(directionPanel);
		add(fileOperationPanel);
	}

	/**
	 * @return the directionPanel
	 */
	public DirectionPanel getDirectionPanel() {
		return directionPanel;
	}

	/**
	 * @return the fileOperationPanel
	 */
	public FileOperationPanel getFileOperationPanel() {
		return fileOperationPanel;
	}
	
}
