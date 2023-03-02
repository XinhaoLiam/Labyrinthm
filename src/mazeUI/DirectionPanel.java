package mazeUI;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * Inherited from {@link javax.swing.JPanel}, this panel contains the buttons used to move in the maze, including:
 * <p> - A button to go up {@link ButtonUp}
 * <p> - A button to go left {@link ButtonLeft}
 * <p> - A button to reset {@link ButtonReset}
 * <p> - A button to go right {@link ButtonRight}
 * <p> - A button to go down {@link ButtonDown}
 * @author Liamxh
 * @version 2.1
 */

public class DirectionPanel extends JPanel{
	private final MazeGame mazeGame;
	private final MazePanel mazePanel;
	private final MazeButtonPanel mazeButtonPanel;
	private final ButtonUp buttonUp;
	private final ButtonDown buttonDown;
	private final ButtonLeft buttonLeft;
	private final ButtonRight buttonRight;
	private final ButtonReset buttonReset;
	
	public DirectionPanel(MazeGame mazeGame,MazePanel mazePanel,MazeButtonPanel mazeButtonPanel) {
		this.mazeGame=mazeGame;
		this.mazePanel=mazePanel;
		this.mazeButtonPanel=mazeButtonPanel;
		this.buttonUp=new ButtonUp(mazeGame,mazePanel,mazeButtonPanel);
		this.buttonDown=new ButtonDown(mazeGame,mazePanel,mazeButtonPanel);
		this.buttonLeft=new ButtonLeft(mazeGame,mazePanel,mazeButtonPanel);
		this.buttonRight=new ButtonRight(mazeGame,mazePanel,mazeButtonPanel);
		this.buttonReset=new ButtonReset(mazeGame,mazePanel,mazeButtonPanel);
		
		BorderLayout bL=new BorderLayout();
		bL.setVgap(0);
		bL.setHgap(0);
		
		setLayout(bL);
		add(buttonUp,BorderLayout.NORTH);
		add(buttonDown,BorderLayout.SOUTH);
		add(buttonLeft,BorderLayout.WEST);
		add(buttonRight,BorderLayout.EAST);
		add(buttonReset,BorderLayout.CENTER);
	}
	/**
	 * Enable/Disable the direction buttons (except {@link mazeUI.ButtonReset}) at the same time)
	 * @param direction a boolean to show enable/disable
	 */
	public void setDirectionEnabled(boolean direction) {
		buttonUp.setEnabled(direction);
		buttonDown.setEnabled(direction);
		buttonLeft.setEnabled(direction);
		buttonRight.setEnabled(direction);
	}
	/**
	 * Enable/Disable {@link mazeUI.ButtonReset}
	 * @param rst boolean to show enable or disable
	 */
	public void setResetEnabled(boolean rst) {
		buttonReset.setEnabled(rst);
	}
	/**
	 * @return the buttonUp
	 */
	public ButtonUp getButtonUp() {
		return buttonUp;
	}
	/**
	 * @return the buttonDown
	 */
	public ButtonDown getButtonDown() {
		return buttonDown;
	}
	/**
	 * @return the buttonLeft
	 */
	public ButtonLeft getButtonLeft() {
		return buttonLeft;
	}
	/**
	 * @return the buttonRight
	 */
	public ButtonRight getButtonRight() {
		return buttonRight;
	}
	/**
	 * @return the buttonReset
	 */
	public ButtonReset getButtonReset() {
		return buttonReset;
	}
}
