/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author tom59
 */
public class Ventana0301b extends JFrame {

    private List<JPanel> jpanelList;
    private List<JLabel> jlabelList;

    public Ventana0301b(String title) throws HeadlessException {

        this.setTitle("ventana 0301b");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarLabels();
        this.setContentPane(this.jpanelList.get(0));
        this.setVisible(true);
    }
    public void iniciarPanels() {
        this.jpanelList = new ArrayList<>();
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());

        this.jpanelList.get(0).setBackground(Color.white);
        this.jpanelList.get(1).setBackground(Color.yellow);
        this.jpanelList.get(2).setBackground(Color.blue);
        this.jpanelList.get(3).setBackground(Color.red);
        this.jpanelList.get(4).setBackground(Color.green);

        this.jpanelList.get(0).add(this.jpanelList.get(1));
        this.jpanelList.get(0).add(this.jpanelList.get(2));
        this.jpanelList.get(0).add(this.jpanelList.get(3));
        this.jpanelList.get(0).add(this.jpanelList.get(4));
    }
    public void iniciarLabels() {
        
        this.jlabelList=new ArrayList<>();
        this.jlabelList.add(new JLabel("Amarillo"));
        this.jlabelList.add(new JLabel("Azul"));
        this.jlabelList.add(new JLabel("rojo"));
        this.jlabelList.add(new JLabel("Verde"));
        
        this.jpanelList.get(1).add(this.jlabelList.get(0));
        this.jpanelList.get(2).add(this.jlabelList.get(1));
        this.jpanelList.get(3).add(this.jlabelList.get(2));
        this.jpanelList.get(4).add(this.jlabelList.get(3));    
    }
}
