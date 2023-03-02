package modificationUI;

import javax.swing.JButton;

public class InputGraphLoadButton extends JButton{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGrapnInputPanel;
	public InputGraphLoadButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGrapnInputPanel) {
		super("Load");
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGrapnInputPanel = modificationGrapnInputPanel;
		this.addActionListener(new InputGraphLoadButtonAction(modificationGraphTable));
	}
	
}
