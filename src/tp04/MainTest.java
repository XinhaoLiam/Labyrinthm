package tp04;

import dijkstra.Dijkstra;
import maze.Maze;
import maze.MazeReadingException;

public class MainTest {

	public static void main(String[] args) throws MazeReadingException {
		// TODO Auto-generated method stub
		Maze mazetest=new Maze();
		mazetest.initFromTextFile("data/labyrinthe.txt");
		//mazetest.saveToTextFile("data/labyrinthe2.txt");
		Dijkstra dijkstra = new Dijkstra();
		//mazetest.printSolution(dijkstra.dijkstra(mazetest,mazetest.getDepart()).getShortestPath(mazetest.getArrive()));
		mazetest.printSolutionToTextFile(dijkstra.dijkstra(mazetest,mazetest.getDepart()).getShortestPath(mazetest.getArrive()), "data/labyrintheS.txt");
	}

}
