package maze;

/**
 * Inherited from {@link MBox}, this class is to describe the wall block inherited from {@link MBox}.
 * <p>
 * In detail, it can :
 * <p>Store the position of the block {@link WBox#WBox(int, int)}
 * <p>Output the label of the block {@link WBox#getLabel()}
 * 
 * @author Liamxh
 * @version 1.3
 */

public class WBox 
	extends MBox{
	/**
	 * Store the position of the wall Bloc
	 * @param colume the column of the box
	 * @param rank the row of the box
	 */
	public WBox(int colume, int rank) {
		this.setColume(colume);
		this.setRank(rank);
	}
	/**
	 * {@inheritDoc}
	 * @return the label of the Wall ("W")
	 */
	public String getLabel() {
		return "W";
	}
}
