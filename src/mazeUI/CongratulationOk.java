package mazeUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Implementing the interface {@link java.awt.event.ActionListener}, 
 * this button is just to confirm that you are happy about it, then close the congratulation happily.
 * @author Liamxh
 * @version 2.1
 */
public class CongratulationOk implements ActionListener{
	private final Congratulation congratulation;
	private final MazeButtonPanel mazeButtonPanel;
	public CongratulationOk(Congratulation congratulation, MazeButtonPanel mazeButtonPanel) {
		this.congratulation=congratulation;
		this.mazeButtonPanel=mazeButtonPanel;
	}
	/**
	 * Close the Congratulation Window.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		congratulation.dispose();
		this.mazeButtonPanel.getDirectionPanel().setResetEnabled(true);
	}
}
