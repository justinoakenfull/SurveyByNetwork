package UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class UIComponentBuilder {
    /**
     * This method creates a text label and adds it to the layout defined, attaches to the frame.
     *
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring layout that will be used for it's positioning.
     * @param inputFrame The frame the label will be added to, also used for its positioning.
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewLabel);
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to the frame with styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     * @param inputSize The size of the label itself (Not the text size).
     * @param inputBackgroundColour The color of the labels background (Background).
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, int inputTextSize, Color inputTextColour, boolean isTheFontBold,
                                     Dimension inputSize, Color inputBackgroundColour)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        outputNewLabel.setPreferredSize(new Dimension(inputSize));
        outputNewLabel.setBackground(inputBackgroundColour);
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to a specified component with
     * styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     * @param inputSize The size of the label itself (Not the text size).
     * @param inputBackgroundColour The color of the labels background (Background).
     * @param attachToComponent The component to attach this label to.
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, int inputTextSize, Color inputTextColour, boolean isTheFontBold,
                                     Dimension inputSize, Color inputBackgroundColour, Component attachToComponent)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        outputNewLabel.setPreferredSize(new Dimension(inputSize));
        outputNewLabel.setBackground(inputBackgroundColour);
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to the frame with styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     * @param inputSize The size of the label itself (Not the text size).
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, int inputTextSize, Color inputTextColour, boolean isTheFontBold,
                                     Dimension inputSize)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        outputNewLabel.setPreferredSize(new Dimension(inputSize));
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to the frame with styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, int inputTextSize, Color inputTextColour, boolean isTheFontBold)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to the frame with styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, int inputTextSize, Color inputTextColour, boolean isTheFontBold, Color inputBackgroundColour)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        outputNewLabel.setBackground(inputBackgroundColour);
        return outputNewLabel;
    }

    /***
     * This method creates a text label and adds it to the layout defined, attaches to the frame with styling specified.
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring Layout that will be used for positioning.
     * @param inputFrame The frame the label will be added to.
     * @param inputTextSize The size of the text to be used.
     * @param inputTextColour The color of the text (Foreground).
     * @param isTheFontBold Whether the text should be bold or not.
     *
     * @return The created label is returned.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, Component attachToComponent, int inputTextSize,
                                     Color inputTextColour,
                                     boolean isTheFontBold, Color inputBackgroundColour)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.EAST,
                attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputNewLabel);
        if (isTheFontBold)
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            outputNewLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        outputNewLabel.setForeground(inputTextColour);
        outputNewLabel.setOpaque(true);
        outputNewLabel.setBackground(inputBackgroundColour);
        return outputNewLabel;
    }

    /**
     * This method creates a label and adds it to the defined frame but uses a component position off.
     *
     * @param inputText The text to be displayed on the label.
     * @param inputXPosition The horizontal position of the label starting from the left.
     * @param inputYPosition The vertical position of the label starting from the top.
     * @param inputLayout The Spring layout that will be used for it's positioning.
     * @param inputFrame The frame the label will be added to.
     * @param attachToComponent The component the label will be attached to and positioned off.
     *
     * @return Returns the completed label.
     */
    public static JLabel CreateLabel(String inputText, int inputXPosition, int inputYPosition, SpringLayout inputLayout,
                                     JFrame inputFrame, Component attachToComponent)
    {
        JLabel outputNewLabel = new JLabel(inputText);
        inputLayout.putConstraint(SpringLayout.WEST, outputNewLabel, inputXPosition, SpringLayout.WEST,
                attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewLabel, inputYPosition, SpringLayout.NORTH,
                attachToComponent);
        inputFrame.add(outputNewLabel);
        return outputNewLabel;
    }

    /**
     * This method creates a Text field and adds it to the given frame, the positioning of the text field is based
     * off the frame itself.
     *
     * @param columnSize The size of the text field measured in characters (2 = ww, 3 = www, 4 = wwww etc.).
     * @param inputXPosition The horizontal position of the label based off the frame starting from the left.
     * @param inputYPosition The vertical position of the label based off the frame starting from the top.
     * @param inputLayout The Spring layout that will be used for positioning.
     * @param inputFrame The frame the text field will be added to and positioned off.
     *
     * @return Returns the completed text field.
     */
    public static JTextField CreateTextField(int columnSize, int inputXPosition, int inputYPosition,
                                             SpringLayout inputLayout, JFrame inputFrame)
    {
        JTextField outputTextField = new JTextField(columnSize);
        inputLayout.putConstraint(SpringLayout.WEST, outputTextField, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputTextField, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputTextField);
        return outputTextField;
    }

    /**
     * This method creates a Text field and adds it to the given frame, the positioning of the text field is based
     * off the frame itself.
     *
     * @param columnSize The size of the text field measured in characters (2 = ww, 3 = www, 4 = wwww etc.).
     * @param inputXPosition The horizontal position of the label based off the frame starting from the left.
     * @param inputYPosition The vertical position of the label based off the frame starting from the top.
     * @param inputLayout The Spring layout that will be used for positioning.
     * @param inputFrame The frame the text field will be added to.
     * @param attachToComponent The component this text field will the attached to and position based off.
     *
     * @return Returns the completed text field.
     */
    public static JTextField CreateTextField(int columnSize, int inputXPosition, int inputYPosition,
                                             SpringLayout inputLayout, JFrame inputFrame, Component attachToComponent)
    {
        JTextField outputTextField = new JTextField(columnSize);
        inputLayout.putConstraint(SpringLayout.WEST, outputTextField, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputTextField, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputTextField);
        return outputTextField;
    }

    /**
     * This method creates a Text field and adds it to the given frame, the positioning of the text field is based
     * off the frame itself.
     *
     * @param columnSize The size of the text field measured in characters (2 = ww, 3 = www, 4 = wwww etc.).
     * @param inputXPosition The horizontal position of the label based off the frame starting from the left.
     * @param inputYPosition The vertical position of the label based off the frame starting from the top.
     * @param inputLayout The Spring layout that will be used for positioning.
     * @param inputFrame The frame the text field will be added to.
     * @param attachToComponent The component this text field will the attached to and position based off.
     *
     * @return Returns the completed text field.
     */
    public static JTextField CreateTextFieldWestEast(int columnSize, int inputXPosition, int inputYPosition,
                                                     SpringLayout inputLayout, JFrame inputFrame, Component attachToComponent)
    {
        JTextField outputTextField = new JTextField(columnSize);
        inputLayout.putConstraint(SpringLayout.WEST, outputTextField, inputXPosition, SpringLayout.EAST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputTextField, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputTextField);
        return outputTextField;
    }

    /**
     * This method creates a button and adds it to the given frame, assigns the action listener and positions itself
     * off the layout and frame.
     *
     * @param inputText The text to be displayed on the button.
     * @param buttonWidth The width of the button. (80 is a good default)
     * @param buttonHeight The height of the button. (25 is a good default)
     * @param inputXPosition The horizontal positioning of the button.
     * @param inputYPosition The vertical positioning of the button.
     * @param applicationListener The action listener to be assigned to the button.
     * @param inputLayout The Spring layout the button will be positioned with.
     * @param inputFrame The frame the button will be added to and positioned off.
     *
     * @return Returns the completed button.
     */
    public static JButton CreateButton(String inputText, int buttonWidth, int buttonHeight, int inputXPosition,
                                       int inputYPosition, ActionListener applicationListener,
                                       SpringLayout inputLayout, JFrame inputFrame)
    {
        JButton outputNewButton = new StyledButton(inputText);
        outputNewButton.addActionListener(applicationListener);
        outputNewButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        inputLayout.putConstraint(SpringLayout.WEST, outputNewButton, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewButton, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputNewButton);
        return outputNewButton;
    }

    /**
     * This method creates a button and adds it to the given frame, assigns the action listener and positions itself
     * off the given component.
     *
     * @param inputText The text to be displayed on the button.
     * @param buttonWidth The width of the button. (80 is a good default)
     * @param buttonHeight The height of the button. (25 is a good default)
     * @param inputXPosition The horizontal positioning of the button.
     * @param inputYPosition The vertical positioning of the button.
     * @param applicationListener The action listener to be assigned to the button.
     * @param inputLayout The Spring layout the button will be positioned with.
     * @param inputFrame The frame the button will be added to.
     * @param attachToComponent The component the button will be position off and attached to.
     *
     * @return Returns the completed button.
     */
    public static JButton CreateButton(String inputText, int buttonWidth, int buttonHeight, int inputXPosition,
                                       int inputYPosition, ActionListener applicationListener,
                                       SpringLayout inputLayout, JFrame inputFrame, Component attachToComponent)
    {
        JButton outputNewButton = new StyledButton(inputText);
        outputNewButton.addActionListener(applicationListener);
        outputNewButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        inputLayout.putConstraint(SpringLayout.WEST, outputNewButton, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewButton, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputNewButton);
        return outputNewButton;
    }

    /**
     * This method creates a button and adds it to the given frame, assigns the action listener and positions itself
     * off the given component.
     *
     * @param inputText The text to be displayed on the button.
     * @param buttonWidth The width of the button. (80 is a good default)
     * @param buttonHeight The height of the button. (25 is a good default)
     * @param inputXPosition The horizontal positioning of the button.
     * @param inputYPosition The vertical positioning of the button.
     * @param applicationListener The action listener to be assigned to the button.
     * @param inputLayout The Spring layout the button will be positioned with.
     * @param inputFrame The frame the button will be added to.
     * @param attachToComponent The component the button will be position off and attached to.
     *
     * @return Returns the completed button.
     */
    public static JButton CreateButton(String inputText, int buttonWidth, int buttonHeight, int inputXPosition,
                                       int inputYPosition, ActionListener applicationListener,
                                       SpringLayout inputLayout, JFrame inputFrame, Component attachToComponent,
                                       Color backgroundColour, Color hoverColour)
    {
        JButton outputNewButton = new StyledButton(inputText, backgroundColour, hoverColour);
        outputNewButton.addActionListener(applicationListener);
        outputNewButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        inputLayout.putConstraint(SpringLayout.WEST, outputNewButton, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputNewButton, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputNewButton);
        return outputNewButton;
    }

    /**
     * This method creates and add a text area to the frame and positions it off the frame.
     *
     * @param inputHeight How many rows will the text area be?
     * @param inputWidth How many columns will the text area have?
     * @param inputLayout The layout the text area will be position off.
     * @param inputXPosition The horizontal offset of the text area.
     * @param inputYPosition The vertical offset of the text area.
     * @param inputFrame The frame the text area will be added to and positioned off.
     *
     * @return Returns the created text area.
     */
    public static JTextArea CreateTextArea(int inputHeight, int inputWidth, SpringLayout inputLayout,
                                           int inputXPosition, int inputYPosition, JFrame inputFrame)
    {
        JTextArea outputTextArea = new JTextArea(inputHeight, inputWidth);
        inputLayout.putConstraint(SpringLayout.WEST, outputTextArea, inputXPosition, SpringLayout.WEST, inputFrame);
        inputLayout.putConstraint(SpringLayout.NORTH, outputTextArea, inputYPosition, SpringLayout.NORTH, inputFrame);
        inputFrame.add(outputTextArea);
        return outputTextArea;
    }

    /**
     * This method creates and add a text area to the frame and positions it off the frame.
     *
     * @param inputHeight How many rows will the text area be?
     * @param inputWidth How many columns will the text area have?
     * @param inputLayout The layout the text area will be position off.
     * @param inputXPosition The horizontal offset of the text area.
     * @param inputYPosition The vertical offset of the text area.
     * @param inputFrame The frame the text area will be added to and positioned off.
     *
     * @return Returns the created text area.
     */
    public static JTextArea CreateTextArea(int inputHeight, int inputWidth, SpringLayout inputLayout,
                                           int inputXPosition, int inputYPosition, JFrame inputFrame, Component attachToComponent)
    {
        JTextArea outputTextArea = new JTextArea(inputHeight, inputWidth);
        inputLayout.putConstraint(SpringLayout.WEST, outputTextArea, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputTextArea, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputTextArea);
        return outputTextArea;
    }

    public static JCheckBox CreateACheckbox(String inputText, boolean isChecked,SpringLayout inputLayout,
                                            int inputXPosition, int inputYPosition,
                                            JFrame inputFrame, Component attachToComponent)
    {
        JCheckBox outputCheckbox = new JCheckBox(inputText, isChecked);
        inputLayout.putConstraint(SpringLayout.WEST, outputCheckbox, inputXPosition, SpringLayout.WEST, attachToComponent);
        inputLayout.putConstraint(SpringLayout.NORTH, outputCheckbox, inputYPosition, SpringLayout.NORTH, attachToComponent);
        inputFrame.add(outputCheckbox);
        return outputCheckbox;
    }


    /**
     * This will style the label with the given arguments.
     *
     * @param inputLabel This is the label to be styled.
     * @param inputTextSize This is the desired font size of the text.
     * @param inputTextColour This is the colour of the text itself, not the background.
     */
    public static void StyleLabel(JLabel inputLabel, int inputTextSize, Color inputTextColour)
    {
        inputLabel.setFont(new Font("Serif", Font.PLAIN, inputTextSize));
        inputLabel.setForeground(inputTextColour);
    }

    /**
     * This will style the label with the given arguments.
     *
     * @param inputLabel This is the label to be styled.
     * @param inputTextSize This is the desired font size of the text.
     * @param inputTextColour This is the colour of the text itself, not the background.
     * @param inputFont This is the font to be used.
     */
    public static void StyleLabel(JLabel inputLabel, int inputTextSize, Color inputTextColour, String inputFont)
    {
        inputLabel.setFont(new Font(inputFont, Font.PLAIN, inputTextSize));
        inputLabel.setForeground(inputTextColour);
    }

    /**
     * This will style the label with the given arguments.
     *
     * @param inputLabel This is the label to be styled.
     * @param inputTextSize This is the desired font size of the text.
     * @param inputTextColour This is the colour of the text itself, not the background.
     * @param inputFont This is the font to be used.
     * @param isTheFontBold This is whether the font is to be bold or not. (true for bold, false for plain)
     */
    public static void StyleLabel(JLabel inputLabel, int inputTextSize, Color inputTextColour, String inputFont, boolean isTheFontBold)
    {
        if (isTheFontBold)
        {
            inputLabel.setFont(new Font(inputFont, Font.BOLD, inputTextSize));
        }
        else
        {
            inputLabel.setFont(new Font(inputFont, Font.PLAIN, inputTextSize));
        }
        inputLabel.setForeground(inputTextColour);
    }

    /**
     * This will style the label with the given arguments.
     *
     * @param inputLabel This is the label to be styled.
     * @param inputTextSize This is the desired font size of the text.
     * @param inputTextColour This is the colour of the text itself, not the background.
     * @param isTheFontBold This is whether the font is to be bold or not. (true for bold, false for plain)
     */
    public static void StyleLabel(JLabel inputLabel, int inputTextSize, Color inputTextColour, boolean isTheFontBold)
    {
        if (isTheFontBold)
        {
            inputLabel.setFont(new Font("SanSerif", Font.BOLD, inputTextSize));
        }
        else
        {
            inputLabel.setFont(new Font("SanSerif", Font.PLAIN, inputTextSize));
        }
        inputLabel.setForeground(inputTextColour);
    }

    public static void SetLabelSizeAndBackgroundColour(JLabel inputLabel, Dimension inputSize, Color inputBackgroundColour)
    {
        inputLabel.setOpaque(true);
        inputLabel.setPreferredSize(new Dimension(inputSize));
        inputLabel.setBackground(inputBackgroundColour);
    }

    public static void SetupWindow(Component mainForm, JFrame mainFormFrame, SpringLayout mainFormSpringLayout)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        int windowSizeHeight = 650;
        int windowSizeWidth = 1350;
        mainForm.setSize(windowSizeWidth,windowSizeHeight);
        mainForm.setLocation(((screenWidth/2) - (windowSizeWidth/2)), ((screenHeight/2) - (windowSizeHeight/2)));
        mainFormFrame.setLayout(mainFormSpringLayout);

    }

    public static void StyleTextField(JTextField textField, int inputTextSize, boolean inputIsTextBold,
                                      Color inputBackGroundColour, Border inputBorder)
    {
        Font font = textField.getFont();
        font = inputIsTextBold ? font.deriveFont(Font.BOLD) : font.deriveFont(Font.PLAIN);
        textField.setFont(font.deriveFont(((float)inputTextSize)));
        textField.setBackground(inputBackGroundColour);
        textField.setBorder(inputBorder);
    }
}
