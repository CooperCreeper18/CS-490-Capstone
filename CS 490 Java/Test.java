import javax.swing.*;
import java.awt.*;


class gui{
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Blueprint frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("HOME");
        JMenu m2 = new JMenu("BLUEPRINT TOOL");
        JMenu m3 = new JMenu("REPORTS");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        JMenuItem m11 = new JMenuItem("Open");

        m1.add(m11);
        
        JToolBar toolbar = new JToolBar("Tools"); 
        toolbar.setRollover(true);  
        toolbar.add(new JComboBox(new String[] { "Tool 1", "Tool 2", "Tool 3", "Tool 4" }));  

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        JLabel grid = new JLabel(new ImageIcon("grid.png"));

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, toolbar);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().add(BorderLayout.CENTER, grid);

        frame.setVisible(true);
    }
}
