import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login {
    private JPanel Login;
    private JLabel Name;
    private JTextField textField1;
    private JTextField textField2;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600,420);
        frame.getContentPane().setBackground(Color.blue);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        frame.add(panel);
        panel.repaint();
        createUIComponents(panel,frame);
    }
    private static void createUIComponents(JPanel panel,JFrame frame) {
        // TODO: place custom component creation code here
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User: ");
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(200,120,80,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(250,120,165,25);
        panel.add(userText);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(160, 160, 80, 25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(40);
        passwordText.setBounds(250,160,165,25);
        panel.add(passwordText);
        JButton loginButton = new JButton("login");
        loginButton.setBackground(Color.white);
        loginButton.setBounds(250, 200, 80, 25);
        panel.add(loginButton);
        JLabel message = new JLabel("");
        message.setForeground(Color.WHITE);
        message.setBounds(250, 240, 200, 25);
        panel.add(message);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                if(username.equals("user")&&password.equals("root")){
                    frame.dispose();
                    new Console();
                }
                else{
                    message.setText("Invalid!!!");
                }
            }
        });
    }
}
