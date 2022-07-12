package UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StyledButton extends JButton implements MouseListener
{
    Font defaultFont = new Font("SanSerif",Font.BOLD,14);
    Color textColor = Color.decode("#ffffff");
    Color backgroundColor = Color.decode("#3f62ff");
    Color hoverColor = Color.decode("#3f7bfd");


    public StyledButton(String text)
    {
        this.setText(text);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setForeground(textColor);
        this.setBackground(backgroundColor);
        this.setFont(defaultFont);
        this.setOpaque(true);
        addMouseListener(this);
    }

    public StyledButton(String s, Color inBackgroundColor, Color inHoverColor) {
        backgroundColor = inBackgroundColor;
        hoverColor = inHoverColor;
        this.setFocusPainted(false);
        this.setText(s);
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setHoverColor(hoverColor);
        this.setBackground(backgroundColor);
        this.setFont(defaultFont);
        this.setOpaque(true);
        addMouseListener(this);
    }

    public void setBackgroundColor(Color color) {
        backgroundColor = color;
    }
    public void setHoverColor(Color color) {
        hoverColor = color;
    }

    @Override
    public void mouseClicked(MouseEvent e){}
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e)
    {
        if (e.getSource()==this)
        {
            this.setBackground(this.hoverColor);
        }
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        if (e.getSource()==this)
        {
            this.setBackground(this.backgroundColor);
        }
    }
}

