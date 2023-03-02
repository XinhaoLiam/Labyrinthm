package modificationUI;

import javax.swing.JButton;

public class InputGraphSaveButton extends JButton{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	public InputGraphSaveButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel) {
		super("Save");
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
	}
	
}
