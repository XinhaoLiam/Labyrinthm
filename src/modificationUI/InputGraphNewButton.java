package modificationUI;

import javax.swing.JButton;

public class InputGraphNewButton extends JButton{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	public InputGraphNewButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel) {
		super("New");
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
		this.addActionListener(new InputGraphNewButtonAction(modificationGraphTable));
	}
	
	
}
