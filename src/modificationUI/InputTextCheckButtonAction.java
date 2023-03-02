package modificationUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import dijkstra.Dijkstra;
import maze.Maze;
import maze.MazeReadingException;

public class InputTextCheckButtonAction implements ActionListener{
	private final ModificationTextTable modificationTextTable;
	private final ModificationTextInputPanel modificationTextInputPanel;
	
	public InputTextCheckButtonAction(ModificationTextTable modificationTextTable, ModificationTextInputPanel modificationTextInputPanel) {
		super();
		this.modificationTextTable = modificationTextTable;
		this.modificationTextInputPanel = modificationTextInputPanel;
	}
	boolean checkInput(String text) throws MazeReadingException{
		MazeReadingException e;
		int columnCount=-1;
		boolean haveDepart=false;
		boolean haveArrival=false;
		String[] values=text.split("\n");
		for (int i=0;i<values.length;i++) {
			if (columnCount==-1)
				columnCount=values[i].length();
			else if (columnCount != values[i].length()) {
				e=new MazeReadingException("TextArea",i+1,": Wrong number of elements in the rang ");
				JOptionPane.showMessageDialog(null, e.getMsg(),"Error",JOptionPane.WARNING_MESSAGE);
				return false;
			}
			for (int j=0;j<values[i].length();j++) {
				switch (values[i].charAt(j)){
					case 'W' :
						break;
					case 'E' :
						break;
					case 'D' :
						if (haveDepart) {
							e=new MazeReadingException("TextArea",i+1,": Second departure in the rang ");
							JOptionPane.showMessageDialog(null, e.getMsg(),"Error",JOptionPane.WARNING_MESSAGE);
							return false;
						}
						else
							haveDepart=true;
						break;
					case 'A' :
						if (haveArrival) {
							e=new MazeReadingException("TextArea",i+1,": Second arrival in the rang ");
							JOptionPane.showMessageDialog(null, e.getMsg(),"Error",JOptionPane.WARNING_MESSAGE);
							return false;
						}
						else
							haveArrival=true;
						break;
					default :
						e=new MazeReadingException("TextArea",i+1,": Input illegal in the rang ");
						JOptionPane.showMessageDialog(null, e.getMsg(),"Error",JOptionPane.WARNING_MESSAGE);		
						return false;
				}
			}
		}
		if (!haveDepart || !haveArrival) {
			e=new MazeReadingException("TextArea",": No departure or destination");
			JOptionPane.showMessageDialog(null, e.getMsg(),"Error",JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent arg0){
		// TODO Auto-generated method stub
		InputTextArea inputTextArea=this.modificationTextInputPanel.getInputTextArea();
		
		String text=inputTextArea.getText();
		try {
			if (!this.checkInput(text)) return;
		} catch (MazeReadingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File directory=null;
		FileOutputStream fout=null;
		try {
			directory = File.createTempFile("temp", ".txt");
			String path=directory.getCanonicalPath();
			PrintWriter pw=null;
			fout=new FileOutputStream(directory);
			try {
	    		pw=new PrintWriter(new FileOutputStream(path));	
	    		for (String value : text.split("\n")) {
	    			pw.println(value);
	    		}
	    	}catch(IOException e) {
		   		e.printStackTrace();
		   	}catch(Exception e) {
		   		e.printStackTrace();
		   	}finally {
	    		pw.close();	
		   	}
			Maze mazeTemp=new Maze();
	    	mazeTemp.initFromTextFile(path);
	    	Dijkstra dijkstra=new Dijkstra();
	    	if (dijkstra.dijkstra(mazeTemp,mazeTemp.getDepart()).getShortestPath(mazeTemp.getArrive()).size()!=0)
	    		JOptionPane.showMessageDialog(null, "Solution exist!");
	    	else
	    		JOptionPane.showMessageDialog(null, "No Solution!",null,JOptionPane.WARNING_MESSAGE);
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	    	try {
				fout.flush();
				fout.close();
	    	} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		directory.delete();
    	} 
	    
	}
	
}
