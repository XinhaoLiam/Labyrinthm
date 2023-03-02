package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import maze.EBox;
import maze.MBox;

/**
 * Inherited from {@link BoxM}, this class is to describe a road Button.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxE#BoxE(MazeGame)} - a replacement from other type {@link BoxE#BoxE(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxE#getLabel()}, for this button, the output is "E".
 * @author Liamxh
 * @version 2.1
 */

public class BoxE extends BoxM{
	/**
	 * This constructor is to create a brand new button in the maze in modification
	 */
	public BoxE() {
		super();
		setBackground(Color.WHITE);
	}
	/**
	 * This constructor is to create a brand road button in the maze
	 * @param mazeGame the main window
	 */
	public BoxE(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.WHITE);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxE(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.WHITE);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "E"
	 */
	@Override
	public String getLabel() {
		return "E";
	}
}