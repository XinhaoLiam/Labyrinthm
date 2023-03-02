package maze;

/**
 *  Inherited from {@link MBox}, this class is to describe an road block.
 * <p>
 * In detail, it can :
 * <p>Store the position of the block {@link EBox#EBox(int, int)}
 * <p>Output the label of the block {@link EBox#getLabel()}
 * 
 * @author Liamxh
 * @version 1.3
 */

public class EBox 
	extends MBox{
	/**
	 * Store the position of the bloc 
	 * @param colume the colume of the box
	 * @param rank the row of the box
	 */
	public EBox(int colume, int rank) {
		this.setColume(colume);
		this.setRank(rank);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the Road ("E")
	 */
	public String getLabel() {
		return "E";
	}
}
