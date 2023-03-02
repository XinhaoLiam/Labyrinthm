package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

/**
 * Inherited from {@link BoxM}, this class is to describe a departure Button.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxD#BoxD(MazeGame)} - a replacement from other type {@link BoxD#BoxD(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxD#getLabel()}, for this button, the output is "D".
 * @author Liamxh
 * @version 2.1
 */

public class BoxD extends BoxM{
	/**
	 * This constructor is to create a brand new button in the maze in modification
	 */
	public BoxD() {
		super();
		setBackground(Color.GREEN);
	}
	/**
	 * This constructor is to create a brand new departure button in the maze
	 * @param mazeGame the main window
	 */
	public BoxD(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.GREEN);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxD(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.GREEN);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "D"
	 */
	@Override
	public String getLabel() {
		return "D";
	}
}