package com.ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author acabezaslopez
 */
public class Ventana2 {

    JFrame marco;
    JPanel panel;

    public Ventana2() {

        marco = new JFrame("ventana 2");
        panel = new JPanel();

        marco.setSize(500, 300);
        marco.add(panel);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
