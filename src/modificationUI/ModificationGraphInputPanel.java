package modificationUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import maze.Maze;
import maze.MazeReadingException;
import mazeUI.*;

public class ModificationGraphInputPanel extends JPanel{
	private final ModificationGraphTable modificationGraphTable;
	private int row;
	private int colume;
	
	public ModificationGraphInputPanel(ModificationGraphTable modificationGraphTable) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.setBorder(new TitledBorder(null,"Input Area",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		this.row=0;
		this.colume=0;
		this.setPreferredSize(new Dimension(300,300));
	}
	
	public ModificationGraphInputPanel(ModificationGraphTable modificationGraphTable, int row, int colume) {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.setBorder(new TitledBorder(null,"Input Area",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		
		this.row = row;
		this.colume = colume;
		
		int panelRow=Math.max(32*(colume-1)+30, 350);
		int panelColume=32*(row-1)+30;
		this.setSize(new Dimension(panelRow,panelColume));
		
		JPanel mazePanel=new JPanel();
		mazePanel.setSize(new Dimension(32*(colume-1)+30,32*(row-1)+30));
		
		mazePanel.setLayout(new GridLayout(0,colume,2,2));
		for (int i=0;i<row;i++) {
			for (int j=0;j<colume;j++) {
				mazePanel.add(new BoxE());
			}
		}
		
		if (32*(colume-1)+30<350) {
			JPanel voidPanel1=new JPanel();
			JPanel voidPanel2=new JPanel();
			voidPanel1.setSize(new Dimension(-32*(colume-1)/2+160,panelColume));
			voidPanel2.setSize(new Dimension(-32*(colume-1)/2+160,panelColume));

			this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			this.add(voidPanel1);
			this.add(mazePanel);
			this.add(voidPanel2);
		}
		else {
			this.add(mazePanel);
		}
	}
	
	public ModificationGraphInputPanel(ModificationGraphTable modificationGraphTable, String filename) throws MazeReadingException {
		super();
		this.modificationGraphTable = modificationGraphTable;
		this.setBorder(new TitledBorder(null,"Input Area",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION));
		
		Maze maze=new Maze();
		maze.initFromTextFile(filename);
		
		this.row = maze.getRow();
		this.colume = maze.getColume();
		
		int panelRow=Math.max(32*(colume-1)+30, 350);
		int panelColume=32*(row-1)+30;
		this.setSize(new Dimension(panelRow,panelColume));
		
		JPanel mazePanel=new JPanel();
		mazePanel.setSize(new Dimension(32*(colume-1)+30,32*(row-1)+30));
		
		BufferedReader input=null;
		mazePanel.setLayout(new BoxLayout(mazePanel,BoxLayout.Y_AXIS));
    	try {
    		input=new BufferedReader(new FileReader(filename));
    		String line=input.readLine();
    		while (line!=null) {
    			JPanel boxPanel= new JPanel();
    			boxPanel.setLayout(new GridLayout(1,0,2,2));
    			for (int i=0;i<line.length();i++) {
					switch (line.charAt(i)) {
	    				case 'W' :
	    					boxPanel.add(new BoxW());
	    					break;
	    				case 'E' :
	    					boxPanel.add(new BoxE());
	    					break;
	    				case 'A' :
	    					boxPanel.add(new BoxA());
	    					break;
	    				case 'D' :
	    					boxPanel.add(new BoxD());
	    					break;
					}
				}
				mazePanel.add(boxPanel);
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
		
		if (32*(colume-1)+30<350) {
			JPanel voidPanel1=new JPanel();
			JPanel voidPanel2=new JPanel();
			voidPanel1.setSize(new Dimension(-32*(colume-1)/2+160,panelColume));
			voidPanel2.setSize(new Dimension(-32*(colume-1)/2+160,panelColume));

			this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			this.add(voidPanel1);
			this.add(mazePanel);
			this.add(voidPanel2);
		}
		else {
			this.add(mazePanel);
		}
	}
	
	
}
