/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_02.vista;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tom59
 */
public class Ventana0302a extends JFrame{
    
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldlList;
    public List<JButton> jButtonList;

    public Ventana0302a(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }
    
    public void iniciarPaneles(){
        this.jPanelList=new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.red);
        this.jPanelList.get(0).setBackground(Color.green);
        this.jPanelList.get(0).setBackground(Color.blue);
        
        this.jPanelList.get(0).setLayout(new GridLayout(6,1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        
    }
    public void iniciarJTextFields(){
        this.jLabelList=new ArrayList<>();
        
        this.jLabelList.add(new JLabel("Ingrese codigo"));
        this.jLabelList.add(new JLabel("Ingrese nombre"));
        this.jLabelList.add(new JLabel("Ingrese peso"));
        this.jLabelList.add(new JLabel("Ingrese estatura"));
        this.jLabelList.add(new JLabel("Ingrese ingrese fecha de nacimiento"));
        
        this.jTextFieldlList=new ArrayList<>();
        this.jTextFieldlList.add(new JTextField(10));
        this.jTextFieldlList.add(new JTextField(20));
        this.jTextFieldlList.add(new JTextField(5));
        this.jTextFieldlList.add(new JTextField(5));
         this.jTextFieldlList.add(new JTextField("yyyy"));
        this.jTextFieldlList.add(new JTextField("mm"));
        this.jTextFieldlList.add(new JTextField("dd"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldlList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldlList.get(1));
       
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldlList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldlList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldlList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldlList.get(5));
        this.jPanelList.get(5).add(this.jTextFieldlList.get(6));
       
        
    }
    public void iniciarJButtons(){
        this.jButtonList=new ArrayList<>();
        
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jPanelList.get(6).add(this.jButtonList.get(0));
        this.jPanelList.get(6).add(this.jButtonList.get(1));
        
    }
    
 
}
