/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trea03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tom59
 */
public class Ventana1 extends JFrame {

    private List<JPanel> jPanelList;

    public Ventana1() throws HeadlessException {

        this.setTitle("BorderLayout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.jPanelList.get(0).setLayout(new GridLayout(4, 5));

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());
        this.jPanelList.get(0).setBackground(Color.blue);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(),"paner principal"));
        
        this.jPanelList.add(new Jpanel());
        this.jPanelList.get(1).SET

        

    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(1).setBackground(Color.GRAY);
        this.jPanelList.get(2).setBackground(Color.GRAY);
        this.jPanelList.get(3).setBackground(Color.GRAY);
        this.jPanelList.get(4).setBackground(Color.GRAY);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(3));

    }

}
