package dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Using a template of {@link PreviousInterface}, a HashTable is established to 
 * record all the vertex with its father in the route.
 * <p>
 * In detail, we use Hashtable to store all the vertexes {@link java.util.Hashtable}
 * 
 * @author Liamxh
 * @version 1.2
 */

public class Previous implements PreviousInterface {
	/** pres(Vertex)=its father*/ 
	private Hashtable<VertexInterface,VertexInterface> pres;
	/** Constructor*/
	public Previous() {
		pres=new Hashtable<VertexInterface,VertexInterface>();
	}
	@Override
	public void setValue(VertexInterface vertex, VertexInterface value){
		// TODO Auto-generated method stub
		pres.put(vertex, value);
	}
	@Override
	public VertexInterface getValue(VertexInterface vertex) {
		// TODO Auto-generated method stub
		return pres.get(vertex);
	}
	@Override
	public ArrayList<VertexInterface> getShortestPath(VertexInterface vertex) {
		// TODO Auto-generated method stub
		ArrayList<VertexInterface> chemin=new ArrayList<VertexInterface>();
		VertexInterface currentVertex=vertex; 
		while (pres.containsKey(currentVertex)){
			chemin.add(currentVertex);
			currentVertex=getValue(currentVertex);
		}; 
		return chemin;
	}

}
