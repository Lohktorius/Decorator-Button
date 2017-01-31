package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Frame and Panel creation
        JFrame frame = new JFrame("Button Decorator");
        JPanel panel = new JPanel();

        // mainButton creation

        IButton mainButton = new Button("Button", Color.black, 80, 30);
        //IButton mainButton2 = new Button("bb");

        //mainButton2.setButtonColor(Color.red);

        mainButton.setButtonColor(Color.black);


        // modifier Button creation

        JButton buttonColor = new JButton("COLOR");
        JButton buttonXSize = new JButton("X SIZE");
        JButton buttonYSize = new JButton("Y SIZE");

        // Adding the previous buttons to the Panel
        panel.add(mainButton);
        //panel.add(mainButton2);

        panel.add(buttonColor);
        panel.add(buttonXSize);
        panel.add(buttonYSize);


        // Button Dimension
        Dimension dimension = new Dimension(mainButton.setButtonSizeX(), mainButton.setButtonSizeY());
        mainButton.setPreferredSize(dimension);

        // Panel and Frame Configuration
        panel.setSize(500, 100);
        frame.setSize(500, 100);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
