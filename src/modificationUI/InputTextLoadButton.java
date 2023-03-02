package modificationUI;

import javax.swing.JButton;

public class InputTextLoadButton extends JButton{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	public InputTextLoadButton(ModificationTextTable modificationTextTable, ModificationTextInputPanel modificationTextInputPanel) {
		super("Load");
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
		this.addActionListener(new InputTextLoadButtonAction(modificationTextTable,modificationTextInputPanel));
	}
	
}
