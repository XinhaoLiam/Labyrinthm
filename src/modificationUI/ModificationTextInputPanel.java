package modificationUI;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ModificationTextInputPanel extends JPanel{
	private final ModificationTextTable modificationTextTable;
	private final InputTextArea inputTextArea;

	public ModificationTextInputPanel(ModificationTextTable modificationTextTable) {
		super();
		this.modificationTextTable = modificationTextTable;
		this.setBorder(new TitledBorder(null,"Input Area",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		this.inputTextArea = new InputTextArea(modificationTextTable,this);
		this.add(inputTextArea);
	}

	/**
	 * @return the inputTextArea
	 */
	public InputTextArea getInputTextArea() {
		return inputTextArea;
	}
	
}
