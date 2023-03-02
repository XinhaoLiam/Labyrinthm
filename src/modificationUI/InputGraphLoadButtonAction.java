package modificationUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import maze.MazeReadingException;

public class InputGraphLoadButtonAction implements ActionListener{
	private ModificationGraphTable modificationGraphTable;
	
	public InputGraphLoadButtonAction(ModificationGraphTable modificationGraphTable) {
		super();
		this.modificationGraphTable = modificationGraphTable;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		File file=null;
		File directory=new File("");
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.setDialogTitle("Choose a txt to load");
		try {
			fileChooser.setCurrentDirectory(new File(directory.getCanonicalPath()+"/data"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		fileChooser.setApproveButtonText("Ok");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);;
	    fileChooser.setVisible(true);
	    int ret=fileChooser.showOpenDialog(null);
	    if (ret==JFileChooser.APPROVE_OPTION) {
	    	file=fileChooser.getSelectedFile();
	    }
	    modificationGraphTable.dispose();
	    try {
			new ModificationGraphTable(file.toString());
		} catch (MazeReadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
