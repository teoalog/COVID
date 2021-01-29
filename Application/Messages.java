package covid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Messages extends JFrame{

    public static Class cl;

    /* Create the frame and display the appropriate message using text area */
    public Messages(Object o) {
        JPanel pmenu = new JPanel();
        JFrame fmenu = new JFrame();
        fmenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fmenu.setBounds(300, 150, 1080, 600);
        fmenu.setVisible(true);
        fmenu.setTitle("Message Notification");
        fmenu.getContentPane().add(pmenu);
        pmenu.setLayout(null);
        String mess;
        /* Display the correct message according to the new case added (Student or Teacher) */
        if (o.equals("Student")) {
            Student st = Student.findStudent(Case.getIdentification());
            cl = Class.findClass(st);
            mess = "ATTENTION!"+ "\n\n" + "A student of the class " + cl.getName() + " has been tested positive for COVID-19 and due to the National Public Health Organization protocols for coronavirus transmission,"
                    + "\nthe students of this class need to abide by the following instructions, in order to prevent the further spread of the virus.\n"
                    + "\n" + "* Quarantine for a period of 14 days, before returning to school.\n"
                    + "\n" + "If any symptoms compatible with COVID-19 are observed during this period, a PCR test should immediately be conducted.\n"
                    + "\n" + "Should the test return a positive result, the student is considered a confirmed case and further instructions may be provided.\n"
                    + "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
                    + "\n" + "The testing of all students -including the ones with no symptoms- is not advised.\n"
                    + "\n" +
                    "If any student with no symptoms decides to be PCR tested for their own reason:\n"
                    + "\n" + "Should the test return a positive result, the student must remain in quarantine until 10 days have passed from the day they were tested (provided no symptoms appear).\n"
                    + "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
                    + "\n" + "The class will be closed during these 14 days and all areas will be thoroughly decontaminated.\n"
                    + "\n" + "Stay safe!\n"
                    + "\n\nThis message has been sent from an automated system in the context of a programming course project.\n\nYou do not have to worry!";
        } else {
            Teacher t = Teacher.findTeacher(Case.getIdentification());
            cl = Class.findClass(t);
            mess = "ATTENTION!"+ "\n\n" + "A teacher has been tested positive for COVID-19 and due to the National Public Health Organization protocols for coronavirus transmission,"
                    + "\nthe students of the class " + cl.getName() + " need to abide by the following instructions, in order to prevent the further spread of the virus.\n"
                    + "\n" + "The teacher lectured in those classes for at least 2 hours in the 2 days prior to his showing symptoms.\n"
                    + "\n* Quarantine for a period of 14 days, before returning to school.\n"
                    + "\n" + "If any symptoms compatible with COVID-19 are observed during this period, a PCR test should immediately be conducted.\n"
                    + "\n" + "Should the test return a positive result, the student is considered a confirmed case and further instructions may be provided.\n"
                    + "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
                    + "\n" + "The testing of all students -including the ones with no symptoms- is not advised.\n"
                    + "\n" + "If any student with no symptoms decides to be PCR tested for their own reason:\n"
                    + "\n" + "Should the test return a positive result, the student must remain in quarantine until 10 days have passed from the day they were tested (provided no symptoms appear).\n"
                    + "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
                    + "\n" + "The class will be closed during these 14 days and all areas will be thoroughly decontaminated.\n"
                    + "\n" + "Stay safe!\n"
                    + "\n\nThis message has been sent from an automated system in the context of a programming course project.\n\nYou do not have to worry!";
        }
        fmenu.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextArea textArea = new JTextArea(mess);
        textArea.setEditable(false);
        fmenu.getContentPane().add(new JScrollPane(textArea));
        JButton button = new JButton("Send notification");
        button.setBounds(180, 237, 138, 29);
        fmenu.getContentPane().add(button);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Mail.sendMail("teoalog@gmail.com", mess);
                // Send email to all students of the class
                for (int i = 0; i < cl.students.size(); i++) {
                    Mail.sendMail(cl.students.get(i).getEmail(), mess);
                }
                // Send email to all teachers of the class
                for (int i = 0; i < cl.teachers.size(); i++) {
                    Mail.sendMail(cl.teachers.get(i).getEmail(), mess);
                }
                JOptionPane.showMessageDialog(null, "A notification has been sent to the parents' and teachers' emails.\nStay safe!");
            }
        });
    }
}
	