package dijkstra;

/**
 * This is a template for the ASet.
 * <p>
 * In detail, it contains one public method {@link VertexInterface#getLabel()}
 * @author Liamxh
 * @version 1.2
 */

public interface ASetInterface {
	/**
	 * Add the vertex into the set
	 * @param vertex the vertex to be added
	 */
	public void addVertex(VertexInterface vertex);
	/**
	 * Judge if a vertex is in the ASet
	 * @param vertex the vertex to be checked
	 * @return if the vertex is in the set
	 */
	public boolean inASet(VertexInterface vertex);
}