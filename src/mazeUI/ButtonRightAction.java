package mazeUI;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Implementing the interface of {@link java.awt.event.ActionListener}, this class is created to realize
 * the function of going right.
 * @author Liamxh
 * @version 2.1
 */

public class ButtonRightAction implements ActionListener {
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	public ButtonRightAction(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		super();
		this.mazeGame=mazeGame;
		this.mazePanel = mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
	}
	/**
	 * <p>
	 * To go right, we have to :
	 * <p> First, make sure there's place to go right.
	 * <p> Then, make sure its right button is not a wall Button {@link BoxW}
	 * <p> Also, we have to check whether this operation will eliminate a previous one, that is :
	 * <p>    If the current button is a passed button {@link BoxR}, we will see its parameter passLeftToRight, 
	 *  and judge if we have to change it into a normal road Button {@link BoxE}.
	 * <p> Finally, we will check the block on its right :
	 * <p> - If its right button is just a road Button {@link BoxE}, we will replace it with a passed Button {@link BoxR},
	 * with its parameter passLeftToRight refreshed.
	 * <p> - If its right button is an arrival Button {@link BoxA}, we will show a simple message of congratulation.
	 * <p> In the first situation, we will also refresh the pixel of departure in {@link MazeButtonPanel}
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//Get the current departure
		int currentRow=mazePanel.getRowStart();
		int currentColume=mazePanel.getColumeStart();
		int edge=mazePanel.getColume();
		
		ArrayList<ArrayList<BoxM>> mazeBox=mazePanel.getMazeButtons();
		BoxM currentBox=mazeBox.get(currentRow).get(currentColume);
		//If we have place to go right
		if (currentColume<edge-1) {
			BoxM nextBox=mazeBox.get(currentRow).get(currentColume+1);
			//If the right button is not wall
			if (!nextBox.getLabel().equals("W")) {
				//If the current button is already passed
				if (currentBox.getLabel().equals("R")) {
					if (currentBox.getPassLeftToRight()==-1) {
						mazeBox.get(currentRow).set(currentColume, new BoxE(mazeGame,0,currentBox.getPassTopToBottom()));
					}
				}
				//Refresh the departure
				mazePanel.setRowStart(currentRow);
				mazePanel.setColumeStart(++currentColume);
				//Check the type of the right block
				switch(nextBox.getLabel()) {
					case "E" :
						//Replace it with a passed Button
						mazeBox.get(currentRow).set(currentColume, new BoxR(mazeGame,1,nextBox.getPassTopToBottom()));
						break;
					case "A" :
						//Show the congratulation.
						//Disable other buttons
						mazeButtonPanel.getDirectionPanel().setDirectionEnabled(false);
						mazeButtonPanel.getDirectionPanel().setResetEnabled(false);
						mazeButtonPanel.getFileOperationPanel().setFOPEnabled(false);
						new Congratulation(mazeButtonPanel);
						break;
				}
			}
			mazePanel.setMazeButtons(mazeBox);
		}
	}
}

