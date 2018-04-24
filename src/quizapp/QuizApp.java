/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;
 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
/**
 *
 * @author KairaMGotze
 */
public class QuizApp extends JFrame {
  public QuizApp() { 

 JPanel content = new JPanel();
 content.setLayout(new BorderLayout());
 content.add(new JLabel("Welcome, Mate!"),BorderLayout.NORTH);
 content.add(new JLabel("Press the button to start quiz"),BorderLayout.CENTER);
 JButton start = new JButton("Lets Start"); 
 start.setPreferredSize(new Dimension(100,50));
 content.add(start, BorderLayout.SOUTH);;
 start.addActionListener(new startListener());
 setContentPane(content);
 setTitle("TEKWIZ QUIZ APPLICATION ");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    
}
class startListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
   
 //QuizFrame.show();
 
 }}
    public static void main(String[] args) {
      QuizApp window = new QuizApp();
 window.setSize(500,300);
 window.setVisible(true);   
     
    }
 
  
    
}
