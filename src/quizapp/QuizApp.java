/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;
 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author KairaMGotze
 */
public class QuizApp extends JFrame {
 private Image img;

    public QuizApp() throws IOException { 

        
BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\KairaMGotze\\Downloads\\test.png"));
JLabel picLabel = new JLabel(new ImageIcon(myPicture));
add(picLabel);
        
       
        
        

 JPanel content = new JPanel();

 content.setLayout(new BorderLayout());
 JLabel welcome=new JLabel("      Welcome, Mate! \n Press the button to start quiz!!!");
 welcome.setFont(new Font("Serif", Font.BOLD, 20));
 welcome.setForeground(Color.BLUE);
 content.add(welcome,BorderLayout.NORTH);
 JButton start = new JButton("Lets Start"); 
 start.setPreferredSize(new Dimension(100,50));
 content.add(start, BorderLayout.SOUTH);
  content.add(picLabel);

 start.addActionListener(new startListener());
 setContentPane(content);
 setTitle("TEKWIZ QUIZ APPLICATION ");
 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
 setResizable(false);
    
}
class startListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  QuizFrame quizFrame = new QuizFrame();
 quizFrame.show();
 dispose();
 }}


    public static void main(String[] args) throws IOException {
      QuizApp window = new QuizApp();
 window.setSize(500,300);
 window.setVisible(true);   
     
    }
 
  
    
}
