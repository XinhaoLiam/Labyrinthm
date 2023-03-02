package mazeUI;

import dijkstra.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import maze.*;

/**
 * Implementing {@link java.awt.event.ActionListener},
 * this class is to realize the function of showing the solution of the maze.
 * @author Liamxh
 * @version 2.1
 */

public class SolutionButtonAction implements ActionListener {
	private final MazeGame mazeGame;
	private MazePanel mazePanel;
	private DirectionPanel directionPanel;
	
	public SolutionButtonAction(MazeGame mazeGame, MazePanel mazePanel, DirectionPanel directionPanel) {
		super();
		this.mazeGame = mazeGame;
		this.mazePanel = mazePanel;
		this.directionPanel=directionPanel;
	}
	/**
	 * To show the solution of the maze, we use the {@link Dijkstra#dijkstra(GraphInterface, VertexInterface)}.
	 * <p> The whole method contains the following steps :
	 * <p> First, we reset the maze to the initial version.
	 * <p> Then, we use {@link Dijkstra#dijkstra(GraphInterface, VertexInterface)} to find the solution
	 * <p> After that, based on the result, we change the road button {@link BoxE} into the solution button {#link BoxS}
	 * <p> Finally, we disable some buttons.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//Reset the maze to the initial version
		mazePanel.setMazeButtons(mazePanel.cloneMazeButtonsOrigin(mazePanel.getMazeButtonsOrigin()));
		int currentRow=mazePanel.getRowStart();
		
		//Apply Dijkstra
		Dijkstra dijkstra = new Dijkstra();
		Maze maze=mazePanel.getMaze();
		ArrayList<ArrayList<BoxM>> mazeBox=mazePanel.getMazeButtons(); 
		ArrayList<VertexInterface> chemin=dijkstra.dijkstra(maze,maze.getDepart()).getShortestPath(maze.getArrive());
		
		//Based on the result, show the solution
		
		//If no solution
		if (chemin.size()==0) 
			JOptionPane.showMessageDialog(null, "Stop trying! There is no solution.");
		//If ther is a solution
		ArrayList<ArrayList<MBox>> boxes=maze.getBoxes();
		int row=mazePanel.getRow();
		int colume=mazePanel.getColume();
		for (int i=0;i<row;i++) {
			for (int j=0;j<colume;j++) {
				MBox box=boxes.get(i).get(j);
				if (chemin.contains(box) && !box.getLabel().equals("A"))
					mazeBox.get(i).set(j, new BoxS(mazeGame));
		
			}
		}
		
		//Disable the buttons
		this.directionPanel.setDirectionEnabled(false);
		mazePanel.setMazeButtons(mazeBox);
	}		
}
