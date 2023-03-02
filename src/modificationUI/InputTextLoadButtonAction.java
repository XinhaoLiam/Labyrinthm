package modificationUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JFileChooser;

import maze.MazeReadingException;

public class InputTextLoadButtonAction implements ActionListener{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	
	public InputTextLoadButtonAction(ModificationTextTable modificationTextTable, ModificationTextInputPanel modificationTextInputPanel) {
		super();
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		InputTextArea inputTextArea=this.modificationTextInputPanel.getInputTextArea();
	    inputTextArea.setText("");
		
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
	    
	    	BufferedReader input=null;
	    	int lineCount=0;
	    	int columeCount=0;
	    	try {
	    		input=new BufferedReader(new FileReader(file.toString()));
	    		String line=input.readLine();
	    		columeCount=line.length();
		    	inputTextArea.setRows(Math.max(inputTextArea.getRows(),lineCount));
			    inputTextArea.setColumns(Math.max(inputTextArea.getColumns(),columeCount));
		    	while (line!=null) {
		    		lineCount++;
		    		inputTextArea.append(line);
		    		inputTextArea.append("\n");
		    		line=input.readLine();
		    	}
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }finally {
		    	try {
		    		if (input!=null)
		    			input.close();
		    	}catch(Exception e){
		    		e.printStackTrace();
		    	}
		    }
		    inputTextArea.validate();
		    inputTextArea.repaint();
		}
	}
}
