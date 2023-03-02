package modificationUI;

import java.awt.Color;

import javax.swing.JRadioButton;

public class InputGraphBoxAButton extends InputGraphBoxMButton{
	public InputGraphBoxAButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel,
			ModificationGraphOptionPanel modificationGraphOptionPanel,
			ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel) {
		super(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,modificationGraphButtonOptionPanel);
		this.setText("A - Arrive");
		this.setForeground(Color.RED);
	}
}