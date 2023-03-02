package modificationUI;

import java.awt.Color;

import javax.swing.JRadioButton;

public class InputGraphBoxDButton extends InputGraphBoxMButton{
	public InputGraphBoxDButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel,
			ModificationGraphOptionPanel modificationGraphOptionPanel,
			ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel) {
		super(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,modificationGraphButtonOptionPanel);
		this.setText("D - Depart");
		this.setForeground(Color.GREEN);
	}
}
