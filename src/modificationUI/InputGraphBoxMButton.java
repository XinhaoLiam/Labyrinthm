package modificationUI;

import java.awt.Color;

import javax.swing.JRadioButton;

public abstract class InputGraphBoxMButton extends JRadioButton{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	private final ModificationGraphOptionPanel modificationGraphOptionPanel;
	private final ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel;
	public InputGraphBoxMButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel,
			ModificationGraphOptionPanel modificationGraphOptionPanel,
			ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
		this.modificationGraphOptionPanel = modificationGraphOptionPanel;
		this.modificationGraphButtonOptionPanel = modificationGraphButtonOptionPanel;
		
		this.setBackground(Color.LIGHT_GRAY);
	}
}
