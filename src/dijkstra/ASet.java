package dijkstra;

import java.util.HashSet;

/**
 * Using a template of {@link ASetInterface}, a set is established to 
 * record all the vertex with a route fix.
 * <p>
 * In detail, we use HashSet to store all the vertexes {@link java.util.HashSet}
 * 
 * @author Liamxh
 * @version 1.2
 */

public class ASet implements ASetInterface {
	/** All the vertexes with a chemin fixed 
	 *  @param VertexInterface {@link dijkstra.VertexInterface}
	 */
	private HashSet<VertexInterface> aSet;
	/** Constructor*/
	public ASet() {
		aSet=new HashSet<VertexInterface>();
	}
	@Override
	public void addVertex(VertexInterface vertex) {
		// TODO Auto-generated method stub
		aSet.add(vertex);
	}
	@Override
	public boolean inASet(VertexInterface vertex) {
		// TODO Auto-generated method stub
		return aSet.contains(vertex);
	}

}
