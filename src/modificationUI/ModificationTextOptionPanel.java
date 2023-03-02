package modificationUI;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ModificationTextOptionPanel extends JPanel{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	private final InputTextLoadButton inputTextLoadButton;
	private final InputTextSaveButton inputTextSaveButton;
	private final InputTextCheckButton inputTextCheckButton;
	private final InputTextQuitButton inputTextQuitButton;
	
	public ModificationTextOptionPanel(ModificationTextTable modificationTable, ModificationTextInputPanel modificationTextInputPanel) {
		super();
		this.modificationTextTable = modificationTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
		this.setBorder(new TitledBorder(null,"Options",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		
		this.inputTextLoadButton=new InputTextLoadButton(modificationTextTable,modificationTextInputPanel);
		this.inputTextSaveButton=new InputTextSaveButton(modificationTextTable,modificationTextInputPanel);
		this.inputTextCheckButton=new InputTextCheckButton(modificationTextTable,modificationTextInputPanel);
		this.inputTextQuitButton=new InputTextQuitButton(modificationTextTable);
		
		this.add(inputTextLoadButton);
		this.add(inputTextSaveButton);
		this.add(inputTextCheckButton);
		this.add(inputTextQuitButton);
	}
}
