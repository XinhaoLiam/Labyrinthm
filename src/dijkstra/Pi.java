package dijkstra;

import java.util.Hashtable;
/**
 * Using a template of {@link PiInterface}, a HashTable is established to 
 * record all the vertex with the value of the current route.
 * <p>
 * In detail, we use Hashtable to store all the vertexes {@link java.util.Hashtable}
 * 
 * @author Liamxh
 * @version 1.2
 */

public class Pi implements PiInterface {
	/** pi(vertex)=weight of the road to it*/
	private Hashtable<VertexInterface,Integer> pi;
	/** Constructor*/
	public Pi() {
		pi=new Hashtable<VertexInterface,Integer>();
	}
	@Override
	public void setPiValue(VertexInterface vertex, int value) {
		// TODO Auto-generated method stub
		pi.put(vertex, value);
	}
	@Override
	public int getPiValue(VertexInterface vertex) {
		// TODO Auto-generated method stub
		Integer integer=pi.get(vertex);
		return integer.intValue();
	}

}
