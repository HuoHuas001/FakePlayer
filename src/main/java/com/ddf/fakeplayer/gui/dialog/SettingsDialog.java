package com.ddf.fakeplayer.gui.dialog;

import com.ddf.fakeplayer.gui.GUIMain;

import javax.swing.*;

public class SettingsDialog extends JDialog {
    private final GUIMain main;
    private JPanel content;

    public SettingsDialog(GUIMain main) {
        super(main.getFrame());
        this.main = main;
        initLayout();
        initListener();
        initData();
    }

    private void initLayout() {

    }

    private void initListener() {

    }

    private void initData() {

    }
}
