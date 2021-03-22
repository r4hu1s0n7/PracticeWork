/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Hp
 */
import java.util.Random;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;

public class ClickRandom implements ActionListener{
    static JFrame jf;
    JPanel jp;
    static JButton jb1,jb2,jb3,jb4;
    static int c=0;
    JLabel jl1 = new JLabel("Lets Start!");
    ClickRandom(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setVisible(true);
   
        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jb4 = new JButton();
        jf.add(jb1); jf.add(jb2); jf.add(jb3); jf.add(jb4);
        jb1.setBounds(50,80,100,80); jb3.setBounds(200,80,100,80);
        jb2.setBounds(50,180,100,80); jb4.setBounds(200,180,100,80);
        jl1.setBounds(30,300,50,50); jl1.setVisible(true);
        jf.add(jl1);
    }
    
    public void actionPerformed(ActionEvent e){
        jb1.setText("");  jb2.setText("");  jb3.setText("");  jb4.setText("");
        System.out.print("k");
        int k = clicks();
        if(k == 0 && e.getSource() == jb1){
            c++;
            jl1.setText("Good Job .....score" + String.valueOf(c));
        }
        else if(k == 0 && e.getSource() == jb1){
            c++;
            jl1.setText("Good Job .....score" + String.valueOf(c));
        }
        else  if(k == 0 && e.getSource() == jb1){
            c++;
            jl1.setText("Good Job .....score" + String.valueOf(c));
        }
        else if(k == 0 && e.getSource() == jb1){
            c++;
            jl1.setText("Good Job .....score" + String.valueOf(c));
        }
        else{
            jl1.setText("Wrong...Restart");
        }
            return;
    }
    
    static int clicks(){
        Random r = new Random();
        int k = r.nextInt(4)+0;
        System.out.print(k);
        jb1.setText("Not Here");
        jb2.setText("Not Here");
        jb3.setText("Not Here");
        jb4.setText("Not Here");
        
        if(k == 0){
                    jb1.setText("Click Here");
        }
        else  if(k == 1){
                    jb2.setText("Click Here");
        }
        else  if(k == 2){
                    jb3.setText("Click Here");
        }
        else  if(k == 3){
                    jb4.setText("Click Here");
        }
        return k;
    }
    
    public static void main(String[] args){
        ClickRandom cr = new ClickRandom();
       int k =  clicks();

    }


}
