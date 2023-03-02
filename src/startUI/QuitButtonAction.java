package startUI;

import java.awt.event.*;

import maze.Maze;

/**
 * Using the interface of {@link java.awt.event.ActionListener}, 
 * this class is to implement the function of {@link QuitButton}.
 * Its function includes :
 * <p> Quits the window
 * @author Liamxh
 * @version 2.1
 */

public class QuitButtonAction implements ActionListener{
	/**
	 * This function is estabished to close the window.
	 */
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
