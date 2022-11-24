/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trea03_01;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tom59
 */
public class Ventana1 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JButton> jButtonList;

    public Ventana1() throws HeadlessException {

        this.setTitle("BorderLayout");
        this.setSize(350, 200);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
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
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        

        this.jPanelList.get(0).setLayout(new GridLayout(3, 1));
        this.jPanelList.get(1).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(2).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(3).setLayout(new GridLayout(1, 3));

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));

        this.jPanelList.get(1).add(this.jPanelList.get(4));
        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));
        
        this.jPanelList.get(2).add(this.jPanelList.get(7));
        this.jPanelList.get(2).add(this.jPanelList.get(8));
        this.jPanelList.get(2).add(this.jPanelList.get(9));
        
        this.jPanelList.get(3).add(this.jPanelList.get(10));
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Button1"));
        this.jButtonList.add(new JButton("2"));
        this.jButtonList.add(new JButton("Button3"));
        this.jButtonList.add(new JButton("Long-Named Button 4"));
        this.jButtonList.add(new JButton("Button5"));
        
        this.jPanelList.get(5).add(this.jButtonList.get(0));
        this.jPanelList.get(8).add(this.jButtonList.get(1));
        this.jPanelList.get(7).add(this.jButtonList.get(2));
        this.jPanelList.get(9).add(this.jButtonList.get(3));
        this.jPanelList.get(11).add(this.jButtonList.get(4));

    }

}
