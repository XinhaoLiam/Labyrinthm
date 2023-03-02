package mazeUI;

import java.awt.Dimension;

import javax.swing.*;

import maze.MBox;

/**
 * Inherited from {@link javax.swing.JButton}, it's a basic model for all the buttons used in the {@link MazePanel}.
 * <p>
 * In detail, it contains:
 * <p> Two ways of construction - a new block {@link BoxM#BoxM(MazeGame)} - a replacement of other type {@link BoxM#BoxM(MazeGame, int, int)}
 * <p> Setters and Getters of the direction of passage {@link BoxM#setPassLeftToRight(int)}, {@link BoxM#setPassTopToBottom(int)}, {@link BoxM#getPassLeftToRight()}, {@link BoxM#getPassTopToBottom()}
 * <p> Get the label of the bloc {@link MBox#getLabel()}
 * @author Liamxh
 * @version 2.1
 */

public abstract class BoxM extends JButton{
	private final MazeGame mazeGame;
	/**
	 * passLeftToRight have 3 values:
	 * <p> -1 : pass the button from its right side
	 * <p> 0 : not passed
	 * <p> 1 : pass the button from its left side
	 */
	private int passLeftToRight;
	/**
	 * passTopToBottom have 3 values:
	 * <p> -1 : pass the button from its bottom
	 * <p> 0 : not passed
	 * <p> 1 : pass the button from its top
	 */
	private int passTopToBottom;
	/**
	 * This constructor is to create a brand new button in the maze in modification
	 */
	public BoxM() {
		super();
		this.mazeGame = null;
		setPreferredSize(new Dimension(30,30));
		passLeftToRight=0;
		passTopToBottom=0;
	}
	/**
	 * This constructor is to create a brand new button in the maze
	 * @param mazeGame the main window
	 */
	public BoxM(MazeGame mazeGame) {
		super();
		this.mazeGame=mazeGame;
		setPreferredSize(new Dimension(30,30));
		passLeftToRight=0;
		passTopToBottom=0;
	}
	/**
	 * This constructor is used to replace the type of the button without changing others parameters.
	 * @param mazeGame the main window
	 * @param passLeftToRight the parameter passLeftToRight of the initial button
	 * @param passTopToBottom the parameter passTopToBottom of the initial button
	 */
	public BoxM(MazeGame mazeGame, int passLeftToRight, int passTopToBottom) {
		super();
		this.mazeGame = mazeGame;
		this.passLeftToRight = passLeftToRight;
		this.passTopToBottom = passTopToBottom;
	}
	/**
	 * Get the type of the button in the maze
	 */
	abstract public String getLabel();
	/**
	 * @return the passLeftToRight
	 */
	public int getPassLeftToRight() {
		return passLeftToRight;
	}
	/**
	 * @param passLeftToRight the passLeftToRight to set
	 */
	public void setPassLeftToRight(int passLeftToRight) {
		this.passLeftToRight = passLeftToRight;
	}
	/**
	 * @return the passTopToBottom
	 */
	public int getPassTopToBottom() {
		return passTopToBottom;
	}
	/**
	 * @param passTopToBottom the passTopToBottom to set
	 */
	public void setPassTopToBottom(int passTopToBottom) {
		this.passTopToBottom = passTopToBottom;
	};
	
}
