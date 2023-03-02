package startUI;

import java.awt.*;
import javax.swing.*;

/**
 * This is a panel contains all the buttons using {@link javax.swing.JPanel},including:
 * <p> Start Game {@link StartButton}
 * <p> Modification of the maze {@link ModifyButton}
 * <p> Quit the game {@link QuitButton}
 * @see ModifyButton
 * @author Liamxh
 * @version 2.1
 */

public class StartPanel extends JPanel{
	private final StartButton startButton;
	private final ModifyButton modifyButton;
	private final QuitButton quitButton;
	private final StartMenu startMenu;
	public StartPanel(StartMenu startMenu) {
		this.startMenu=startMenu;
		setLayout(new GridLayout(3,1));
		add(startButton=new StartButton(startMenu));
		add(modifyButton=new ModifyButton(startMenu));
		add(quitButton=new QuitButton(startMenu));
		setPreferredSize(new Dimension(300,300));
	}
}
	
