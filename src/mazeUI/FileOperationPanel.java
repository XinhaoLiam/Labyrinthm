package mazeUI;

import maze.*;
import java.awt.*;
import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JPanel}, this panel contains the buttons used for file operation, including:
 * <p> - A button to load the maze {@link LoadButton}
 * <p> - A button to show the solution {@link SolutionButton}
 * <p> - A button to quit the game {@link QuitButton}
 * @author Liamxh
 * @version 2.1
 */

public class FileOperationPanel extends JPanel{
	private final MazeGame mazeGame;
	private final LoadButton loadButton;
	private final SolutionButton solutionButton;
	private final QuitButton quitButton;
	private MazePanel mazePanel;
	private DirectionPanel directionPanel;
	public FileOperationPanel(MazeGame mazeGame,Maze maze,MazePanel mazePanel,DirectionPanel directionPanel) {
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.directionPanel=directionPanel;
		this.solutionButton=new SolutionButton(mazeGame,mazePanel,directionPanel);
		this.loadButton=new LoadButton(mazeGame,maze,mazePanel,directionPanel,solutionButton);
		
		setLayout(new GridLayout(3,1));
		add(loadButton);
		add(solutionButton);
		add(quitButton=new QuitButton(mazeGame));
	}
	/**
	 * To enable/disable the load and the solution button at the same time
	 * @param FOP a boolean to show enable/disable
	 */
	public void setFOPEnabled(boolean FOP) {
		this.loadButton.setEnabled(FOP);
		this.solutionButton.setEnabled(FOP);
	}
	/**
	 * @return the solutionButton
	 */
	public SolutionButton getSolutionButton() {
		return solutionButton;
	}
	
	
}