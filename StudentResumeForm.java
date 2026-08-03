package studentresumeform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentResumeForm extends JFrame implements ActionListener {

    JTextField txtName, txtAge, txtEmail, txtPhone;
    JTextArea txtAddress;
    JComboBox<String> cmbCourse;
    JRadioButton rbMale, rbFemale;
    JCheckBox cbJava, cbPython, cbC;
    JButton btnSubmit;

    public StudentResumeForm() {

        setTitle("Student Resume Form");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("STUDENT RESUME FORM");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBounds(120, 20, 300, 30);
        add(title);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50, 70, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(180, 70, 200, 25);
        add(txtName);

        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(50, 110, 100, 25);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(180, 110, 200, 25);
        add(txtAge);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(50, 150, 100, 25);
        add(lblGender);

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);

        rbMale.setBounds(180, 150, 80, 25);
        rbFemale.setBounds(270, 150, 100, 25);

        add(rbMale);
        add(rbFemale);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(50, 190, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(180, 190, 200, 25);
        add(txtEmail);

        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(50, 230, 100, 25);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(180, 230, 200, 25);
        add(txtPhone);

        JLabel lblCourse = new JLabel("Course");
        lblCourse.setBounds(50, 270, 100, 25);
        add(lblCourse);

        String courses[] = {"BCA", "B.Sc", "B.Tech", "MCA", "M.Tech"};
        cmbCourse = new JComboBox<>(courses);
        cmbCourse.setBounds(180, 270, 200, 25);
        add(cmbCourse);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50, 310, 100, 25);
        add(lblAddress);

        txtAddress = new JTextArea();
        JScrollPane sp = new JScrollPane(txtAddress);
        sp.setBounds(180, 310, 200, 70);
        add(sp);

        JLabel lblSkills = new JLabel("Skills");
        lblSkills.setBounds(50, 400, 100, 25);
        add(lblSkills);

        cbJava = new JCheckBox("Java");
        cbPython = new JCheckBox("Python");
        cbC = new JCheckBox("C");

        cbJava.setBounds(180, 400, 70, 25);
        cbPython.setBounds(250, 400, 80, 25);
        cbC.setBounds(340, 400, 60, 25);

        add(cbJava);
        add(cbPython);
        add(cbC);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 470, 100, 30);
        btnSubmit.addActionListener(this);
        add(btnSubmit);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String gender = "";

        if (rbMale.isSelected())
            gender = "Male";
        else if (rbFemale.isSelected())
            gender = "Female";

        String skills = "";

        if (cbJava.isSelected())
            skills += "Java ";

        if (cbPython.isSelected())
            skills += "Python ";

        if (cbC.isSelected())
            skills += "C ";

        String msg =
                "Resume Submitted Successfully!\n\n" +
                "Name : " + txtName.getText() +
                "\nAge : " + txtAge.getText() +
                "\nGender : " + gender +
                "\nEmail : " + txtEmail.getText() +
                "\nPhone : " + txtPhone.getText() +
                "\nCourse : " + cmbCourse.getSelectedItem() +
                "\nAddress : " + txtAddress.getText() +
                "\nSkills : " + skills;

        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentResumeForm();
            }
        });

    }
}