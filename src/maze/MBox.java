package maze;

import dijkstra.VertexInterface;

/**
 * Inherited from {@link dijkstra.VertexInterface}, it's a basic model for all the blocs contained in a labyrinth.
 * <p>
 * In detail, it contains:
 * <p> Setters and Getters of the position {@link MBox#setColume(int)}, {@link MBox#setRank(int)}, {@link MBox#getColume()}, {@link MBox#getRank()}
 * <p> Get the label of the bloc {@link MBox#getLabel()}
 * @author Liamxh
 * @version 1.2
 */

public abstract class MBox 
	implements VertexInterface{
	/**Column of the Box*/
	private int colume; 
	/**Rank of the Box*/
	private int rank;
	/**
	 * Getter of the column
	 * @return the column
	 */
	public final int getColume() {
		return colume;
	}
	/**
	 * Setter of the column
	 * @param colume the column to set
	 */
	public final void setColume(int colume) {
		this.colume = colume;
	}
	/**
	 * Getter of the rank
	 * @return the rank
	 */
	public final int getRank() {
		return rank;
	}
	/**
	 * Setter of the rank
	 * @param rank the rank to set
	 */
	public final void setRank(int rank) {
		this.rank = rank;
	}
	/**
	 *{@inheritDoc}
	 * @return the label of each box
	 */
	@Override
	public abstract String getLabel(); 
}
