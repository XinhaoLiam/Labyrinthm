package modificationUI;

import java.awt.Color;

import javax.swing.JRadioButton;

public class InputGraphBoxWButton extends InputGraphBoxMButton{
	public InputGraphBoxWButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel,
			ModificationGraphOptionPanel modificationGraphOptionPanel,
			ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel) {
		super(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,modificationGraphButtonOptionPanel);
		this.setText("W - Wall");
		this.setForeground(Color.GRAY);
	}
}
