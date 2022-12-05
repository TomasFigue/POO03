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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tom59
 */
public class Ventana2 extends JFrame {

    /**
     *
     * @author tom59
     */
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    

    public Ventana2() throws HeadlessException {

        this.setTitle("Ventana2");
        this.setSize(600, 900);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();

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
        
        this.jPanelList.add(new JPanel());//1
        this.jPanelList.add(new JPanel());//2
        this.jPanelList.add(new JPanel());//43
        

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

        this.jPanelList.get(1).setLayout(new GridLayout(9, 3));

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
        this.jPanelList.get(1).add(this.jPanelList.get(32));
        
        this.jPanelList.get(3).setLayout(new GridLayout(2, 5));
        
        this.jPanelList.get(3).add(this.jPanelList.get(33));
        this.jPanelList.get(3).add(this.jPanelList.get(34));
        this.jPanelList.get(3).add(this.jPanelList.get(35));
        this.jPanelList.get(3).add(this.jPanelList.get(36));
        this.jPanelList.get(3).add(this.jPanelList.get(37));
        this.jPanelList.get(33).setBackground(Color.CYAN);
        this.jPanelList.get(34).setBackground(Color.CYAN);
        this.jPanelList.get(35).setBackground(Color.CYAN);
        this.jPanelList.get(36).setBackground(Color.CYAN);
        this.jPanelList.get(37).setBackground(Color.CYAN);
       
        
        this.jPanelList.get(3).add(this.jPanelList.get(38));
        this.jPanelList.get(3).add(this.jPanelList.get(39));
        this.jPanelList.get(3).add(this.jPanelList.get(40));
        this.jPanelList.get(3).add(this.jPanelList.get(41));
        this.jPanelList.get(3).add(this.jPanelList.get(42));
        this.jPanelList.get(38).setBackground(Color.CYAN);

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Apellidos"));
        this.jLabelList.add(new JLabel("ORTIZ TERREROS"));
        this.jLabelList.add(new JLabel("Nombres"));
        this.jLabelList.add(new JLabel("JOSUE BENIGNO"));
        this.jLabelList.add(new JLabel("Nacionalidad"));
        this.jLabelList.add(new JLabel("ECUATORIANA"));
        this.jLabelList.add(new JLabel("Genero"));
        this.jLabelList.add(new JLabel("Masculinno"));
        this.jLabelList.add(new JLabel("Correo "));
        this.jLabelList.add(new JLabel("mortizo@yahoo.com"));
        this.jLabelList.add(new JLabel("Fecha Nacimiento"));
        this.jLabelList.add(new JLabel("01-09-1940"));
        this.jLabelList.add(new JLabel("Telefono Domicilio"));
        this.jLabelList.add(new JLabel("078695432"));
        this.jLabelList.add(new JLabel("Telefono Celular"));
        this.jLabelList.add(new JLabel("0984357604"));
        this.jLabelList.add(new JLabel("Whasaaaaa"));
        this.jLabelList.add(new JLabel("Datos Personales"));
        this.jLabelList.add(new JLabel("Personal"));

        this.jPanelList.get(6).add(this.jLabelList.get(0));
        this.jPanelList.get(7).add(this.jLabelList.get(1));
        
        this.jPanelList.get(9).add(this.jLabelList.get(2));
        this.jPanelList.get(10).add(this.jLabelList.get(3));
        
        this.jPanelList.get(12).add(this.jLabelList.get(4));
        this.jPanelList.get(13).add(this.jLabelList.get(5));
        
        this.jPanelList.get(15).add(this.jLabelList.get(6));
        this.jPanelList.get(16).add(this.jLabelList.get(7));
        
        this.jPanelList.get(18).add(this.jLabelList.get(8));
        this.jPanelList.get(19).add(this.jLabelList.get(9));
        
        this.jPanelList.get(21).add(this.jLabelList.get(10));
        this.jPanelList.get(22).add(this.jLabelList.get(11));
        
        this.jPanelList.get(24).add(this.jLabelList.get(12));
        this.jPanelList.get(25).add(this.jLabelList.get(13));
        
        this.jPanelList.get(27).add(this.jLabelList.get(14));
        this.jPanelList.get(28).add(this.jLabelList.get(15));
        
        this.jPanelList.get(30).add(this.jLabelList.get(16));
        this.jPanelList.get(35).add(this.jLabelList.get(17));
        this.jPanelList.get(38).add(this.jLabelList.get(18));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(10));
        this.jPanelList.get(31).add(this.jTextFieldList.get(0));

    }
    

}
