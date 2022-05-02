package Window;

import javax.swing.*;
import java.awt.*;

public class myWindow extends JFrame {

    myWindow(){

        super("First Swing ");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Dispose On close libere toute les recousres de la fenêtre ...
        this.setSize(600,400); // tille de la window a la création
       // this.setLocation(100,500);  position de la window
        this.setLocationRelativeTo(null);// centre de l'ecran
        JPanel contentPane  = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT)); // mettre les elem de la window en ligne
        contentPane.add(new JButton("Push"));// rajouter un boutton
        contentPane.add(new JButton("click"));
        contentPane.add(new JCheckBox("coch moi "));// rajoute une case a cocher
        contentPane.add( new JTextField ("edit me ")); // zone de texte

    }



    public static void main(String[] args) {

        myWindow window = new myWindow();
        window.setVisible(true);

    }
}
