package covid;

import javax.swing.*;

public class RelatedToEdu extends JFrame {

    private static final String text = "All schools should be prepared for the outbreak of COVID-19 cases in their units, regardless of the level of disease transmission in the community."
            + "\n\nFundamental measures to be implemented before schools start operating:"
            + "\n\n1) The cooperation of the school units with the respective Education Directorates, Regional Directorates of Education, as well as with the National Public Health Organization (NPHO) is crucial for their smooth operation."
            + "\n\n2) In each school, the Principal, in collaboration with the Teachers Association, should systematically deal with the management of the COVID-19 situation, including:"
            + "\n\n\t- the daily monitoring of the students' and teachers’ health status, so as to early identify any members having symptoms compatible with the new disease."
            + "\n\n\t- the daily monitoring of the implementation of the hygiene measures."
            + "\n\n\t- dealing with serious events, such as the occurrence of a case of the new virus and the subsequent communication with the relevant authorities."
            + "\n\n\t- the psychological support of students and teachers with the contribution of a specialist, where deemed necessary."
            + "\n\n3) In each school unit, a room of exclusive use shall be defined, in which, any person that develops symptoms compatible with COVID-19 inside the school building, should remain, until being transported to a healthcare facility."
            + "\nThis room must be equipped with surgical masks, gloves and alcohol antiseptic."
            + "\n\n4) Before the school unit starts operating, all individuals (students and staff) belonging to vulnerable groups must be recorded."
            + "\n\n5) Due to the special importance that should be given to the cleanliness of the school environment, it is important that all janitors receive the necessary relevant instructions and have at their disposal all necessary equipment needed (cleaning materials, disinfectants etc.)."
            + "\n\n6) Each school unit is required to obtain the following for the safety of students and teachers (by priority order):"
            + "\n\n\t- Alcohol antiseptic solutions for each class."
            + "\n\n\t- Liquid cream soap for the bathrooms."
            + "\n\n\t- Hand towels for the bathrooms (where possible)."
            + "\n\n\t- Common cleaners and disinfectants with antiviral action, suitable for the decontamination of surfaces (household bleach and alcoholic solutions containing at least 70% alcohol)."
            + "\n\n\t- Surgical and non-medical masks (in case of emergencies)."
            + "\n\n\t- Gloves, mainly for the cleaning staff, as well as in case of emergencies."
            + "\n\n7) The layout of the classrooms should be adjusted so as to maximize the distance among the students (i.e., one student per desk), while necessary tactics should also be adopted,"
            + "\nlike dividing students into separate classrooms or implementing rotating attendance (half of the students attend each day)."
            + "\nThe recommended distance among student desks is equal to 1.5 meters. It is also suggested that desks have common orientation, in order to reduce the exposure of students to droplets from coughing or sneezing, especially in classrooms with limited space."
            + "\n\n8) In addition to the adjustment classrooms layout, physical distancing in the teachers' rooms (1.5 m. span among desks) is very important, as well."
            + "\n\n9) Physical exercise plays a great part for students of all levels, especially during this period. Nevertheless, team games demanding the use of objects or equipment used by many students at the same time (balls or exercise devices) should be avoided."
            + "\nThe use of personal equipment, which should be meticulously cleaned after each use, is strongly advised."
            + "\n\n10) Before courses resume, all involved (students, teachers, parents and other staff) should be thoroughly informed about the measures to be implemented, as well as the ways, in which everyone should cooperate,"
            + "\nin order to contribute to the smooth operation of the school and the integration of students into the new normality."
            + "\nFor this reason, school administrations must ensure that:"
            + "\n\n\t- The informative material of the NPHO and the Ministry of Education will have been distributed in a timely manner and, under all circumstances, before the beginning of the courses, using any appropriate means and to all relevant recipients (students, parents and staff)."
            + "\n\n\t- The procedures to be followed have been understood by everyone involved. For this purpose, it is recommended that an informative meeting with the Teachers Association and one with the Parents and Guardians Association take place beforehand."
            + "\n\tShould any questions arise, they can be forwarded to the relevant agencies of the NPHO."
            + "\n\n\t- The first two hours on the first and second day of school will focus on informing students about hygiene rules, emphasizing necessary distances, hand hygiene and the use of masks as a complementary measure."
            + "\n\tThe teachers who will present the informative material of the NPHO and the Ministry of Education should have fully understood it and resolved all possible questions, so that they will be able to help students implement and abide by the measures in a responsible manner.";

    /* Creates the frame and displays a scrollable text area containing the above text.
     * Shows information for COVID-19 related to Education.
     */
    public RelatedToEdu() {
        JFrame fedu = new JFrame();
        fedu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fedu.setBounds(100, 100, 1200, 700);
        fedu.setVisible(true);
        fedu.setTitle("Information about SARS-CoV-2 related to Education");
        JTextArea textArea = new JTextArea(text);
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        fedu.add(scroll);
    }
}
