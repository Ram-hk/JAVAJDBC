import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
// import databse_model.*;
import data_model.*;
import databse_model.InputJdbc;
// import databse_model.InputJdbc;
import databse_model.OutputJdbc;

public class TestView 
{
    public static void main(String[] args) 
    {
        new DemoFrame();
        
    }
   
}

 class DemoFrame extends JFrame implements ActionListener{
    private static JLabel jLabel3 = new JLabel("result");
    private static JLabel jLabel = new JLabel();
    private static JLabel jLabel2 = new JLabel();
    private static JLabel jLabel4 = new JLabel("hello");
    private static JLabel jLabel5 = new JLabel("hello5");
    private static JTextField textFieldName = new JTextField(25);
    private static JComboBox<String> cb;
    private static JPanel panel = new JPanel();
    private JButton submiButton = new JButton("submit");
     DemoFrame(){
    

    this.setVisible(true);
    this.setSize(400,400);
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    String[] choices = { "CSE", "IT", "Mach", "Meta",
                         "Civil", "Elect" };

    cb = new JComboBox<String>(choices);
    cb.setMaximumSize(cb.getPreferredSize());
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(cb);
       
    
    jLabel.setText("name: ");
    jLabel2 .setText(" branch: ");

    
    
    this.add(jLabel);
    this.add(textFieldName);
    this.add(jLabel2);
    this.add(panel);
    this.add(submiButton); 
    this.add(jLabel3);
    this.add(jLabel4);
    this.add(jLabel5);     
    
    submiButton. addActionListener(this);

    
     }

    @Override
    public void actionPerformed(ActionEvent e) {

        //This is the code for insert data into database....................... 
        /*code starts from here.......*/
        String studentName,studentBranch;
        studentName = textFieldName.getText().toString().trim();
        studentBranch =cb.getSelectedItem().toString().trim();
        InputMaster.setStudentName(studentName);
        InputMaster.setStudentBranch(studentBranch);

        try {
            new InputJdbc();
        } catch (Exception eet) {
            eet.printStackTrace();
        }



        /*code ends from here.. */    
        
        //This all are the code for fatch the data from database using JDBC connection..................
        /*starts from here.....*/
        try {
            new OutputJdbc();
        } catch (Exception eet) {
            eet.printStackTrace();
        }
       
        
        String num = Integer.toString(OutputMaster.getIndexNo());

        jLabel3.setText(num);
        jLabel4.setText(OutputMaster.getStudentName());
        jLabel5.setText(OutputMaster.getStudentBranch());
        /*end from here*/

        
        
    }

    

}