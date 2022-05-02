package Window;

import javax.swing.*;

public class myWindow extends JFrame {

    myWindow(){

        super("First Swing ");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Dispose On close libere toute les recousres de la fenêtre ...

    }



    public static void main(String[] args) {

        myWindow window = new myWindow();
        window.setVisible(true);

    }
}
