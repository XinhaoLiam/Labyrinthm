package startUI;

import modificationUI.*;

import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

import maze.Maze;

/**
 * Using the interface of {@link java.awt.event.ActionListener}, 
 * this class is to implement the function of {@link ModifyButton}.
 * Its function includes :
 * <p> Start up a simple window to choose the way of input {@link javax.swing.JOptionPane} 
 * <p> According to the choice, a new modification window will be established, 
 * either {@link modificationUI.ModificationTextTable}, or {@link modificationUI.ModificationGraphTable}
 * @author Liamxh
 * @version 2.1
 */

public class ModifyButtonAction implements ActionListener{
	/**
	 * This function uses {@link javax.swing.JOptionPane} to ask user to choose a way of modification,
	 * <p> then establishes a text modification window {@link modificationUI.ModificationTextTable} if "Text" is chosen
	 * <p> or establishes a graph modification window {@link modificationUI.ModificationGraphTable} if "Graph" is chosen
	 * <p> if close the question directly, nothing will happen
	 * <p> if choose "----------------", the question window will reappear.
	 * <p> - A direction panel {@link mazeUI.DirectionPanel}
	 * <p> - A file operation panel {@link mazeUI.FileOperationPanel}
	 */
	public void actionPerformed(ActionEvent e) {
		//Three options
		Object[] method= {"----------------","Text","Graph"};
		String response;
	    do{
	    	response=(String)JOptionPane.showInputDialog(null,"Choose a way of modification:\n","How ?",JOptionPane.PLAIN_MESSAGE,null,method,null);
	    	//If noting is chosen, just stop the loop
	    	if (response == null) break;
	    	//If choose something, a corresponding window will be established.
	    	if (response.equals("Text")) {
				new ModificationTextTable();
				break;
	    	}
			else if (response.equals("Graph")) {
				new ModificationGraphTable();
				break;
			}
	    	//If choose "----------------", the question window will just reappear.
	    }while (response.equals("----------------"));
	}
}
