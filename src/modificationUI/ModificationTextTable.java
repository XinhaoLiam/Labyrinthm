package modificationUI;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is a main window for modify the maze using textArea. It contains 3 panel :
 * <p> - A panel to input txt {@link ModificationTextInputPanel}
 * <p> - A panel to show help messages {@link ModificationHelpPanel}
 * <p> - A panel with some option buttons {@link ModificationTextOptionPanel}
 * @author Liamxh
 * @version 3.1
 */

public class ModificationTextTable extends JFrame{
	public ModificationTextTable() {
		super("Do some typing job!");
		
		ModificationTextInputPanel modificationTextInputPanel=new ModificationTextInputPanel(this);
		ModificationTextHelpPanel modificationTextHelpPanel=new ModificationTextHelpPanel(this);
		ModificationTextOptionPanel modificationTextOptionPanel=new ModificationTextOptionPanel(this,modificationTextInputPanel);
		
		JPanel construction=new JPanel();
		construction.setLayout(new BoxLayout(construction,BoxLayout.Y_AXIS));
		construction.add(modificationTextInputPanel);
		construction.add(modificationTextHelpPanel);
		construction.add(modificationTextOptionPanel);
		
		this.setContentPane(construction);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(600,700));
		this.pack();
		this.setVisible(true);
	}
}
