package modificationUI;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ModificationTextHelpPanel extends JPanel{
	private final ModificationTextTable modificationTextTable;

	public ModificationTextHelpPanel(ModificationTextTable modificationTextTable) {
		super();
		this.modificationTextTable = modificationTextTable;
		this.setBorder(new TitledBorder(null,"Tips",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		String helpString[]= {"W-Wall ; E-Road ; D-Depart ; A-Arrival",
				"Each row should have the same column.","Don't type too long. It's tiring.",
				"Your maze should have a solution.","Save the maze if you are satisfied."};
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					int j=0;
					while (true) {
						JLabel helpText=new JLabel();
						helpText.setText(helpString[j]);
						removeAll();
						add(helpText);
						validate();
						repaint();
						j=(j+1)%5;
						Thread.sleep(1000);
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}).start();
	}
	
}
