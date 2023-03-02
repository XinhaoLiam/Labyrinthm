package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

/**
 * Inherited from {@link BoxM}, this class is to describe the Button in the solution path.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxS#BoxS(MazeGame)} - a replacement from other type {@link BoxS#BoxS(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxS#getLabel()}, for this button, the output is "S".
 * @author Liamxh
 * @version 2.1
 */

public class BoxS extends BoxM{
	/**
	 * This constructor is to create a brand new solution button in the maze
	 * @param mazeGame the main window
	 */
	public BoxS(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.CYAN);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxS(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.CYAN);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "S"
	 */
	@Override
	public String getLabel() {
		return "S";
	}
}