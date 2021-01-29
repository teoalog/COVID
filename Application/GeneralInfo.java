package covid;

import javax.swing.*;

public class GeneralInfo extends JFrame {

    private static final String text = "General Information"
            + "\n\nA coronavirus is a kind of common virus that causes an infection to the nose, sinuses or upper throat. Most coronaviruses are not dangerous."
            + "\n\nIn early 2020, after a December 2019 outbreak in China, the World Health Organization identified SARS-CoV-2 as a new type of coronavirus."
            + "\nThe outbreak quickly spread around the world, claiming numerous lives in its path."
            + "\n\nCOVID-19 is a disease caused by SARS-CoV-2 that can trigger a respiratory tract infection."
            + "\nIt can affect the upper respiratory tract (sinuses, nose and throat) or the lower respiratory tract (windpipe and lungs)."
            + "\n\nIt spreads the same way other coronaviruses do, which is mainly through person-to-person contact."
            + "\nInfections range from mild to deadly, depending on a variety of factors, like one’s health condition."
            + "\n\nSARS-CoV-2 is one of seven types of coronavirus, which among others include the ones causing severe diseases like Middle East respiratory syndrome (MERS) and sudden acute respiratory syndrome (SARS)."
            + "\nThe other coronaviruses cause most of the colds that affect us during the year but are not generally deemed a serious threat for otherwise healthy people."
            + "\n\n\nGlobal Situation"
            + "\n\nGlobally, there have been more than 100 million confirmed cases of COVID-19, including more than 2 million deaths, reported to WHO."
            + "\n\n\nSymptoms"
            + "\n\nCOVID-19 affects different people in various ways. Most infected people will develop mild to moderate illness and recover without any need for hospitalization."
            + "\nHowever, older people and those with underlying medical problems like cardiovascular disease, diabetes, chronic respiratory disease and cancer, are more likely to develop serious illness."
            + "\n\nThe most common symptoms are:"
            + "\n\n-Fever"
            + "\n-Dry cough"
            + "\n-Fatigue"
            + "\n\nOther symptoms that are less common include:"
            + "\n\n-Loss of taste or smell"
            + "\n-Nasal congestion"
            + "\n-Conjunctivitis (also known as red eyes)"
            + "\n-Sore throat"
            + "\n-Headache"
            + "\n-Muscle or joint pain"
            + "\n-Different types of skin rash"
            + "\n-Nausea or vomiting"
            + "\n-Diarrhea"
            + "\n-Chills or dizziness"
            + "\n\nSymptoms of sever disease include:"
            + "\n\n-Shortness of breath"
            + "\n-Loss of appetite"
            + "\n-Confusion"
            + "\n-Persistent pain or pressure in the chest"
            + "\n-High temperature (above 38 degrees Celsius)"
            + "\n\nOther less common symptoms are:"
            + "\n\n-Irritability"
            + "\n-Confusion"
            + "\n-Reduced consciousness (sometimes associated with seizures)"
            + "\n-Anxiety"
            + "\n-Depression"
            + "\n-Sleep disorders"
            + "\n-More severe and rare neurological complications such as strokes, brain inflammation, delirium and nerve damage"
            + "\n\nSeek immediate medical attention in case you have serious symptoms. Always call prior to visiting your doctor or health facility."
            + "\n\nPeople with mild symptoms who are otherwise healthy should manage their symptoms at home and remain in constant communication with their doctor."
            + "\n\nOn average, it takes 5–6 days from the moment someone is infected with the virus for symptoms to show, however it can also take up to 14 days, on occasion."
            + "\n\n\nPrevention"
            + "\n\nTo prevent infection and to slow transmission of COVID-19, the following are advised:"
            + "\n\n-Wash your hands regularly. Use soap and water or alcohol-based hand rub."
            + "\n-Maintain at least two meters distance from anyone coughing or sneezing."
            + "\n-Avoid touching your face."
            + "\n-Cover your mouth and nose when coughing or sneezing."
            + "\n-Stay home if you feel unwell."
            + "\n-Refrain from smoking and other activities that weaken the lungs."
            + "\n-Practice physical distancing by avoiding unnecessary travel and staying away from large groups of people.";

    /* Creates the frame and adds a scrollable text area containing the above text.
     * Shows general information about COVID-19. */
    public GeneralInfo() {
        JFrame fgeneralinfo = new JFrame();
        fgeneralinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fgeneralinfo.setBounds(90, 100, 1330, 700);
        fgeneralinfo.setVisible(true);
        fgeneralinfo.setTitle("General information about SARS-CoV-2");
        JTextArea textArea = new JTextArea(text);
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        fgeneralinfo.add(scroll);
    }
}
