package modificationUI;

import javax.swing.JButton;

public class InputTextSaveButton extends JButton{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	public InputTextSaveButton(ModificationTextTable modificationTextTable, ModificationTextInputPanel modificationTextInputPanel) {
		super("Save");
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
		this.addActionListener(new InputTextSaveButtonAction(modificationTextTable,modificationTextInputPanel));
	}
	
}
