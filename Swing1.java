import javax.swing.*;
import java.awt.GridLayout;
class Swing1{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       frame.setLayout(new GridLayout(3,3));
       JButton buttons[] = new JButton[9];
       for(int i=0; i<9; i++){
       	buttons[i] = new JButton("");
       frame.add(buttons[i]);
       }
       frame.setVisible(true);
    }
}