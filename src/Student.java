import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    static String name;
    static String fathersName;
    static String mothersName;
    static String Grade;
    static String gender;
    static String admissionDate;
    Student(String name,String fathersName,String mothersName,String Grade,String gender,String admissionDate){
        this.name = name;
        this.fathersName=fathersName;
        this.mothersName=mothersName;
        this.Grade=Grade;
        this.gender= gender;
        this.admissionDate=admissionDate;
    }
    public static void add(String namei,String fathersNamei,String mothersNamei,String Gradei,String genderi,String admissionDatei){
        name = namei;
        fathersName = fathersNamei;
        mothersName = mothersNamei;
        Grade = Gradei;
        gender = genderi;
        admissionDate = admissionDatei;
    }
    public static String Details(){
        return "Name: "+name+"\n\n"+"Fathers-name: "+fathersName+"\n\n"+"Mothers-name: "+mothersName+"\n\n"+"Grade: "+Grade+"\n\n"+"Gender: "+gender+"\n\n"+"Admission-Date: "+admissionDate;
    }
    public Student(){
        JFrame frame = new JFrame();
        frame.setTitle("Student");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        frame.add(panel);
        gui(panel,frame);
    }
    public static void gui(JPanel panel, JFrame frame){
        panel.setLayout(null);
        JLabel title = new JLabel("Student");
        title.setBounds(920,20,500,100);
        title.setFont(new Font("Arial",Font.BOLD,30));
        title.setForeground(Color.WHITE);
        panel.add(title);
        JLabel msg1 = new JLabel("Enter the details of student");
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
        JLabel fatherName = new JLabel("Fathers_Name: ");
        fatherName.setBounds(550,250,200,20);
        fatherName.setForeground(Color.WHITE);
        panel.add(fatherName);
        JTextField fVal = new JTextField(100);
        fVal.setBounds(660,250,100,20);
        panel.add(fVal);
        JLabel motherName = new JLabel("Mothers_Name: ");
        motherName.setBounds(550,300,200,20);
        motherName.setForeground(Color.WHITE);
        panel.add(motherName);
        JTextField mVal = new JTextField(100);
        mVal.setBounds(660,300,100,20);
        panel.add(mVal);
        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(600,350,100,20);
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        JRadioButton genderMale = new JRadioButton("male");
        genderMale.setBounds(660,350,85,20);
        genderMale.setForeground(Color.WHITE);
        genderMale.setBackground(Color.BLUE);
        panel.add(genderMale);
        JRadioButton genderFemale = new JRadioButton("female");
        genderFemale.setBounds(740,350,100,20);
        genderFemale.setForeground(Color.WHITE);
        genderFemale.setBackground(Color.BLUE);
        panel.add(genderFemale);
        JLabel grade = new JLabel("Grade: ");
        grade.setBounds(600,390,100,20);
        grade.setForeground(Color.WHITE);
        panel.add(grade);
        JTextField gradeVal = new JTextField(100);
        gradeVal.setBounds(660,390,100,20);
        panel.add(gradeVal);
        JLabel admissionDate = new JLabel("Admission-Date: ");
        admissionDate.setBounds(540,430,200,20);
        admissionDate.setForeground(Color.WHITE);
        panel.add(admissionDate);
        JTextField joiningDateVal = new JTextField(100);
        joiningDateVal.setBounds(660,430,100,20);
        panel.add(joiningDateVal);
        JButton addAll = new JButton("Add-all");
        addAll.setBounds(670,470,100,20);
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
                String fn = fVal.getText();
                String mn = mVal.getText();
                String gr = gradeVal.getText();
                String jd= joiningDateVal.getText();
                String g = "";
                if(genderFemale.isSelected()){
                    g = genderFemale.getText();
                }
                if(genderMale.isSelected()){
                    g = genderMale.getText();
                }
                message.setText("Entries Added Successfully!");
                Student.add(name,fn,mn,gr,g,jd);
            }
        });
        detailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                detailsLabel.setText("<html>" + Student.Details().replaceAll("\n", "<br>") + "</html>");
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