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
public class Ventana5 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Ventana5() throws HeadlessException {

        this.setTitle("Ventana5");
        this.setSize(1000, 300);
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
        this.jPanelList.add(new JPanel());//20

        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//3
        this.jPanelList.add(new JPanel());//4
        this.jPanelList.add(new JPanel());//5
        this.jPanelList.add(new JPanel());//6
        this.jPanelList.add(new JPanel());//7
        this.jPanelList.add(new JPanel());//8
        this.jPanelList.add(new JPanel());//9
        this.jPanelList.add(new JPanel());//30

        this.jPanelList.get(2).setLayout(new BorderLayout());
 
        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.SOUTH);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.WEST);

        this.jPanelList.get(1).setLayout(new GridLayout(3, 1));

        this.jPanelList.get(1).add(this.jPanelList.get(6));
        this.jPanelList.get(1).add(this.jPanelList.get(7));
        this.jPanelList.get(1).add(this.jPanelList.get(8));

        this.jPanelList.get(6).setLayout(new GridLayout(1, 4));

        this.jPanelList.get(6).add(this.jPanelList.get(9));
        this.jPanelList.get(6).add(this.jPanelList.get(10));
        this.jPanelList.get(6).add(this.jPanelList.get(11));
        this.jPanelList.get(6).add(this.jPanelList.get(12));

        this.jPanelList.get(7).setLayout(new GridLayout(1, 3));

        this.jPanelList.get(7).add(this.jPanelList.get(13));
        this.jPanelList.get(7).add(this.jPanelList.get(14));
        this.jPanelList.get(7).add(this.jPanelList.get(15));

        this.jPanelList.get(8).add(this.jPanelList.get(16));

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Sede *"));
        this.jLabelList.add(new JLabel("Campus"));
        this.jLabelList.add(new JLabel("Carrera *"));
        this.jLabelList.add(new JLabel("Codigo de pproyecto"));
        this.jLabelList.add(new JLabel("Modalidad"));
        this.jLabelList.add(new JLabel("Periodo Academico"));
        this.jLabelList.add(new JLabel("Fecha inicio Clases : 28/23/2022 al 06/28/2022"));

        
        
        

        this.jPanelList.get(9).add(this.jLabelList.get(0));
        this.jPanelList.get(10).add(this.jLabelList.get(1));
        this.jPanelList.get(11).add(this.jLabelList.get(2));
        this.jPanelList.get(13).add(this.jLabelList.get(3));
        this.jPanelList.get(14).add(this.jLabelList.get(4));
        this.jPanelList.get(15).add(this.jLabelList.get(5));
        this.jPanelList.get(16).add(this.jLabelList.get(6));
 
    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();

        var listaSedes = new String[3];
        listaSedes[0] = "Guayakill";
        listaSedes[1] = "Matriz Cuenca";
        listaSedes[2] = "quito";
        
        var listaCampus = new String[1];
        listaCampus[0] = "El vecino";
        
        var calificacion = new String[2];
        calificacion[0] = " SI ";
        calificacion[1] = " NO ";
        
        var listaCarreras = new String[3];
        listaCarreras[0] = "Arquitectura";
        listaCarreras[1] = "Electronica";
        listaCarreras[2] = "Filosofia";

        var codigo = new String[2];
        codigo[0] = " AGROPECUARIA [REDSE;O]-NUEVA O REISE;O ";
        codigo[1] = " NO ";
        
        var listaModalidad = new String[2];
        listaModalidad[0]="Precencial";
        listaModalidad[1]="Virtual";

        var periodo = new String[3];
        periodo[0] = " 2022=-2022 ";
 
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(calificacion)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCarreras)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(codigo)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaModalidad)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(periodo)));
        this.jPanelList.get(6).add(this.jComboBoxList.get(0));
        this.jPanelList.get(7).add(this.jComboBoxList.get(1));
        this.jPanelList.get(8).add(this.jComboBoxList.get(2));
        this.jPanelList.get(9).add(this.jComboBoxList.get(0));
        this.jPanelList.get(10).add(this.jComboBoxList.get(1));
        this.jPanelList.get(11).add(this.jComboBoxList.get(2));

    }

}
