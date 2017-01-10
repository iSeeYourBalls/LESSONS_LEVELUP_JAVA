package com.company;

<<<<<<< HEAD
import com.company.view.impl.CitizenTablePanel;
import com.company.view.impl.CreateCitizenDialog;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CitizenTablePanel tablePanel = new CitizenTablePanel();
        tablePanel.setVisible(true);

        frame.add(tablePanel);
        frame.setVisible(true);
=======
import com.company.view.impl.CreateCitizenDialog;

public class Main {

    public static void main(String[] args) {
        CreateCitizenDialog createCitizenDialog = new CreateCitizenDialog();
        createCitizenDialog.setVisible(true);
>>>>>>> c15769558ee2b51a24389826c3520551ee1620f7
    }
}
