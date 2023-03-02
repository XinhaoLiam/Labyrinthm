package modificationUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputTextQuitButtonAction implements ActionListener{
	private final ModificationTextTable modificationTextTable;
	
	public InputTextQuitButtonAction(ModificationTextTable modificationTextTable) {
		super();
		this.modificationTextTable = modificationTextTable;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.modificationTextTable.dispose();
	}
	
}
