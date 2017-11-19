package base.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener
{
    //Elemente
    public static JFrame jf1 = new JFrame();
    public static JLabel lblAusgabe = new JLabel();
    public static JLabel lblTextAusgabe = new JLabel();
    public static JLabel lblFehler = new JLabel();
    public static JLabel lblX = new JLabel();
    public static JLabel lblY = new JLabel();
    public static JLabel lblZ = new JLabel();
    public static JTextField txtX = new JTextField();
    public static JTextField txtY = new JTextField();
    public static JTextField txtZ = new JTextField();

    public static JButton cmdAusgabe;
    public static float ausgabe;



    //Veränderbar
    public int framewidth = 300, framehight = 200;
    String title = "Volumen";
    public boolean ja = true, nein = false;

    public Gui()
    {
        //new GuiFunctions();

        //jf1 JFrame1 Änderungen
        jf1.setVisible(true);
        jf1.setSize(framewidth, framehight);
        jf1.setLocationRelativeTo(null);
        jf1.setResizable(false);
        jf1.setTitle(title);
        jf1.getContentPane().setLayout(null);

                        /*Elemente*/

        //Label
        lblX = new JLabel("Länge:");
        lblX.setBounds(20,10,80,15);
        lblX.setVisible(true);
        jf1.add(lblX);

        lblY = new JLabel("Breite:");
        lblY.setBounds(20,35,80,15);
        lblY.setVisible(true);
        jf1.add(lblY);

        lblZ = new JLabel("Höhe:");
        lblZ.setBounds(20,60,80,15);
        lblZ.setVisible(true);
        jf1.add(lblZ);

        lblAusgabe = new JLabel("Ausgabe:");
        lblAusgabe.setBounds(20,100,80,15);
        lblAusgabe.setVisible(true);
        jf1.add(lblAusgabe);

        lblTextAusgabe = new JLabel(String.valueOf(ausgabe));
        lblTextAusgabe.setBounds(80, 100, 80, 15);
        lblTextAusgabe.setVisible(true);
        jf1.add(lblTextAusgabe);

        lblFehler = new JLabel("");
        lblFehler.setBounds(20, 120, 300, 15);
        lblFehler.setVisible(true);
        lblFehler.setForeground(Color.RED);
        jf1.add(lblFehler);

        //Textfelder
        txtX = new JTextField("");
        txtX.setBounds(70, 10, 150, 20);
        txtX.setVisible(true);
        jf1.add(txtX);

        txtY = new JTextField("");
        txtY.setBounds(70, 35, 150, 20);
        txtY.setVisible(true);
        jf1.add(txtY);

        txtZ = new JTextField("");
        txtZ.setBounds(70, 60, 150, 20);
        txtZ.setVisible(true);
        jf1.add(txtZ);

        //Button
        cmdAusgabe = new JButton("Rechnen");
        cmdAusgabe.setBounds(150, 95, 100, 20);
        cmdAusgabe.setVisible(true);
        cmdAusgabe.addActionListener(this);
        jf1.add(cmdAusgabe);
    }


    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == cmdAusgabe)
        {
            if(txtX.getText().isEmpty() || txtY.getText().isEmpty() || txtZ.getText().isEmpty())
            {
                lblFehler.setText("Bitte füllen sie alle Lücken aus!");
            }
            else if(txtX.getText().matches("[A-Z]*" + "[a-z]*") || txtY.getText().matches("[A-Z]*" + "[a-z]*") || txtZ.getText().matches("[A-Z]*" + "[a-z]*")){
                lblFehler.setText("Es dürfen nur Zahlen eingegeben werden!");
            }
            else if(ae.getSource() == cmdAusgabe)
            {
                float x = Float.parseFloat(txtX.getText());
                float y = Float.parseFloat(txtY.getText());
                float z = Float.parseFloat(txtZ.getText());

                ausgabe = x * y * z;
                lblTextAusgabe.setText(String.valueOf(ausgabe + "³"));
            }
        }
    }
}
