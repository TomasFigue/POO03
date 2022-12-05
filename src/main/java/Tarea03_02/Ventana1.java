/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author tom59
 */
public class Ventana1 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Ventana1() throws HeadlessException {

        this.setTitle("Ventana1");
        this.setSize(500, 300);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.iniciarCombos();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//3
        this.jPanelList.add(new JPanel());//4
        this.jPanelList.add(new JPanel());//5
        this.jPanelList.add(new JPanel());//6
        this.jPanelList.add(new JPanel());//7
        this.jPanelList.add(new JPanel());//8
        this.jPanelList.add(new JPanel());//9
        this.jPanelList.add(new JPanel());//10
        
        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//3
        this.jPanelList.add(new JPanel());//4
        this.jPanelList.add(new JPanel());//5
        this.jPanelList.add(new JPanel());//6
        this.jPanelList.add(new JPanel());//7
        this.jPanelList.add(new JPanel());//8
        this.jPanelList.add(new JPanel());//9
        this.jPanelList.add(new JPanel());//10
        
        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//3
        this.jPanelList.add(new JPanel());//4
        this.jPanelList.add(new JPanel());//5
        this.jPanelList.add(new JPanel());//6
        this.jPanelList.add(new JPanel());//7
        this.jPanelList.add(new JPanel());//8
        this.jPanelList.add(new JPanel());//9
        this.jPanelList.add(new JPanel());//10

        this.jPanelList.get(0).setLayout(new BorderLayout());
        this.jPanelList.get(0).setBackground(Color.red);

        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.SOUTH);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.WEST);

        this.jPanelList.get(1).setBackground(Color.white);
        this.jPanelList.get(2).setBackground(Color.BLUE);
        this.jPanelList.get(3).setBackground(Color.blue);
        this.jPanelList.get(4).setBackground(Color.blue);
        this.jPanelList.get(5).setBackground(Color.blue);
        
        this.jPanelList.get(1).setLayout(new GridLayout(5, 3));

        this.jPanelList.get(1).add(this.jPanelList.get(6));
        this.jPanelList.get(1).add(this.jPanelList.get(7));
        this.jPanelList.get(1).add(this.jPanelList.get(8));
        
        this.jPanelList.get(6).setBackground(Color.CYAN);
        this.jPanelList.get(7).setBackground(Color.CYAN);
        this.jPanelList.get(8).setBackground(Color.CYAN);
        
        this.jPanelList.get(1).add(this.jPanelList.get(9));
        this.jPanelList.get(1).add(this.jPanelList.get(10));
        this.jPanelList.get(1).add(this.jPanelList.get(11));
        
        this.jPanelList.get(1).add(this.jPanelList.get(12));
        this.jPanelList.get(1).add(this.jPanelList.get(13));
        this.jPanelList.get(1).add(this.jPanelList.get(14));
        
        this.jPanelList.get(1).add(this.jPanelList.get(15));
        this.jPanelList.get(1).add(this.jPanelList.get(16));
        this.jPanelList.get(1).add(this.jPanelList.get(17));
        
        this.jPanelList.get(1).add(this.jPanelList.get(18));
        this.jPanelList.get(1).add(this.jPanelList.get(19));
        this.jPanelList.get(1).add(this.jPanelList.get(20));

    }
    
    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel(" INSCRIBETE "));
        this.jLabelList.add(new JLabel("Seleccione una sede"));
        this.jLabelList.add(new JLabel("Tipo Documento"));
        this.jLabelList.add(new JLabel("Ingrese su Identificacion"));
        
        this.jPanelList.get(7).add(this.jLabelList.get(0));
        this.jPanelList.get(9).add(this.jLabelList.get(1));
        this.jPanelList.get(12).add(this.jLabelList.get(2));
        this.jPanelList.get(15).add(this.jLabelList.get(3));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(10));
        this.jPanelList.get(16).add(this.jTextFieldList.get(0));
      
    }
    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Ingresar"));      
        this.jPanelList.get(19).add(this.jButtonList.get(0));
        
    }
    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        
        var listaSedes = new String[3];
        listaSedes[0] = "Guayakill";
        listaSedes[1] = "Matriz Cuenca";
        listaSedes[2] = "quito";
        
        var listaDocumento = new String[2];
        listaDocumento[0]="Cedula";
        listaDocumento[1]="RUC";
        
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSedes)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaDocumento)));

        this.jPanelList.get(10).add(this.jComboBoxList.get(0));
        this.jPanelList.get(13).add(this.jComboBoxList.get(1));
    }

}
