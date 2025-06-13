/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemoryGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class GameOver implements ActionListener {

    JFrame frame = new JFrame();
    JLabel lblTitle = new JLabel();
    JLabel lblMoves = new JLabel();
    JLabel lblTime = new JLabel();
    JButton btnPlayAgain = new JButton();
    private String moves;

    public GameOver() {

        lblTitle.setText("CONGRa");
        lblTitle.setBounds(80, 20, 200, 50);
        lblTitle.setFont(new Font("Verdana", Font.PLAIN, 20));
        lblTitle.setBorder(BorderFactory.createBevelBorder(1));
        lblTitle.setOpaque(true);
        lblTitle.setHorizontalAlignment(JTextField.CENTER);

        lblMoves.setText("Moves : " + moves);

        lblTime.setText("Time : ");
        btnPlayAgain.setText("Play Again");
        btnPlayAgain.setBounds(80, 50, 80, 30);

        frame.add(lblTitle);
        frame.add(lblMoves);
        frame.add(lblTime);
        frame.add(btnPlayAgain);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 320);
        frame.setVisible(true);
        frame.setLayout(null);
        MemoryGame dialog = new MemoryGame(new javax.swing.JFrame(), true);
        dialog.setEnabled(true);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
