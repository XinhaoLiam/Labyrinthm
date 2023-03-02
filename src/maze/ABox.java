package maze;

/**
 *  Inherited from {@link MBox}, this class is to describe an arrival block.
 * <p>
 * In detail, it can :
 * <p>Store the position of the block {@link ABox#ABox(int, int)}
 * <p>Output the label of the block {@link ABox#getLabel()}
 * 
 * @author Liamxh
 * @version 1.3
 */


public class ABox 
	extends MBox{ 
	/**
	 * Store the position of the bloc
	 * @param colume the column of the box
	 * @param rank the row of the box
	 */
	public ABox(int colume, int rank) {
		this.setColume(colume);
		this.setRank(rank);
	}
	/**
	 * {@inheritDoc}}
	 * @return the label of the Destination ("A")
	 */
	public String getLabel() {
		return "A";
	}
}
