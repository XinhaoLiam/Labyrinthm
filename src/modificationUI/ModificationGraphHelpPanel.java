package modificationUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ModificationGraphHelpPanel extends JPanel{
	private final ModificationGraphTable modificationGraphTable;

	public ModificationGraphHelpPanel(ModificationGraphTable modificationGraphTable) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.setBorder(new TitledBorder(null,"Tips",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		String helpString[]= {"Choose the button and then choose the type",
				"No worry, each row always have the same column.","You will regret to have a big maze. It's tiring.",
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
