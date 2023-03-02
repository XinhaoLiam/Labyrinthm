package mazeUI;

import maze.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Implementing {@link java.awt.event.ActionListener},
 * this class is to realize the function of loading the maze from text file
 * and create a new window for the game {@link MazeGame}.
 * @author Liamxh
 * @version 2.1
 */

public class LoadButtonAction implements ActionListener{
	private MazeGame mazeGame;
	private Maze maze;
	private MazePanel mazePanel;
	private DirectionPanel directionPanel;
	private SolutionButton solutionButton;
	public LoadButtonAction(MazeGame mazeGame, Maze maze,MazePanel mazePanel, DirectionPanel directionPanel, SolutionButton solutionButton) {
		this.mazeGame=mazeGame;
		this.maze=maze;
		this.mazePanel=mazePanel;
		this.directionPanel=directionPanel;
		this.solutionButton=solutionButton;
	}
	/**
	 * This function uses {@link javax.swing.JFileChooser} to choose a file from the fileSystem,
	 * <p> then applies {@link Maze#initFromTextFile(String)} to load in the maze,
	 * <p> then establishes the matrix of button using the template {@link mazeUI.BoxE}.
	 * <p> Besides, it also sets up other components in {@link mazeUI.MazePanel}, including:
	 * <p> - A direction panel {@link mazeUI.DirectionPanel}
	 * <p> - A file operation panel {@link mazeUI.FileOperationPanel}
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Choose the file from the file system
		File file=null;
		File directory=new File("");
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.setDialogTitle("Choose a txt to load");
		try {
			fileChooser.setCurrentDirectory(new File(directory.getCanonicalPath()+"/data"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		fileChooser.setApproveButtonText("Ok");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);;
	    fileChooser.setVisible(true);
	    int ret=fileChooser.showOpenDialog(null);
	    if (ret==JFileChooser.APPROVE_OPTION) {
	    	file=fileChooser.getSelectedFile();
			try {
				//Read the file
				maze.initFromTextFile(file.getPath());
			} catch (MazeReadingException e1) {
				e1.printStackTrace();
			};
			
			mazeGame.dispose();
			
			int rangMaze=maze.getRow();
			int columeMaze=maze.getColume();
			
			//Start constructing the window
			mazeGame=new MazeGame(maze,rangMaze,columeMaze);
			MazePanel mazePanel=mazeGame.getWindowPanel().getMazePanel();
			DirectionPanel directionPanel=mazeGame.getWindowPanel().getMazeButtonPanel().getDirectionPanel();
			SolutionButton solutionButton=mazeGame.getWindowPanel().getMazeButtonPanel().getFileOperationPanel().getSolutionButton();
			
			mazePanel.setMaze(maze);
	    
			directionPanel.setDirectionEnabled(true);
			directionPanel.setResetEnabled(true);
	    
			solutionButton.setEnabled(true);
			
			//Establish the Buttons for the maze
			ArrayList<ArrayList<MBox>> loadedMaze=maze.getBoxes();
			System.out.printf("%d %d\n", rangMaze,columeMaze);
			mazePanel.setRow(rangMaze);
			mazePanel.setColume(columeMaze);
			ArrayList<ArrayList<BoxM>> mazeButtons=new ArrayList<ArrayList<BoxM>>();
			for (int i=0;i<rangMaze;i++) {
				ArrayList<BoxM> rangButtons=new ArrayList<BoxM>();
				for (int j=0;j<columeMaze;j++) {
					switch (loadedMaze.get(i).get(j).getLabel()) {
	    				case "W" :
	    					rangButtons.add(new BoxW(mazeGame));
	    					break;
	    				case "E" :
	    					rangButtons.add(new BoxE(mazeGame));
	    					break;
	    				case "A" :
	    					rangButtons.add(new BoxA(mazeGame));
	    					break;
	    				case "D" :
	    					rangButtons.add(new BoxD(mazeGame));
	    					mazePanel.setRowStart(i);
	    					mazePanel.setColumeStart(j);
	    					mazePanel.setRowDepart(i);
	    					mazePanel.setColumeDepart(j);
	    					break;
					}
				}
				mazeButtons.add(rangButtons);
			}
			//Upload the matrix of buttons to the Panel
			mazePanel.setMazeButtons(mazeButtons);
			//Leave a copy for the original one to reset the maze
			mazePanel.setMazeButtonsOrigin(mazePanel.cloneMazeButtonsOrigin(mazeButtons));
	    }
    }
}
