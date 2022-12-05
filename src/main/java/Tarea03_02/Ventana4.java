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
public class Ventana4 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Ventana4() throws HeadlessException {

        this.setTitle("Ventana4");
        this.setSize(500, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarCombos();
        this.iniciarJCheckBoxs();
        this.iniciarJButtons();

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

        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//3
        this.jPanelList.add(new JPanel());//4
        this.jPanelList.add(new JPanel());//5
        this.jPanelList.add(new JPanel());//6
        this.jPanelList.add(new JPanel());//7
        this.jPanelList.add(new JPanel());//8
        this.jPanelList.add(new JPanel());//9
        this.jPanelList.add(new JPanel());//40
        this.jPanelList.add(new JPanel());//41

        this.jPanelList.get(0).setLayout(new BorderLayout());
        this.jPanelList.get(0).setBackground(Color.red);

        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.SOUTH);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.WEST);

        this.jPanelList.get(1).setLayout(new GridLayout(13, 2));

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
        this.jPanelList.get(1).add(this.jPanelList.get(27));

        this.jPanelList.get(1).add(this.jPanelList.get(28));
        this.jPanelList.get(1).add(this.jPanelList.get(29));

        this.jPanelList.get(1).add(this.jPanelList.get(30));
        this.jPanelList.get(1).add(this.jPanelList.get(31));
        
        this.jPanelList.get(3).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(3).add(this.jPanelList.get(32));
        this.jPanelList.get(3).add(this.jPanelList.get(33));
        this.jPanelList.get(3).add(this.jPanelList.get(34));
        this.jPanelList.get(3).add(this.jPanelList.get(35));
        
        
        this.jPanelList.get(4).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(4).add(this.jPanelList.get(36));
        this.jPanelList.get(4).add(this.jPanelList.get(37));
        this.jPanelList.get(4).add(this.jPanelList.get(38));
        
        

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Periodo Academico"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Sede *"));
        this.jLabelList.add(new JLabel("Matriz cuenca"));
        this.jLabelList.add(new JLabel("Campus"));
        this.jLabelList.add(new JLabel("El vecino"));
        this.jLabelList.add(new JLabel("Modalidad"));
        this.jLabelList.add(new JLabel("precencial"));
        this.jLabelList.add(new JLabel("Carrera *"));
        this.jLabelList.add(new JLabel("Agropecuaria"));
        this.jLabelList.add(new JLabel("Codigo de pproyecto"));
        this.jLabelList.add(new JLabel("Agropecuaria [redise;o]-nueva o redise;o"));
        this.jLabelList.add(new JLabel("Asignatura"));
        this.jLabelList.add(new JLabel("E-CV-IAG-003 BOTANICA"));
        this.jLabelList.add(new JLabel("Nombre del grupo*"));
        this.jLabelList.add(new JLabel("Cupos por Grupo"));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100"));
        this.jLabelList.add(new JLabel("Seleccionar jornada del grupo"));
        this.jLabelList.add(new JLabel("Oferta para estudiantes"));
        this.jLabelList.add(new JLabel("Aplica cambio de grupo"));
        this.jLabelList.add(new JLabel("CREAR GRUPO"));

        this.jPanelList.get(6).add(this.jLabelList.get(0));
        this.jPanelList.get(7).add(this.jLabelList.get(1));
        this.jPanelList.get(8).add(this.jLabelList.get(2));
        this.jPanelList.get(9).add(this.jLabelList.get(3));
        this.jPanelList.get(10).add(this.jLabelList.get(4));
        this.jPanelList.get(11).add(this.jLabelList.get(5));
        this.jPanelList.get(12).add(this.jLabelList.get(6));
        this.jPanelList.get(13).add(this.jLabelList.get(7));
        this.jPanelList.get(14).add(this.jLabelList.get(8));
        this.jPanelList.get(15).add(this.jLabelList.get(9));
        this.jPanelList.get(16).add(this.jLabelList.get(10));
        this.jPanelList.get(17).add(this.jLabelList.get(11));
        this.jPanelList.get(18).add(this.jLabelList.get(12));
        this.jPanelList.get(19).add(this.jLabelList.get(13));
        this.jPanelList.get(20).add(this.jLabelList.get(14));
        this.jPanelList.get(22).add(this.jLabelList.get(15));
        this.jPanelList.get(24).add(this.jLabelList.get(16));
        this.jPanelList.get(26).add(this.jLabelList.get(17));
        this.jPanelList.get(28).add(this.jLabelList.get(18));
        this.jPanelList.get(30).add(this.jLabelList.get(19));
        this.jPanelList.get(32).add(this.jLabelList.get(20));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(20));

        this.jPanelList.get(21).add(this.jTextFieldList.get(0));
        this.jPanelList.get(23).add(this.jTextFieldList.get(1));

    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();

        var calificacion = new String[2];
        calificacion[0] = " SI ";
        calificacion[1] = " NO ";

        var cambio = new String[2];
        cambio[0] = " SI ";
        cambio[1] = " NO ";

        var jornadas = new String[3];
        jornadas[0] = " Jornadas Disponibles ";
        jornadas[1] = " DIURNA ";
        jornadas[2] = " NOCTURNA ";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(calificacion)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(cambio)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(jornadas)));
        this.jPanelList.get(25).add(this.jComboBoxList.get(0));
        this.jPanelList.get(31).add(this.jComboBoxList.get(1));
        this.jPanelList.get(27).add(this.jComboBoxList.get(2));

    }
    
    public void iniciarJCheckBoxs() {
        this.jCheckBoxList = new ArrayList<>();

        this.jCheckBoxList.add(new JCheckBox("Nuevos", true));
        
        this.jPanelList.get(29).add(this.jCheckBoxList.get(0));
      

    }
    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
   
        this.jPanelList.get(36).add(this.jButtonList.get(0));
        this.jPanelList.get(37).add(this.jButtonList.get(1));

    }

}
