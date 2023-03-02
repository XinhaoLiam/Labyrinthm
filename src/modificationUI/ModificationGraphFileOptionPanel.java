package modificationUI;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ModificationGraphFileOptionPanel extends JPanel{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	private final ModificationGraphOptionPanel modificationGraphOptionPanel;
	public ModificationGraphFileOptionPanel(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel, ModificationGraphOptionPanel modificationGraphOptionPanel) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
		this.modificationGraphOptionPanel= modificationGraphOptionPanel;
		
		InputGraphLoadButton inputGraphLoadButton=new InputGraphLoadButton(modificationGraphTable,modificationGraphInputPanel);
		InputGraphNewButton inputGraphNewButton=new InputGraphNewButton(modificationGraphTable,modificationGraphInputPanel);
		InputGraphSaveButton inputGraphSaveButton=new InputGraphSaveButton(modificationGraphTable,modificationGraphInputPanel);
		InputGraphCheckButton inputGraphCheckButton=new InputGraphCheckButton(modificationGraphTable,modificationGraphInputPanel);
		
		this.setLayout(new GridLayout(2,0));
		this.add(inputGraphLoadButton);
		this.add(inputGraphNewButton);
		this.add(inputGraphSaveButton);
		this.add(inputGraphCheckButton);
	}
}
