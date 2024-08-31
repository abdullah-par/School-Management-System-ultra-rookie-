import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Console {
    public Console(){
        JFrame frame = new JFrame();
        frame.setTitle("School Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,700);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        gui(panel,frame);
    }
    public static void gui(JPanel panel,JFrame frame){
        panel.setLayout(null);
        JButton student = new JButton("Student");
        student.setBounds(350,400,300,100);
        student.setBackground(Color.BLUE);
        student.setForeground(Color.WHITE);
        student.setFont(new Font("Arial",Font.BOLD,18));
        panel.add(student);
        JButton teacher = new JButton("Teacher");
        teacher.setBackground(Color.BLUE);
        teacher.setForeground(Color.WHITE);
        teacher.setFont(new Font("Arial",Font.BOLD,18));
        teacher.setBounds(350,250,300,100);
        panel.add(teacher);
        JButton staff = new JButton("Staff");
        staff.setBounds(350,100,300,100);
        staff.setBackground(Color.BLUE);
        staff.setForeground(Color.WHITE);
        staff.setFont(new Font("Arial",Font.BOLD,18));
        panel.add(staff);
        staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Staff();
            }
        });
        teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Teacher();
            }
        });
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Student();
            }
        });
    }
}
