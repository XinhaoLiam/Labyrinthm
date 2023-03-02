package modificationUI;

import java.awt.Dimension;

import javax.swing.*;

import maze.MazeReadingException;

public class ModificationGraphTable extends JFrame{
	public ModificationGraphTable() {
		super("Create your own maze!");
		
		ModificationGraphInputPanel modificationGraphInputPanel=new ModificationGraphInputPanel(this);
		ModificationGraphHelpPanel modificationGraphHelpPanel=new ModificationGraphHelpPanel(this);
		ModificationGraphOptionPanel modificationGraphOptionPanel=new ModificationGraphOptionPanel(this,modificationGraphInputPanel);
		
		JPanel construction=new JPanel();
		construction.setLayout(new BoxLayout(construction,BoxLayout.Y_AXIS));
		construction.add(modificationGraphInputPanel);
		construction.add(modificationGraphHelpPanel);
		construction.add(modificationGraphOptionPanel);
		
		this.setContentPane(construction);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}	
	public ModificationGraphTable(int row, int colume) {
		super("Create your own maze!");
		
		ModificationGraphInputPanel modificationGraphInputPanel=new ModificationGraphInputPanel(this,row,colume);
		ModificationGraphHelpPanel modificationGraphHelpPanel=new ModificationGraphHelpPanel(this);
		ModificationGraphOptionPanel modificationGraphOptionPanel=new ModificationGraphOptionPanel(this,modificationGraphInputPanel);
		
		JPanel construction=new JPanel();
		construction.setLayout(new BoxLayout(construction,BoxLayout.Y_AXIS));
		construction.add(modificationGraphInputPanel);
		construction.add(modificationGraphHelpPanel);
		construction.add(modificationGraphOptionPanel);
		
		this.setContentPane(construction);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}	
	public ModificationGraphTable(String filename) throws MazeReadingException {
		super("Create your own maze!");
		
		ModificationGraphInputPanel modificationGraphInputPanel=new ModificationGraphInputPanel(this,filename);
		ModificationGraphHelpPanel modificationGraphHelpPanel=new ModificationGraphHelpPanel(this);
		ModificationGraphOptionPanel modificationGraphOptionPanel=new ModificationGraphOptionPanel(this,modificationGraphInputPanel);
		
		JPanel construction=new JPanel();
		construction.setLayout(new BoxLayout(construction,BoxLayout.Y_AXIS));
		construction.add(modificationGraphInputPanel);
		construction.add(modificationGraphHelpPanel);
		construction.add(modificationGraphOptionPanel);
		
		this.setContentPane(construction);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}	
}
