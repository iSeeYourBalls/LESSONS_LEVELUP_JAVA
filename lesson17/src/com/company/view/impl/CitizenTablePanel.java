package com.company.view.impl;

import com.company.entity.Citizen;
import com.company.view.Action;
import com.company.view.CitizenTableModuleContainer;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CitizenTablePanel extends JPanel implements Action{

    private final JTable table;
    private final CreateCitizenDialog dialog = new CreateCitizenDialog();
    private final CitizenTableModuleContainer tableContainer;

    public CitizenTablePanel() {
        this.tableContainer = new CitizenTableModuleContainer();
        this.table = new JTable(tableContainer);
        setName("Citizen Tab");
        init();
    }

    private void init() {
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(new Dimension(595, 300));
        add(scrollPane);
        setSize(new Dimension(595, 300));
    }

    @Override
    public void create() {
        dialog.setVisible(true);
        if(dialog.isOkPressed())
        {
            tableContainer.getData().add(dialog.getEntity());
        }
    }

    @Override
    public List<Citizen> read() {
        return tableContainer.getData();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
        Citizen citizen = tableContainer.getSelectedRowData(table.getSelectedRow());
        tableContainer.getData().remove(citizen);
    }
}
