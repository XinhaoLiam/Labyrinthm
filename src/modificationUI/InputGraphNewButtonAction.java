package modificationUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class InputGraphNewButtonAction implements ActionListener{
	private final ModificationGraphTable modificationGraphTable;
	
	public InputGraphNewButtonAction(ModificationGraphTable modificationGraphTable) {
		super();
		this.modificationGraphTable = modificationGraphTable;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String rowInput;
		rowInput = (String)JOptionPane.showInputDialog(null,"Input the row(>5) of the maze:\n","Basic Parameter",JOptionPane.PLAIN_MESSAGE);
		if (rowInput.length()==0) return;
		String columnInput;
		columnInput= (String)JOptionPane.showInputDialog(null,"Input the column(>5) of the maze:\n","Basic Parameter",JOptionPane.PLAIN_MESSAGE);

		//modificationGraphTable;
		
		new ModificationGraphTable(Integer.parseInt(rowInput),Integer.parseInt(columnInput));
	}

}
