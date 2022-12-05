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
public class Ventana3 extends JFrame{
    
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;
    
        public Ventana3() throws HeadlessException {

        this.setTitle("Ventana3");
        this.setSize(500, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
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
        
        this.jPanelList.get(1).setLayout(new GridLayout(7, 3));

        this.jPanelList.get(1).add(this.jPanelList.get(6));
        this.jPanelList.get(1).add(this.jPanelList.get(7));
        this.jPanelList.get(1).add(this.jPanelList.get(8));
        
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
        
        this.jPanelList.get(1).add(this.jPanelList.get(21));
        this.jPanelList.get(1).add(this.jPanelList.get(22));
        this.jPanelList.get(1).add(this.jPanelList.get(23));
        
        this.jPanelList.get(1).add(this.jPanelList.get(24));
        this.jPanelList.get(1).add(this.jPanelList.get(25));
        this.jPanelList.get(1).add(this.jPanelList.get(26));

    }
    
    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Periodo Academico"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera *"));
        this.jLabelList.add(new JLabel("Modalidad *"));
        this.jLabelList.add(new JLabel("Sede *"));
        this.jLabelList.add(new JLabel("Campus *"));
        this.jLabelList.add(new JLabel("Jornada *"));
        this.jLabelList.add(new JLabel("Fecha de Registro *"));
        this.jLabelList.add(new JLabel("29/04/2022 *"));
        
        this.jPanelList.get(6).add(this.jLabelList.get(0));
        this.jPanelList.get(7).add(this.jLabelList.get(1));
        this.jPanelList.get(9).add(this.jLabelList.get(2));
        this.jPanelList.get(12).add(this.jLabelList.get(3));
        this.jPanelList.get(15).add(this.jLabelList.get(4));
        this.jPanelList.get(18).add(this.jLabelList.get(5));
        this.jPanelList.get(21).add(this.jLabelList.get(6));
        this.jPanelList.get(24).add(this.jLabelList.get(7));
        this.jPanelList.get(25).add(this.jLabelList.get(8));
        

    }
   
    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        
        var listaCarreras = new String[3];
        listaCarreras[0] = "Arquitectura";
        listaCarreras[1] = "Electronica";
        listaCarreras[2] = "Filosofia";
        
        var listaModalidad = new String[2];
        listaModalidad[0]="Precencial";
        listaModalidad[1]="Virtual";
        
        var listaSedes = new String[3];
        listaSedes[0] = "Guayakill";
        listaSedes[1] = "Matriz Cuenca";
        listaSedes[2] = "quito";
        
        var listaCampus = new String[1];
        listaCampus[0] = "El vecino";
        
        
        var listaJornada = new String[2];
        listaSedes[0] = "Diurna";
        listaSedes[1] = "Nocturna";
        
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCarreras)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaModalidad)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSedes)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));
        

        this.jPanelList.get(10).add(this.jComboBoxList.get(0));
        this.jPanelList.get(13).add(this.jComboBoxList.get(1));
        this.jPanelList.get(16).add(this.jComboBoxList.get(2));
        this.jPanelList.get(19).add(this.jComboBoxList.get(3));
        this.jPanelList.get(22).add(this.jComboBoxList.get(4));
    }
    
}