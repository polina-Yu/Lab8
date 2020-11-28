package lab7;

import java.util.*;
import javax.swing.*;

public class Panel extends JFrame {
    public JButton button;
    public JTextField text1;

    public Panel(){
    super("Пробное окно");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(900, 600);
    
    button = new JButton("четко");
    text1 = new JTextField();

    setLayout(null);
    
    button.setSize(100, 50);
    button.setLocation(750,500);
    text1.setSize(860, 400);
    text1.setLocation(10,10);

    add(button);
    add(text1);
    //text1.setText(printCollection("Оригинал", list));
    }   
}