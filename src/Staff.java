import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staff {
    static String name;
    static String role;
    static String gender;
    static String salary;
    static String joiningDate;
    Staff(String name,String role,String religion,String salary,String joiningDate){
        this.name = name;
        this.role = role;
        this.gender = religion;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }
    public static void add(String namei, String rolei, String religioni, String salaryi, String joiningDatei){
        name = namei;
        role = rolei;
        gender = religioni;
        salary = salaryi;
        joiningDate = joiningDatei;
    }
    public static String details(){
        return "Name: "+name+"\n\n"+"Role: "+role+"\n\n"+"Religion: "+ gender +"\n\n"+"Salary: "+salary+"\n\n"+"Joining-Date: "+joiningDate;
    }
    public Staff(){
        JFrame frame = new JFrame();
        frame.setTitle("Staff");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        frame.add(panel);
        gui(panel,frame);
    }
    public static void gui(JPanel panel,JFrame frame){
        panel.setLayout(null);
        JLabel title = new JLabel("Staff");
        title.setBounds(920,20,500,100);
        title.setFont(new Font("Arial",Font.BOLD,30));
        title.setForeground(Color.WHITE);
        panel.add(title);
        JLabel msg1 = new JLabel("Enter the details of staff");
        msg1.setBounds(520,80,500,100);
        msg1.setFont(new Font("Roboto",Font.BOLD,18));
        msg1.setForeground(Color.WHITE);
        panel.add(msg1);
        JLabel name = new JLabel("Name: ");
        name.setBounds(600,200,100,20);
        name.setForeground(Color.WHITE);
        panel.add(name);
        JTextField nameVal = new JTextField(100);
        nameVal.setBounds(660,200,100,20);
        panel.add(nameVal);
        JLabel role = new JLabel("Role: ");
        role.setBounds(600,250,100,20);
        role.setForeground(Color.WHITE);
        panel.add(role);
        JTextField roleVal = new JTextField(100);
        roleVal.setBounds(660,250,100,20);
        panel.add(roleVal);
        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(600,300,100,20);
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        JRadioButton genderMale = new JRadioButton("male");
        genderMale.setBounds(660,300,85,20);
        genderMale.setForeground(Color.WHITE);
        genderMale.setBackground(Color.BLUE);
        panel.add(genderMale);
        JRadioButton genderFemale = new JRadioButton("female");
        genderFemale.setBounds(740,300,100,20);
        genderFemale.setForeground(Color.WHITE);
        genderFemale.setBackground(Color.BLUE);
        panel.add(genderFemale);
        JLabel salary = new JLabel("Salary: ");
        salary.setBounds(600,350,100,20);
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        JTextField salaryVal = new JTextField(100);
        salaryVal.setBounds(660,350,100,20);
        panel.add(salaryVal);
        JLabel joiningDate = new JLabel("Joining-Date: ");
        joiningDate.setBounds(560,400,100,20);
        joiningDate.setForeground(Color.WHITE);
        panel.add(joiningDate);
        JTextField joiningDateVal = new JTextField(100);
        joiningDateVal.setBounds(660,400,100,20);
        panel.add(joiningDateVal);
        JButton addAll = new JButton("Add-all");
        addAll.setBounds(670,430,100,20);
        addAll.setBackground(Color.WHITE);
        panel.add(addAll);
        JLabel message = new JLabel("");
        message.setBounds(600,500,1000,20);
        message.setForeground(Color.WHITE);
        message.setBackground(Color.WHITE);
        panel.add(message);
        JLabel msg2 = new JLabel("Details");
        msg2.setBounds(1150,200,500,100);
        msg2.setFont(new Font("Roboto",Font.BOLD,18));
        msg2.setForeground(Color.WHITE);
        panel.add(msg2);
        JButton detailButton = new JButton("Show Details");
        detailButton.setBackground(Color.white);
        detailButton.setBounds(600, 600, 150, 50);
        panel.add(detailButton);
        JButton clearButton = new JButton("Clear Details");
        clearButton.setBackground(Color.white);
        clearButton.setBounds(600, 700, 150, 50);
        panel.add(clearButton);
        JLabel detailsLabel = new JLabel("");
        detailsLabel.setBounds(1100, 300, 500, 300);
        detailsLabel.setFont(new Font("Roboto", Font.BOLD, 16));
        detailsLabel.setBackground(Color.CYAN);
        detailsLabel.setForeground(Color.WHITE);
        detailsLabel.setVerticalAlignment(SwingConstants.TOP);
        panel.add(detailsLabel);
        addAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = nameVal.getText();
                String role = roleVal.getText();
                String sal = salary.getText();
                String jd= joiningDateVal.getText();
                String g = "";
                if(genderFemale.isSelected()){
                    g = genderFemale.getText();
                }
                if(genderMale.isSelected()){
                    g = genderMale.getText();
                }
                Staff.add(name,role,g,sal,jd);
                message.setText("Entries Added Successfully!");
            }
        });
        detailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                detailsLabel.setText("<html>" + Staff.details().replaceAll("\n", "<br>") + "</html>");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                detailsLabel.setText("<html>"+"</html>");
            }
        });
    }
}