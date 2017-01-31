package com.company;

import javax.swing.*;
import java.awt.*;

public class ButtonDecorator extends JButton implements IButton{
    private final IButton beforeButton;

    public ButtonDecorator(IButton button){
        this.beforeButton = button;
    }
    public Color setButtonColor(Color color){
        return beforeButton.setButtonColor(Color.red);
    }
    public int setButtonSizeX(){
        int x = 10*2;
        return beforeButton.setButtonSizeX();
    }
    public int setButtonSizeY(){
        int y = 30*2;
        return beforeButton.setButtonSizeY();
    }
}