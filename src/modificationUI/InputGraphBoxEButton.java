package modificationUI;

import java.awt.Color;

import javax.swing.JRadioButton;

public class InputGraphBoxEButton extends InputGraphBoxMButton{
	public InputGraphBoxEButton(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel,
			ModificationGraphOptionPanel modificationGraphOptionPanel,
			ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel) {
		super(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,modificationGraphButtonOptionPanel);
		this.setText("E - Road");
		this.setForeground(Color.WHITE);
		this.setSelected(true);
	}
}