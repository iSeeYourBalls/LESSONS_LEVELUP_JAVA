package com.company;

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
    }
}
