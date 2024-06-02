package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AppWindow extends JFrame implements ActionListener {
    Random random = new Random();
    JLabel pokazPrzepowiednie;
    public AppWindow(){
        setSize(600,400);
        setTitle("Przepowiednia");
        setLayout(null);

        JButton button = new JButton("Wygeneruj przepowiednie");
        button.setBounds(200,50,200,20);
        add(button);

        button.addActionListener(this);
        pokazPrzepowiednie = new JLabel();
        pokazPrzepowiednie.setBounds(50,200,500,20);
        add(pokazPrzepowiednie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pokazPrzepowiednie.setText(TextLoader.getText().get(random.nextInt(TextLoader.getText().size())));
    }
}
