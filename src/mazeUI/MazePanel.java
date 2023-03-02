package mazeUI;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import maze.Maze;

/**
 * Inherited from {@link javax.swing.JPanel}, this panel contains the maze
 * and will show the result of the buttons.
 * @see Maze
 * @author Liamxh
 * @version 2.1
 */

public class MazePanel extends JPanel{
	private final MazeGame mazeGame;
	private ArrayList<ArrayList<BoxM>> mazeButtons;
	private ArrayList<ArrayList<BoxM>> mazeButtonsOrigin;
	private Maze maze;
	/** the pixel x of the departure */
	private int rowDepart;
	/** the pixel y of the departure */
	private int columeDepart;
	/** the pixel x of the current starting point */
	private int rowStart;
	/** the pixel y of the current starting point */
	private int columeStart;
	/** row of the maze */
	private int row;
	/** colome of the maze */
	private int colume;
	
	public MazePanel(MazeGame mazeGame,Maze maze,int row,int colume) {
		this.mazeGame=mazeGame;
		this.maze=maze;
		this.rowDepart=-1;
		this.columeDepart=-1;
		this.rowStart=-1;
		this.columeStart=-1;
		this.row=row;
		this.colume=colume;
		setPreferredSize(new Dimension(31*colume,31*row));
	}
	/**
	 * This method is to clone the {@link java.util.ArrayList} with another address.
	 * @param mazeButtons the ArrayList to be copied
	 * @return the new ArrayList cloned
	 */
	public ArrayList<ArrayList<BoxM>> cloneMazeButtonsOrigin(ArrayList<ArrayList<BoxM>> mazeButtons){
		ArrayList<ArrayList<BoxM>> mazeButtonsOrigin=new ArrayList<ArrayList<BoxM>>();
	    for (ArrayList<BoxM> rang : mazeButtons) {
    		mazeButtonsOrigin.add((ArrayList<BoxM>)rang.clone());
    	}
	    return mazeButtonsOrigin;
	}
	/**
	 * @return the mazeButtons
	 */
	public ArrayList<ArrayList<BoxM>> getMazeButtons() {
		return mazeButtons;
	}
	/**
	 * @param mazeButtons the mazeButtons to set
	 */
	public void setMazeButtons(ArrayList<ArrayList<BoxM>> mazeButtons) {
		this.mazeButtons=new ArrayList<ArrayList<BoxM>>();
		this.mazeButtons = mazeButtons;
		removeAll();
		int rangMaze=mazeButtons.size();
		int columeMaze=mazeButtons.get(0).size();
		this.setLayout(new BorderLayout(1,1));
		JPanel jP=new JPanel();
		jP.setMaximumSize(new Dimension(31*row,31*colume));
		jP.setMinimumSize(new Dimension(31*row,31*colume));
		jP.setPreferredSize(new Dimension(31*row,31*colume));
		//Place the buttons
		GridLayout gL=new GridLayout(0,columeMaze,1,1);
		jP.setLayout(gL);
		for (int i=0;i<rangMaze;i++) {
	    	for (int j=0;j<columeMaze;j++) {
	    		jP.add(mazeButtons.get(i).get(j));
	    	}
	    }
		jP.setVisible(true);
		jP.validate();
		jP.repaint();
		this.add(jP,BorderLayout.CENTER);
		this.setVisible(true);
		this.validate();
		this.repaint();
		mazeGame.pack();
		mazeGame.validate();
		mazeGame.repaint();
	}
	/**
	 * @return the rowDepart
	 */
	public int getRowDepart() {
		return rowDepart;
	}
	/**
	 * @param rowDepart the rowDepart to set
	 */
	public void setRowDepart(int rowDepart) {
		this.rowDepart = rowDepart;
	}
	/**
	 * @return the columeDepart
	 */
	public int getColumeDepart() {
		return columeDepart;
	}
	/**
	 * @param columeDepart the columeDepart to set
	 */
	public void setColumeDepart(int columeDepart) {
		this.columeDepart = columeDepart;
	}
	/**
	 * @return the rowStart
	 */
	public int getRowStart() {
		return rowStart;
	}
	/**
	 * @param rowStart the rowStart to set
	 */
	public void setRowStart(int rowStart) {
		this.rowStart = rowStart;
	}
	/**
	 * @return the columeStart
	 */
	public int getColumeStart() {
		return columeStart;
	}
	/**
	 * @param columeStart the columeStart to set
	 */
	public void setColumeStart(int columeStart) {
		this.columeStart = columeStart;
	}
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}
	/**
	 * @return the colume
	 */
	public int getColume() {
		return colume;
	}
	/**
	 * @param colume the colume to set
	 */
	public void setColume(int colume) {
		this.colume = colume;
	}
	/**
	 * @return the maze
	 */
	public Maze getMaze() {
		return maze;
	}
	/**
	 * @param maze the maze to set
	 */
	public void setMaze(Maze maze) {
		this.maze = maze;
	}
	/**
	 * @return the mazeButtonsOrigin
	 */
	public ArrayList<ArrayList<BoxM>> getMazeButtonsOrigin() {
		return mazeButtonsOrigin;
	}
	/**
	 * @param mazeButtonsOrigin the mazeButtonsOrigin to set
	 */
	public void setMazeButtonsOrigin(ArrayList<ArrayList<BoxM>> mazeButtonsOrigin) {
		this.mazeButtonsOrigin = mazeButtonsOrigin;
	}
	
}
