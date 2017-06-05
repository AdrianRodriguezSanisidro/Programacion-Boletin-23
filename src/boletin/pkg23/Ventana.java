/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg23;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Adry
 */
public class Ventana extends JFrame {

    JFrame marco = new JFrame();
    JPanel fondo = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel nombre = new JLabel("NOME");
    JLabel contra = new JLabel("PASSWORD");
    JButton premer = new JButton("PREMER");
    JButton limpar = new JButton("LIMPAR");

    String[] list = {"Elementolista1", "Elementolista2", "Elementolista3"};
    JList lista = new JList(list);
    JButton boton = new JButton("BOTON");
    JTextArea area = new JTextArea("Area de texto");

    public void ventana() {
        marco.setSize(700, 700);
        marco.setVisible(true);
        fondo.setLayout(new BoxLayout(fondo, BoxLayout.Y_AXIS));
        fondo.add(panel1, BorderLayout.NORTH);
        fondo.add(panel2, BorderLayout.CENTER);
        marco.add(fondo);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void insertarPanel1() {
        panel1.setLayout(null);
        panel1.add(nombre);
        nombre.setBounds(100, 50, 100, 100);
        panel1.add(contra);
        contra.setBounds(100, 100, 100, 100);
        panel1.add(premer);
        premer.setBounds(200, 200, 100, 50);
        panel1.add(limpar);
        limpar.setBounds(400, 200, 100, 50);
        panel1.setVisible(true);
    }

    public void insertarPanel2() {
        panel2.setLayout(null);
        panel2.add(lista);
        lista.setBounds(30, 50, 200, 200);
        panel2.add(boton);
        boton.setBounds(300, 150, 100, 50);
        panel2.add(area);
        area.setBounds(500, 70, 150, 150);
        panel2.setVisible(true);

    }

}
