package dijkstra;

import java.util.ArrayList;

/**
 * This is a template for the function of predecessor,
 * used to recall the route
 * <p>
 * In detail, it contains the following methods in common:
 * <p> Set the value of the function {@link PreviousInterface#setValue(VertexInterface, VertexInterface)}
 * <p> Get the value of the vertex according to function {@link PreviousInterface#getValue(VertexInterface)}
 * <p> Get the path from the function {@link PreviousInterface#getShortestPath(VertexInterface)}
 * @author Liamxh
 * @version 1.2
 */

public interface PreviousInterface {
	/**
	 * Set the value of the function
	 * @param vertex the vertex wanting a father
	 * @param value the vertex to be a father
	 */
	public void setValue(VertexInterface vertex, VertexInterface value);
	/**
	 * Get the value of the vertex according to function
	 * @param vertex the vertex for search
	 * @return the value of the vertex according to the function
	 */
	public VertexInterface getValue(VertexInterface vertex);
	/**
	 * Get the path from the function
	 * 
	 * @param vertex the vertex showing his father
	 * @return the father of the vertex
	 * 
	 * @see dijkstra.VertexInterface
	 */
	public ArrayList<VertexInterface> getShortestPath(VertexInterface vertex);

}
