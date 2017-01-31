package com.company;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton implements IButton{
    Color buttonColor;
    int buttonSizeX;
    int buttonSizeY;

    public Button(String newTitle, Color buttonColor, int buttonSizeX, int buttonSizeY){
        super(newTitle);
        this.buttonColor = Color.black;
        this.buttonSizeX = 80;
        this.buttonSizeY = 30;
    }

    public Color setButtonColor(Color color){
        return this.buttonColor;
    }

    public int setButtonSizeX(){
        return this.buttonSizeX;
    }
    public int setButtonSizeY(){
        return this.buttonSizeY;
    }
}