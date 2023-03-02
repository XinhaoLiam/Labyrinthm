package dijkstra;
/**
 * This class is designed to apply the Dijkstra and contains only a method {@link Dijkstra#dijkstra(GraphInterface, VertexInterface)}.
 * @author Liamxh
 * @version 1.2
 */
public class Dijkstra 
{   
	/**
	 * This method realize the algorithm of Dijkstra.
	 * @param g Graph to solve
	 * @param r the departure
	 * @return the function predecessor
	 * 
	 * @see dijkstra.VertexInterface
	 */
	public static PreviousInterface dijkstra(GraphInterface g, VertexInterface r) {
		
		ASet aSet=new ASet();
		Pi pi=new Pi();
		Previous pere=new Previous();
		//Initialization
		aSet.addVertex(r);
		VertexInterface pivot=r;
		pi.setPiValue(r, 0);
		for (VertexInterface v : g.getAllVertices()) {
			if (v!=r) pi.setPiValue(v, (int)Float.POSITIVE_INFINITY);
		}
		
		int n=g.getAllVertices().size();
		for (int i=0;i<n;i++) {
			//Refresh the weight if necessary
			for (VertexInterface succ : g.getSuccessors(pivot)) {
				if (!aSet.inASet(succ)) {
					int val=pi.getPiValue(pivot)+g.getWeight(pivot, succ);
					if (val<pi.getPiValue(succ)) {
						pi.setPiValue(succ, val);
						pere.setValue(succ, pivot);
					}
				}
			}
			//Find the smallest pi value
			int min=(int)Float.POSITIVE_INFINITY;
			for (VertexInterface vertex : g.getAllVertices()) {
				if (!aSet.inASet(vertex) && min>pi.getPiValue(vertex)) {
					min=pi.getPiValue(vertex);
					pivot=vertex;
				}
			}
			//For the next iteration
			aSet.addVertex(pivot);
			//If the weight of destination is fixed
			//We don4t have to go further
			if (pivot.getLabel().equals("A")) return pere;
		}
		return pere;
	}
}
