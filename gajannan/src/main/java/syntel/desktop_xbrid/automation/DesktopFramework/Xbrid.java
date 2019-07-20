package syntel.desktop_xbrid.automation.DesktopFramework;
 
import javax.swing.*;
import java.awt.*; 
 
 
  
public class Xbrid  {
             
       public static void main(String args[]){
 
    //Creating the Frame
    JFrame frame = new JFrame("Xbrid Desktop Automation");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //JFrame f=new JFrame(); 
    frame.setSize(800,600);
    //Creating the MenuBar and adding components
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Test Cases");
    JMenu m2 = new JMenu("Help");
    JLabel label1 = new JLabel("Test");
    label1.setText("Label Text");
    Button btn = new Button("Click me");
  //   m2.add(label1);
    mb.add(m1);
    mb.add(m2); 
    JMenuItem m11 = new JMenuItem("Execute Test Cases");
    JMenuItem m22 = new JMenuItem("Create new Test Cases");
    m1.add(m11);
    m1.add(m22);
     JMenuBar testing = new JMenuBar();
     m1.add(testing);
    frame.getContentPane().add(BorderLayout.NORTH, mb);
    frame.setVisible(true);
   
   /***********REPORT Section******************************/
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = (JPanel)frame.getContentPane();
    JLabel label = new JLabel();
    label.setIcon(new ImageIcon("./Resources/startupLogo.png"));// your image here
    panel.add(label);
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
    JButton Report = new JButton("Report") ;
    Report.setSize(400,400);
    Report.setToolTipText("You can Download and view the executed test cases");
    frame.getContentPane().add(BorderLayout.PAGE_END, Report);
    frame.setVisible(true);
   
    
  /*  //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    panel.add(label); // Components Added using Flow Layout
    panel.add(label); // Components Added using Flow Layout
    panel.add(tf);
    panel.add(send);
    panel.add(reset);
 
    // Text Area at the Center
    JTextArea ta = new JTextArea();
 
    //Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.SOUTH, panel);
    frame.getContentPane().add(BorderLayout.NORTH, mb);
    frame.getContentPane().add(BorderLayout.CENTER, ta);
    frame.setVisible(true);*/
}
}
         
      