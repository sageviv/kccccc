/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author brian
 */

public class Window3 extends JFrame implements ActionListener{
    final private static Color mainColor = new Color(255,255,0);
    final private static Font mainFont = new Font("Sitka Text", Font.PLAIN, 40);
    final private static Font titleFont = new Font("Sitka Text", Font.BOLD, 50);

    JButton button;
    
    public Window3(){

        setTitle("Window 3");
        getContentPane().setBackground(new Color(255, 255, 0));
        setSize(1000, 700);
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(mainColor);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 50,15));

        JLabel quiztitle = new JLabel("Quiz 1");
        //CENTER QUIZ 1
        quiztitle.setFont(titleFont);
        panel1.add(quiztitle);

        JPanel panel2 = new JPanel();
        panel2.setBackground(mainColor);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2,1,0,10));
        panel3.setBackground(mainColor);
        
        JTextArea textArea = new JTextArea("Question 1:");
        textArea.setFont(new Font("Sitka Text", Font.BOLD, 30));
        textArea.setBorder(BorderFactory.createLineBorder(null));
        textArea.setBackground(Color.WHITE);
        textArea.setBorder(BorderFactory.createCompoundBorder(
            textArea.getBorder(),
            BorderFactory.createEmptyBorder(10,10,10,10)
        ));
        textArea.setEditable(false);

        JPanel quizoptions = new JPanel();
        quizoptions.setBackground(new Color(255,255,0));
        quizoptions.setLayout(new GridLayout(1,2, 10,0));

        JRadioButton optionA = new JRadioButton("True");
        optionA.setFocusable(false);
        optionA.setHorizontalAlignment(SwingConstants.CENTER);
        optionA.setBackground(mainColor);
        optionA.setFont(mainFont);

        JRadioButton optionB = new JRadioButton("False");
        optionB.setFocusable(false);
        optionB.setHorizontalAlignment(SwingConstants.CENTER);
        optionB.setBackground(mainColor);
        optionB.setFont(mainFont);

        ButtonGroup quizGroup = new ButtonGroup();
        quizGroup.add(optionA);
        quizGroup.add(optionB);

        quizoptions.add(optionA);
        quizoptions.add(optionB);

        panel3.add(textArea);
        panel3.add(quizoptions);

        JPanel panel4 = new JPanel();
        panel4.setBackground(mainColor);

        JPanel panel5 = new JPanel();
        panel5.setBackground(mainColor);

        
        //BUTTON SETTINGS
            button = new JButton();
            button.setText("DONE");
            button.setBounds(450, 550, 100, 40);
            button.setBackground(Color.WHITE);
            button.setFont(new Font(null, Font.BOLD, 20));
            button.setFocusable(false);
            button.addActionListener(this); // BUTTON LISTENER
            
        add(button); //PANSAMANTALANG BUTTON
        
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));
        
        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.SOUTH);
        add(panel3,BorderLayout.CENTER);
        add(panel4,BorderLayout.EAST);
        add(panel5,BorderLayout.WEST);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            this.dispose();
            new Window4(); //DISPLAY WINDOW2 AFTER CLICKING THE BUTTON
        }
    }
    } 
