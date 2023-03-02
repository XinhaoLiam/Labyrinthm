package modificationUI;

import javax.swing.*;

public class InputTextCheckButton extends JButton{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	public InputTextCheckButton(ModificationTextTable modificationTextTable,
			ModificationTextInputPanel modificationTextInputPanel) {
		super("Check");
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
		this.addActionListener(new InputTextCheckButtonAction(modificationTextTable,modificationTextInputPanel));
	}
}
