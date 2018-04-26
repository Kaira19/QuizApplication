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


    public QuizApp()  { 

             

 JPanel content = new JPanel();

 content.setLayout(new GridLayout(0,1));
 

 JLabel welcome=new JLabel("Welcome, Mate to quiz application");
 JLabel question = new JLabel("It contain 5 multiple choise questions");
 JLabel press = new JLabel("Choose level to start quiz!!!");
 JButton beginer = new JButton("Beginer level"); 
 JButton intermediate = new JButton("Intermediate level");
 JButton master = new JButton("Master level");
 press.setFont(new Font("Serif", Font.BOLD, 20));
 press.setForeground(Color.BLUE);
 question.setFont(new Font("Serif", Font.BOLD, 20));
 question.setForeground(Color.BLUE);
 welcome.setFont(new Font("Serif", Font.BOLD, 20));
 welcome.setForeground(Color.BLUE);
 content.add(welcome);
 content.add(question);
 content.add(press);
 content.add(beginer);
 content.add(intermediate);
 content.add(master);
 beginer.addActionListener(new startListener());
 intermediate.addActionListener(new intermediateListener());
 master.addActionListener(new masterListener());
 setContentPane(content);
 setTitle("TEKWIZ QUIZ APPLICATION ");
 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
 setResizable(false);
    
}
    class startListener implements ActionListener{
         public void actionPerformed(ActionEvent e) {
  QuizFrame quizFrame = new QuizFrame();
 quizFrame.show();
 dispose();
 }
    }
class intermediateListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  QuizFrame2 quizFrame1 = new QuizFrame2();
 quizFrame1.show();
 dispose();
 }}
class masterListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
     QuizFrame3 quizFrame2 = new QuizFrame3();
 quizFrame2.show();
 dispose();   
    }
}


    public static void main(String[] args)  {
      QuizApp window = new QuizApp();
 window.setSize(500,500);
 window.setVisible(true);   
     
    }
 
  
    
}
