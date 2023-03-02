package modificationUI;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class ModificationGraphButtonOptionPanel extends JPanel{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	private final ModificationGraphOptionPanel modificationGraphOptionPanel;
	public ModificationGraphButtonOptionPanel(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel, ModificationGraphOptionPanel modificationGraphOptionPanel) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
		this.modificationGraphOptionPanel= modificationGraphOptionPanel;
		
		InputGraphBoxAButton inputGraphBoxAButton=new InputGraphBoxAButton(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,this);
		InputGraphBoxDButton inputGraphBoxDButton=new InputGraphBoxDButton(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,this);
		InputGraphBoxEButton inputGraphBoxEButton=new InputGraphBoxEButton(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,this);
		InputGraphBoxWButton inputGraphBoxWButton=new InputGraphBoxWButton(modificationGraphTable,modificationGraphInputPanel,modificationGraphOptionPanel,this);
		
		ButtonGroup bG=new ButtonGroup();
		bG.add(inputGraphBoxWButton);
		bG.add(inputGraphBoxEButton);
		bG.add(inputGraphBoxDButton);
		bG.add(inputGraphBoxAButton);
		
		this.setLayout(new GridLayout(2,0));
		this.add(inputGraphBoxWButton);
		this.add(inputGraphBoxEButton);
		this.add(inputGraphBoxDButton);
		this.add(inputGraphBoxAButton);
	}
}
