package maze;

import java.util.ArrayList;

import dijkstra.GraphInterface;
import dijkstra.VertexInterface;

import java.lang.String;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Inherited from {@link dijkstra.GraphInterface}, this class contains all the variables 
 * and methods for a maze, seeing it as a graph.
 * <p>
 * In detail, It contains the methods:
 * 
 * <p>Read the labyrinth from a text file {@link Maze#initFromTextFile(String)};
 * <p>Reprint the labyrinth to check the reading program {@link Maze#saveToTextFile(String)}
 * <p>Get all the vertex that can be passed {@link Maze#getAllVertices()};
 * <p>Get all the neighbors of a vertex given {@link Maze#getSuccessors(VertexInterface)};
 * <p>Get the weight of each edge {@link Maze#getWeight(VertexInterface, VertexInterface)};
 * <p>Print out the solution of the maze {@link Maze#printSolution(ArrayList)}
 * <p>Print out the solution into a file {@link Maze#printSolutionToTextFile(ArrayList, String)}
 * 
 * @author Liamxh
 * @version 1.12
 */
public class Maze 
	implements GraphInterface{
	/**the matrix to store the maze*/
	private ArrayList<ArrayList<MBox>> boxes=new ArrayList<ArrayList<MBox>>();
	/** row of the maze */
	private int row;
	/**column of the maze*/
	private int colume;
	/**departure*/
	private VertexInterface depart;
	/**destination*/
	private VertexInterface arrive;
	@Override
	public ArrayList<VertexInterface> getAllVertices(){
		ArrayList<VertexInterface> vertexList=new ArrayList<VertexInterface>();
		for (ArrayList<MBox> vertexes : boxes)
			for (MBox vertex : vertexes)
				if (vertex.getLabel()!="W")
					vertexList.add(vertex);
		return vertexList;
	}
	@Override
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){
		ArrayList<VertexInterface> successeurList=new ArrayList<VertexInterface>();
		MBox box=(MBox)vertex;
		int i=box.getRank(),j=box.getColume();
		String label;
		VertexInterface currentVertex;
		if (j-1>=0) {
			currentVertex=boxes.get(i).get(j-1);
			label=currentVertex.getLabel();
			if (!label.equals("W")) 
				successeurList.add(currentVertex);
		}
		if (j+1<colume) {
			currentVertex=boxes.get(i).get(j+1);
			label=currentVertex.getLabel();
			if (!label.equals("W"))
				successeurList.add(currentVertex);
		}
		if (i-1>=0) {
			currentVertex=boxes.get(i-1).get(j);
			label=currentVertex.getLabel();
			if (!label.equals("W")) 
				successeurList.add(currentVertex);
		}	
		if (i+1<colume) {
			currentVertex=boxes.get(i+1).get(j);
			label=currentVertex.getLabel();
			if (!label.equals("W")) 
				successeurList.add(currentVertex);
		}	
		return successeurList;
	}
	@Override
	public int getWeight(VertexInterface src, VertexInterface dst) {
		return 1;
	}
	/**
	 * This method read the labyrinth from a text file
	 * and store it into a n*n matrix
	 * @param filename the maze to input
	 * 
	 * @throws MazeReadingException judge several cases : 
	 * <p>Input not W,A,D,E; 
	 * <p>Two D or two A; 
	 * <p>No D or No A;
	 * <p>Number of elements not correct in a row;
	 * 
	 * @see MazeReadingException
	 * @see FileNotFoundException
	 * @see IOException
	 * @see Exception
	 */
	public final void initFromTextFile(String filename)
		throws MazeReadingException{
		BufferedReader input = null;
		this.boxes=new ArrayList<ArrayList<MBox>>(); 
		try {
			input = new BufferedReader(new FileReader(filename));
			String line=input.readLine();
			boolean haveDepart=false,haveArrivee=false;
			int i=0,k=0; //i=rang,k=colonne
			setColume(line.length()); //the colonne have to be the same for a maze
			while (line!=null) {
				//Judge the column number
				if (getColume()!=line.length())
					throw new MazeReadingException(filename,i+1,": Wrong number of elements in the rang ");
				//Add to a new row
				ArrayList<MBox> rang=new ArrayList<MBox>();
				for (k=0;k<line.length();k++){ 
					switch(line.charAt(k)) {
						case 'E': 
							rang.add(new EBox(k,i));break;
						case 'D': 
							rang.add(new DBox(k,i));
							depart=rang.get(k);
							if (haveDepart) 
								throw new MazeReadingException(filename,i+1,": Second departure in the rang ");
							else 
								haveDepart=true;
							break;
						case 'A': 
							rang.add(new ABox(k,i));
							arrive=rang.get(k);
							if (haveArrivee) 
								throw new MazeReadingException(filename,i+1,": Second arrival in the rang ");
							else 
								haveArrivee=true;
							break;
						case 'W': 
							rang.add(new WBox(k,i));break;
						default :
							throw new MazeReadingException(filename,i+1,": Input illegal in the rang ");
					}
				}
				//Add to the maze
				boxes.add(rang);
				i++;
				line=input.readLine();
			};
			if (!haveDepart || !haveArrivee)
				throw new MazeReadingException(filename,": No departure or destination");
			//Record the row
			setRow(i);
		} catch (FileNotFoundException error) { //Not found
			error.printStackTrace();
		} catch (IOException error) { //Can't read
			error.printStackTrace();
		} catch (Exception error) { //Other types
			error.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (Exception error) { //Can't close
				error.printStackTrace();
			}
		}	
	}
	/**
	 * @return the boxes
	 */
	public ArrayList<ArrayList<MBox>> getBoxes() {
		return boxes;
	}
	/**
	 * This method reprints the labyrinth from the matrix,
	 * and store it in a text file.
	 * @param filename the file to save
	 * @see IOException
	 * @see Exception
	 */
	public final void saveToTextFile(String filename) {
		PrintWriter pw=null;
		try{
			pw=new PrintWriter(new FileWriter(filename));
			for (ArrayList<MBox> b : boxes) {
				for (MBox box : b){
					pw.print(box.getLabel());
				}
				pw.println();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				pw.close();
			}catch(Exception e) {};
		} 	
	}
	/**
	 * It's the getter of row.
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	/**
	 * It's the setter of row.
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}
	/**
	 * It's the getter of colume.
	 * @return the colume
	 */
	public int getColume() {
		return colume;
	}
	/**
	 * It's the setter of colume.
	 * @param colume the colume to set
	 */
	public void setColume(int colume) {
		this.colume = colume;
	}
	/**
	 * It's the getter of depart.
	 * @return the depart
	 */
	public VertexInterface getDepart() {
		return depart;
	}
	/**
	 * It's the setter of depart.
	 * @param depart the depart to set
	 */
	public void setDepart(VertexInterface depart) {
		this.depart = depart;
	}
	/**
	 * It's the getter of arrive.
	 * @return the arrive
	 */
	public VertexInterface getArrive() {
		return arrive;
	}
	/**
	 * It's the setter of arrive.
	 * @param arrive the arrive to set
	 */
	public void setArrive(VertexInterface arrive) {
		this.arrive = arrive;
	}
	/**
	 * Print the solution of the maze in the Console,
	 * if no solution, print "No solution"
	 * @param chemin the answer of the maze
	 */
	public void printSolution(ArrayList<VertexInterface> chemin) {
		if (chemin.size()==0) 
			System.out.println("No Solution");
		for (ArrayList<MBox> rang : boxes) {
			for (MBox box : rang) 
				//Replace all the chemin with '*' except D & A
				if (chemin.contains(box) && !box.getLabel().equals("A"))
					System.out.print("*");
				else
					System.out.print(box.getLabel());
			System.out.println();
		}
	}
	/**
	 * Print the solution of the maze to a txt file,
	 * if no solution, print "No solution"
	 * @param chemin the answer of the maze
	 * @param filename the name of the file wanted
	 */
	public final void printSolutionToTextFile(ArrayList<VertexInterface> chemin, String filename) {
		PrintWriter pw=null;
		try{
			pw=new PrintWriter(new FileWriter(filename));
			if (chemin.size()==0) 
				pw.println("No Solution");
			for (ArrayList<MBox> b : boxes) {
				for (MBox box : b)
					if (chemin.contains(box) && !box.getLabel().equals("A"))
						pw.print("*");
					else
						pw.print(box.getLabel());
				pw.println();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				pw.close();
			}catch(Exception e) {};
		} 	
	}
}
