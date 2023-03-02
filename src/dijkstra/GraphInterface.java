package dijkstra;

import java.util.ArrayList;

/**
 * This is a template for a graph.
 * <p>
 * In detail, it contains several methods in common:
 * <p> Take all the vertexes in the graph {@link GraphInterface#getAllVertices()}
 * <p> List all the neighbors of the vertex provided {@link GraphInterface#getSuccessors(VertexInterface)}
 * <p> Get the weight of the edge {@link GraphInterface#getWeight(VertexInterface, VertexInterface)}
 * @author Liamxh
 * @version 1.2
 */

public interface GraphInterface {
	/**
	 * Take all the vertexes in the graph
	 * @return All the vertexes (not the Wall)
	 * @see dijkstra.VertexInterface
	 */
	public ArrayList<VertexInterface> getAllVertices();
	/**
	 * List all the neighbors of the vertex provided
	 * @param vertex the point to be checked
	 * @return the list of its neighbor (not the Wall)
	 * @see dijkstra.VertexInterface
	 */
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex);
	/**
	 * Get the weight of the edge
	 * @param src one extremity of one edge
	 * @param dst another extremity of one edge
	 * @return the weight of the edge (fixed to 1 here) 
	 */
	public int getWeight(VertexInterface src, VertexInterface dst);
}
