package startUI;

import mazeUI.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import maze.MBox;
import maze.Maze;
import maze.MazeReadingException;

/**
 * Using the interface of {@link java.awt.event.ActionListener}, 
 * this class is to implement the function of {@link StartButton}.
 * Its function includes :
 * <p> Choose the text file of maze in the file system {@link javax.swing.JFileChooser}
 * <p> Establishing a new window for the game {@link mazeUI}
 * @author Liamxh
 * @version 2.1
 */

public class StartButtonAction implements ActionListener{
	/**
	 * This function uses {@link javax.swing.JFileChooser} to choose a file from the fileSystem,
	 * <p> then applies {@link Maze#initFromTextFile(String)} to load in the maze,
	 * <p> then establishes the matrix of button using the template {@link BoxE}.
	 * <p> Besides, it also sets up other components in {@link MazePanel}, including:
	 * <p> - A direction panel {@link DirectionPanel}
	 * <p> - A file operation panel {@link FileOperationPanel}
	 */
	public void actionPerformed(ActionEvent e) {
		Maze maze=new Maze(); 
		
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
			int rangMaze=maze.getRow();
			int columeMaze=maze.getColume();
			//Start constructing the window
			MazeGame mazeGame=new MazeGame(maze,rangMaze,columeMaze);
			MazePanel mazePanel=mazeGame.getWindowPanel().getMazePanel();
			DirectionPanel directionPanel=mazeGame.getWindowPanel().getMazeButtonPanel().getDirectionPanel();
			SolutionButton solutionButton=mazeGame.getWindowPanel().getMazeButtonPanel().getFileOperationPanel().getSolutionButton();
	    
			directionPanel.setDirectionEnabled(true);
			directionPanel.setResetEnabled(true);
	    
			solutionButton.setEnabled(true);
			
			//Establish the Buttons for the maze
			ArrayList<ArrayList<MBox>> loadedMaze=maze.getBoxes();
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
