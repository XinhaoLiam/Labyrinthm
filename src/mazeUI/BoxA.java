package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

/**
 * Inherited from {@link BoxM}, this class is to describe an arrival Button.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxA#BoxA(MazeGame)} - a replacement from other type {@link BoxA#BoxA(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxA#getLabel()}, for this button, the output is "A".
 * @author Liamxh
 * @version 2.1
 */

public class BoxA extends BoxM{
	/**
	 * This constructor is to create a brand new button in the maze in modification
	 */
	public BoxA() {
		super();
		setBackground(Color.RED);
	}
	/**
	 * This constructor is to create a brand new arrival button in the maze
	 * @param mazeGame the main window
	 */
	public BoxA(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.RED);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxA(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.RED);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "A"
	 */
	@Override
	public String getLabel() {
		return "A";
	}
}