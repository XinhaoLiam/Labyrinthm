package mazeUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Implementing the interface of {@link java.awt.event.ActionListener}, this class is created to realize
 * the function of reset.
 * @author Liamxh
 * @version 2.1
 */

public class ButtonResetAction implements ActionListener{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonResetAction(MazeGame mazeGame, MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super();
		this.mazeGame = mazeGame;
		this.mazePanel = mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
	}
	/**
	 * {@inheritDoc}
	 * To reset the maze, we will :
	 * <p> First return to the initial maze
	 * <p> Then return to the  first state of the button
	 * <p> Finally Set the recorded depart to the departure button of the initial maze
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<BoxM>> mazeButtonsOrigin=mazePanel.getMazeButtonsOrigin();
		mazePanel.setMazeButtons(mazePanel.cloneMazeButtonsOrigin(mazeButtonsOrigin));

		mazeButtonPanel.getDirectionPanel().setDirectionEnabled(true);
		mazeButtonPanel.getFileOperationPanel().setFOPEnabled(true);
		mazePanel.setRowStart(mazePanel.getRowDepart());
	    mazePanel.setColumeStart(mazePanel.getColumeDepart());
	}
	
}
