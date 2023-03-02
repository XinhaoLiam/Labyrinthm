package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

/**
 * Inherited from {@link BoxM}, this class is to describe an road Button.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxW#BoxW(MazeGame)} - a replacement from other type {@link BoxW#BoxW(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxW#getLabel()}, for this button, the output is "W".
 * @author Liamxh
 * @version 2.1
 */

public class BoxW extends BoxM{
	/**
	 * This constructor is to create a brand new button in the maze in modification
	 */
	public BoxW() {
		super();
		setBackground(Color.GRAY);
	}
	/**
	 * This constructor is to create a brand new button in the maze
	 * @param mazeGame the main window
	 */
	public BoxW(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.GRAY);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxW(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.GRAY);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "W"
	 */
	@Override
	public String getLabel() {
		return "W";
	}
}
