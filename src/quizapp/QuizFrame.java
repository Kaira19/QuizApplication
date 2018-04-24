/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author KairaMGotze
 */
public class QuizFrame extends javax.swing.JFrame implements ActionListener {
       public static   String[][] questions = new String[5][5];
       public static int[] answers = new int[5];
      
       public static int page = 0 ;
       public static int result  = 0;
       boolean[] srabotalo = new boolean[5];
boolean[] correct = new boolean[5];


    /**
     * Creates new form NewJFrame
     */
              public void setBools()
       {
           srabotalo[0] = false;
           srabotalo[1] = false;
           srabotalo[2] = false;
           srabotalo[3] = false;
           srabotalo[4] = false;


       }
         public void setCorrects()
       {
           correct[0] = false;
           correct[1] = false;
           correct[2] = false;
           correct[3] = false;
           correct[4] = false;


       }
       public void getAnswers()
       {
           answers[0] = 2;
           answers[1] = 1;
           answers[2] = 4;
           answers[3] = 3;
           answers[4] = 2;


       }
       public void FullArray()
       {
          questions[0][0] = "Choose the correct option in terms of Issues related to professional responsibility";
          questions[0][1] = "Confidentiality";
          questions[0][2] = "Intellectual property rights";
          questions[0][3] = "Both Confidentiality & Intellectual property rights";
          questions[0][4] = "Managing Client Relationships";

          questions[1][0] = "What is a Software ?";
          questions[1][1] = "Software is set of programs";
          questions[1][2] = "Software is documentation and configuration of data";
          questions[1][3] = "Software is set of programs, documentation & configuration of data";
          questions[1][4] = "None of the mentioned";

          questions[2][0] = "What are attributes of good software?";
          questions[2][1] = "Software maintainability";
          questions[2][2] = "Software functionality";
          questions[2][3] = "Software development";
          questions[2][4] = "Software maintainability & functionality";

          questions[3][0] = "Which of these software engineering activities are not a part of software processes";
          questions[3][1] = "Software dependence";
          questions[3][2] = "Software development";
          questions[3][3] = "Software validation";
          questions[3][4] = "Software specification";

          questions[4][0] = "Which of these does not account for software failure?";
          questions[4][1] = "Increasing Demand";
          questions[4][2] = "Low expectation";
          questions[4][3] = "Increasing Supply";
          questions[4][4] = "Less reliable and expensive";

       }
    public QuizFrame() {//additional new commands
        initComponents();
                group.add(jRadioButton1);
                group.add(jRadioButton2);
                group.add(jRadioButton3);
                group.add(jRadioButton4);
                jRadioButton1.addActionListener(this);
                jRadioButton2.addActionListener(this);
                jRadioButton3.addActionListener(this);
                jRadioButton4.addActionListener(this);
                jButton1.addActionListener(this);

FullArray();
getAnswers();
setThisText(page);
setBools();
setCorrects();
    }
    public  void setThisText(int i)
    {
        String [] hey = new String[5];
        hey[0]=questions[i][0];
        hey[1]=questions[i][1];
        hey[2]=questions[i][2];
        hey[3]=questions[i][3];
        hey[4]=questions[i][4];
            jTextField1.setText(hey[0]);
          jRadioButton1.setText(hey[1]);
          jRadioButton2.setText(hey[2]);
          jRadioButton3.setText(hey[3]);
          jRadioButton4.setText(hey[4]);
          if(i==4) jButton1.setText("Submit");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setEditable(false);
        jTextField1.setText("J");

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("jRadioButton1");

        jRadioButton3.setText("jRadioButton1");

        jRadioButton4.setText("jRadioButton1");

        jButton1.setText("Next");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );

        jRadioButton1.getAccessibleContext().setAccessibleDescription("");
        jRadioButton2.getAccessibleContext().setAccessibleDescription("");
        jRadioButton3.getAccessibleContext().setAccessibleDescription("");
        jRadioButton4.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */                

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new QuizFrame().setVisible(true);
            }
        });


    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private static javax.swing.JRadioButton jRadioButton1;
    private static javax.swing.JRadioButton jRadioButton2;
    private static javax.swing.JRadioButton jRadioButton3;
    private static javax.swing.JRadioButton jRadioButton4;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
              static  ButtonGroup group = new ButtonGroup();

    @Override
    public void actionPerformed(ActionEvent a) {
if(a.getSource()==jButton1)
{
        if(page>=4)
    {
         if(correct[page]==true) 
        {result++;
        }
Result result = new Result();
result.show();
        return;
    }
        if(correct[page]==true) 
        {result++;
                }
page++;
setThisText(page);

}

if(a.getSource()==jRadioButton1)
{
    if(srabotalo[page] == false)
    {
    if(answers[page]==1) 
    { srabotalo[page] = true;
        correct[page]=true;
    }
    else 
    {
               correct[page]=false; 
    }
    }
}
if(a.getSource()==jRadioButton2)
{
 if(srabotalo[page] == false)
    {
    if(answers[page]==2) 
    { srabotalo[page] = true;
        correct[page]=true;
    }
    else 
    {
               correct[page]=false; 
    }
    }

}
if(a.getSource()==jRadioButton3)
{
 if(srabotalo[page] == false)
    {
    if(answers[page]==3) 
    { srabotalo[page] = true;
        correct[page]=true;
    }
    else 
    {
               correct[page]=false; 
    }
    }

}

if(a.getSource()==jRadioButton4)
{
 if(srabotalo[page] == false)
    {
    if(answers[page]==4) 
    { srabotalo[page] = true;
        correct[page]=true;
    }
    else 
    {
               correct[page]=false; 
    }
    }

}

    }



}
