package dijkstra;

/**
 * This is a template for the function pi to store 
 * the weight of the current route.
 * <p>
 * In detail, it contains the following methods in common:
 * <p> Set the value of the function {@link PiInterface#setPiValue(VertexInterface, int)}
 * <p> Get the corresponding value {@link PiInterface#getPiValue(VertexInterface)}
 * @author Liamxh
 * @version 1.2
 */

public interface PiInterface {
	/**
	 * Setter of a value for the function
	 * @param vertex the vertex wanting a value of the route
	 * @param value the value to be added
	 * 
	 * @see dijkstra.VertexInterface
	 */
	public void setPiValue(VertexInterface vertex,int value);
	/**
	 * Getter of the corresponding value
	 * @param vertex the vertex to show the value of the route
	 * @return the value of the route reaching the vertex given
	 * @see dijkstra.VertexInterface
	 */
	public int getPiValue(VertexInterface vertex);
}
