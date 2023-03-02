package modificationUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextArea;

public class InputTextArea extends JTextArea {
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	public InputTextArea(ModificationTextTable modificationTextTable, ModificationTextInputPanel modificationTextInputPanel) {
		super();
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
		this.setFont(new Font("Consolas",0,15));
		this.setPreferredSize(new Dimension(500,500));
		this.setVisible(true);
	}
	
}
