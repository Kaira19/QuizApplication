/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;
 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author KairaMGotze
 */
public class QuizApp extends JFrame {
  public QuizApp() { 

 JPanel content = new JPanel();
 content.setLayout(new BorderLayout());
 JLabel welcome=new JLabel("Welcome, Mate!");
 welcome.setFont(new Font("Serif", Font.BOLD, 20));
 welcome.setForeground(Color.BLUE);
 content.add(welcome,BorderLayout.NORTH);
 JLabel pressbutton=new JLabel("Press the button to start quiz");
 pressbutton.setFont(new Font("Serif", Font.BOLD, 20));
 pressbutton.setForeground(Color.RED);
 content.add(pressbutton,BorderLayout.CENTER);
 JButton start = new JButton("Lets Start"); 
 start.setPreferredSize(new Dimension(100,50));
 content.add(start, BorderLayout.SOUTH);;
 start.addActionListener(new startListener());
 setContentPane(content);
 setTitle("TEKWIZ QUIZ APPLICATION ");
 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

    
}
class startListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  QuizFrame quizFrame = new QuizFrame();
 quizFrame.show();
 dispose();
 }}


    public static void main(String[] args) {
      QuizApp window = new QuizApp();
 window.setSize(500,300);
 window.setVisible(true);   
     
    }
 
  
    
}
