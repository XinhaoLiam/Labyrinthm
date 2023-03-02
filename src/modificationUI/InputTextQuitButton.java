package modificationUI;

import javax.swing.JButton;

public class InputTextQuitButton extends JButton{
	private final ModificationTextTable modificationTextTable;

	public InputTextQuitButton(ModificationTextTable modificationTextTable) {
		super("Quit");
		this.modificationTextTable = modificationTextTable;
		this.addActionListener(new InputTextQuitButtonAction(modificationTextTable));
	}
	
}
