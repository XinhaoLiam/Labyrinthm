package mazeUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

/**
 * Inherited from {@link BoxM}, this class is to describe a passed Button.
 * <p>
 * In detail, it includes :
 * <p>Two ways of construction - a new block {@link BoxR#BoxR(MazeGame)} - a replacement from other type {@link BoxR#BoxR(MazeGame, int, int)}
 * <p>Output the label of the block {@link BoxR#getLabel()}, for this button, the output is "R".
 * @author Liamxh
 * @version 2.1
 */

public class BoxR extends BoxM{
	/**
	 * This constructor is to create a brand new passed button in the maze
	 * @param mazeGame the main window
	 */
	public BoxR(MazeGame mazeGame) {
		super(mazeGame);
		setBackground(Color.ORANGE);
	}
	/**
	 * This constructor is used to replace the type of the other button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxR(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super(mazeGame,passLeftToRight,passTopToBottom);
		setBackground(Color.ORANGE);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the button "R"
	 */
	@Override
	public String getLabel() {
		return "R";
	}
}
