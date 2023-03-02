package modificationUI;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ModificationGraphOptionPanel extends JPanel{
	private final ModificationGraphTable modificationGraphTable;
	private final ModificationGraphInputPanel modificationGraphInputPanel;
	public ModificationGraphOptionPanel(ModificationGraphTable modificationGraphTable,
			ModificationGraphInputPanel modificationGraphInputPanel) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.modificationGraphInputPanel = modificationGraphInputPanel;
		this.setBorder(new TitledBorder(null,"Options",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		
		ModificationGraphFileOptionPanel modificationGraphFileOptionPanel=new ModificationGraphFileOptionPanel(modificationGraphTable,modificationGraphInputPanel,this);
		ModificationGraphButtonOptionPanel modificationGraphButtonOptionPanel=new ModificationGraphButtonOptionPanel(modificationGraphTable,modificationGraphInputPanel,this);
		
		this.setLayout(new GridLayout(0,2));
		this.add(modificationGraphButtonOptionPanel);
		this.add(modificationGraphFileOptionPanel);
	}

	
}
