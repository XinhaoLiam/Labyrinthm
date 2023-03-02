package maze;

/**
 *  Inherited from {@link MBox}, this class is to describe a departure block.
 * <p>
 * In detail, it can :
 * <p>Store the position of the block {@link DBox#DBox(int, int)}
 * <p>Output the label of the block {@link DBox#getLabel()}
 * 
 * @author Liamxh
 * @version 1.3
 */

public class DBox 
	extends MBox{
	/**
	 * Store the position of the bloc
	 * @param colume the colume of the box
	 * @param rank the row of the box
	 */
	public DBox(int colume, int rank) {
		this.setColume(colume);
		this.setRank(rank);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the Depature ("D")
	 */
	public String getLabel() {
		return "D";
	}
}
