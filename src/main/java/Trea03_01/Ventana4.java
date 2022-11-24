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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tom59
 */
public class Ventana4 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JButton> jButtonList;

    public Ventana4() throws HeadlessException {

        this.setTitle("BorderLayout");
        this.setSize(350, 200);
        this.setLocation(200, 700);
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
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(new GridLayout(3, 1));
        this.jPanelList.get(1).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(2).setLayout(new GridLayout(1, 1));
        this.jPanelList.get(3).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(7).setLayout(new GridLayout(5, 5));

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));

        this.jPanelList.get(1).add(this.jPanelList.get(4));
        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));

        this.jPanelList.get(7).setBackground(Color.red);
        
        this.jPanelList.get(13).setBackground(Color.red);
        this.jPanelList.get(14).setBackground(Color.white);
        this.jPanelList.get(15).setBackground(Color.blue);
        this.jPanelList.get(16).setBackground(Color.white);
        this.jPanelList.get(17).setBackground(Color.red);
        
        this.jPanelList.get(18).setBackground(Color.white);
        this.jPanelList.get(19).setBackground(Color.white);
        this.jPanelList.get(20).setBackground(Color.blue);
        this.jPanelList.get(21).setBackground(Color.white);
        this.jPanelList.get(22).setBackground(Color.white);
        
        this.jPanelList.get(23).setBackground(Color.blue);
        this.jPanelList.get(24).setBackground(Color.blue);
        this.jPanelList.get(25).setBackground(Color.blue);
        this.jPanelList.get(26).setBackground(Color.blue);
        this.jPanelList.get(27).setBackground(Color.blue);
        
        this.jPanelList.get(28).setBackground(Color.white);
        this.jPanelList.get(29).setBackground(Color.white);
        this.jPanelList.get(30).setBackground(Color.blue);
        this.jPanelList.get(31).setBackground(Color.white);
        this.jPanelList.get(32).setBackground(Color.white);
        
        this.jPanelList.get(33).setBackground(Color.red);
        this.jPanelList.get(34).setBackground(Color.white);
        this.jPanelList.get(35).setBackground(Color.blue);
        this.jPanelList.get(36).setBackground(Color.white);
        this.jPanelList.get(37).setBackground(Color.red);
        
        
      
        

        this.jPanelList.get(2).setLayout(new BorderLayout());

        this.jPanelList.get(2).add(this.jPanelList.get(7), BorderLayout.CENTER);
        this.jPanelList.get(2).add(this.jPanelList.get(8), BorderLayout.EAST);
        this.jPanelList.get(2).add(this.jPanelList.get(9), BorderLayout.WEST);

        this.jPanelList.get(3).add(this.jPanelList.get(10));
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
        
        this.jPanelList.get(7).add(this.jPanelList.get(13));
        this.jPanelList.get(7).add(this.jPanelList.get(14));
        this.jPanelList.get(7).add(this.jPanelList.get(15));
        this.jPanelList.get(7).add(this.jPanelList.get(16));
        this.jPanelList.get(7).add(this.jPanelList.get(17));
        
        this.jPanelList.get(7).add(this.jPanelList.get(18));
        this.jPanelList.get(7).add(this.jPanelList.get(19));
        this.jPanelList.get(7).add(this.jPanelList.get(20));
        this.jPanelList.get(7).add(this.jPanelList.get(21));
        this.jPanelList.get(7).add(this.jPanelList.get(22));
        
        this.jPanelList.get(7).add(this.jPanelList.get(23));
        this.jPanelList.get(7).add(this.jPanelList.get(24));
        this.jPanelList.get(7).add(this.jPanelList.get(25));
        this.jPanelList.get(7).add(this.jPanelList.get(26));
        this.jPanelList.get(7).add(this.jPanelList.get(27));
        
        this.jPanelList.get(7).add(this.jPanelList.get(28));
        this.jPanelList.get(7).add(this.jPanelList.get(29));
        this.jPanelList.get(7).add(this.jPanelList.get(30));
        this.jPanelList.get(7).add(this.jPanelList.get(31));
        this.jPanelList.get(7).add(this.jPanelList.get(32));
        
        this.jPanelList.get(7).add(this.jPanelList.get(33));
        this.jPanelList.get(7).add(this.jPanelList.get(34));
        this.jPanelList.get(7).add(this.jPanelList.get(35));
        this.jPanelList.get(7).add(this.jPanelList.get(36));
        this.jPanelList.get(7).add(this.jPanelList.get(37));
        
        

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Button1"));
        this.jButtonList.add(new JButton("2"));
        this.jButtonList.add(new JButton("Button3"));
        this.jButtonList.add(new JButton("Long-Named Button 4"));
        this.jButtonList.add(new JButton("Button5"));

        this.jPanelList.get(5).add(this.jButtonList.get(0));
        this.jPanelList.get(9).add(this.jButtonList.get(2));
        this.jPanelList.get(8).add(this.jButtonList.get(4));
        this.jPanelList.get(11).add(this.jButtonList.get(3));

    }
}
