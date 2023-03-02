package maze;
/**
 * This class is for identifying the errors in the form of the labyrinth
 * <p>
 * It will print a message containing the file, the error and the position of the error. 
 * @author Liamxh
 *
 */
public class MazeReadingException 
	extends Exception {
	/**
	 * There is no error with this.
	 * But I don't know its meaning 
	 */
	private static final long serialVersionUID = 1L;
	/** Error message*/
	private String msg;
	/**
	 * Constitute the error message with the arguments 
	 * @param fileName Error file
	 * @param rang Error rank
	 * @param msg Error message
	 */
	public MazeReadingException(String fileName, int rang, String msg) { //Wrong colonne
		super(fileName+msg+' '+rang);
		this.msg=fileName+msg+' '+rang;
	}
	/**
	 * Redifinition : Constitute the error message with the arguments 
	 * @param fileName Error file
	 * @param msg Error message
	 */
	public MazeReadingException(String fileName, String msg) { //Wrong colonne
		super(fileName+msg);
		this.msg=fileName+msg;
	}
	/**
	 * Getter of the message
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
}
