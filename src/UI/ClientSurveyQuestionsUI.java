package UI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class ClientSurveyQuestionsUI
{
    SpringLayout centerLayoutManager = new SpringLayout();
    JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    JFrame mainFrame;
    JLabel lblTitle, lblQuestionsInstructions, lblTopic, lblQuestion, lblAnswerA,lblAnswerB,lblAnswerC,lblAnswerD,
            lblAnswerE, lblUserAnswer;
    JTextField txtTopic, txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4, txtAnswer5, txtUserAnswer;
    JTextArea txtaQuestion;
    JButton btnSubmit, btnExit;

    /**
     * Window wide style settings
     */
    Font titleFont = new Font("Dialog", Font.BOLD, 40);
    Font labelsFont = new Font("Dialog", Font.PLAIN, 20);
    Color navyBlue = Color.decode("#1f497d");
    int labelTextSize = 20;
    Dimension questionsLabelSize = new Dimension(100,40);
    Dimension questionsTextFieldSize = new Dimension(100,40);
    Border questionsBorder = new BorderUIResource.LineBorderUIResource(navyBlue,2);
    Border borderLine = BorderFactory.createLineBorder(Color.BLACK);
    Border textEntryBorder = BorderFactory.createCompoundBorder(borderLine,
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

    public ClientSurveyQuestionsUI()
    {
        initialiseUI();
    }

    private void initialiseUI()
    {
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setTitle("Survey Questions");
        mainFrame.setSize(800,600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        SetupJPanels();
        SetupTitleLabels();
        SetupQuestions();
        SetupAnswerAndFormButtons();


        mainFrame.setVisible(true);
    }

    private void SetupAnswerAndFormButtons()
    {
        lblUserAnswer = UIComponentBuilder.CreateLabel(" Your Answer: ", 20,15+(questionsLabelSize.height*9),
                centerLayoutManager, labelTextSize,navyBlue, false, questionsLabelSize, lblQuestionsInstructions);
        lblUserAnswer.setFont(labelsFont);
        lblUserAnswer.setPreferredSize(new Dimension(questionsLabelSize.width+50,questionsLabelSize.height));
        txtUserAnswer = UIComponentBuilder.CreateTextField(2, 0, 0,centerLayoutManager,
                lblUserAnswer);
        txtUserAnswer.setBorder(textEntryBorder);
        txtUserAnswer.setFont(labelsFont);
        txtUserAnswer.setPreferredSize(questionsTextFieldSize);
        btnSubmit = UIComponentBuilder.CreateButton("Submit", 150, txtUserAnswer.getPreferredSize().height,
                30+txtUserAnswer.getPreferredSize().width, 0,null, centerLayoutManager, txtUserAnswer);
        btnExit = UIComponentBuilder.CreateButton("Exit", 150, btnSubmit.getPreferredSize().height,
                30+btnSubmit.getPreferredSize().width,0,null,centerLayoutManager, btnSubmit);


        panelCenter.add(lblUserAnswer);
        panelCenter.add(txtUserAnswer);
        panelCenter.add(btnSubmit);
        panelCenter.add(btnExit);
    }

    private void SetupQuestions()
    {
        int labelPaddingY = 5;
        int labelPaddingX = 20;
        lblTopic = UIComponentBuilder.CreateLabel(" Topic: ", labelPaddingX, labelPaddingY, centerLayoutManager, labelTextSize, navyBlue,
                false, questionsLabelSize,lblQuestionsInstructions);
        lblQuestion = UIComponentBuilder.CreateLabel(" Question: ", 0, labelPaddingY, centerLayoutManager,
                labelTextSize,navyBlue, false, questionsLabelSize, lblTopic);

        JLabel[] questionsLabels = {lblTopic,lblQuestion, lblAnswerA,lblAnswerB,lblAnswerC,lblAnswerD,lblAnswerE};
        for (int i = 2; i < questionsLabels.length; i++)
        {
            if (i == 2)
            {
                questionsLabels[i] = UIComponentBuilder.CreateLabel(" " + (i-1) +": ", 0, labelPaddingY+40,
                        centerLayoutManager, labelTextSize, navyBlue,false, questionsLabelSize, lblQuestion);
            } else
            {
                questionsLabels[i] = UIComponentBuilder.CreateLabel(" " + (i-1) +": ", 0, labelPaddingY,
                        centerLayoutManager, labelTextSize, navyBlue,false, questionsLabelSize, questionsLabels[i-1]);
            }
            questionsLabels[i].setFont(labelsFont);
        }
        for (int i = 0; i < questionsLabels.length; i++)
        {
            panelCenter.add(questionsLabels[i]);
        }
        txtTopic = UIComponentBuilder.CreateTextField(35,labelPaddingX, 0, centerLayoutManager,
                lblTopic);
        txtTopic.setFont(labelsFont);
        txtTopic.setPreferredSize(questionsTextFieldSize);
        txtTopic.setBorder(textEntryBorder);
        txtaQuestion = UIComponentBuilder.CreateTextArea(2,35,centerLayoutManager,
                labelPaddingX+questionsLabelSize.width,labelPaddingY,lblQuestion);
        txtaQuestion.setFont(labelsFont);
        txtaQuestion.setBorder(textEntryBorder);
        JTextField[] questionsTextFields = {txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4, txtAnswer5};
        for (int i = 0; i < questionsTextFields.length; i++)
        {
            if (i == 0)
            {
                questionsTextFields[i] = UIComponentBuilder.CreateTextField(35,0-txtaQuestion.getPreferredSize().width,
                        labelPaddingY+txtaQuestion.getPreferredSize().height,centerLayoutManager,txtaQuestion);
            }
            else
            {
                questionsTextFields[i] = UIComponentBuilder.CreateTextField(35,0-questionsTextFields[i-1].getPreferredSize().width,
                        labelPaddingY+questionsTextFields[i-1].getPreferredSize().height,centerLayoutManager,questionsTextFields[i-1]);
            }
            questionsTextFields[i].setFont(labelsFont);
            questionsTextFields[i].setBorder(textEntryBorder);
            questionsTextFields[i].setPreferredSize(questionsTextFieldSize);
            panelCenter.add(questionsTextFields[i]);
        }
        panelCenter.add(txtTopic);
        panelCenter.add(txtaQuestion);
    }

    private void SetupTitleLabels()
    {
        lblTitle = new JLabel("Survey Questions");
        lblTitle.setFont(titleFont);
        lblTitle.setForeground(navyBlue);
        panelNorth.add(lblTitle);
        lblQuestionsInstructions = new JLabel(" Enter your answers and click submit");
        lblQuestionsInstructions.setFont(labelsFont);
        lblQuestionsInstructions.setForeground(navyBlue);
        panelCenter.add(lblQuestionsInstructions);
    }

    private void SetupJPanels()
    {
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelNorth = new JPanel();
        JPanel[] allPanels = {panelCenter,panelSouth,panelEast,panelWest,panelNorth};
        for (JPanel panel:
             allPanels)
        {
            if (panel == panelCenter)
            {
                panel.setLayout(centerLayoutManager);
            } else
            {
                panel.setLayout(new FlowLayout(FlowLayout.CENTER));
            }
        }
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelSouth,BorderLayout.SOUTH);
        mainFrame.add(panelEast, BorderLayout.EAST);
        mainFrame.add(panelWest, BorderLayout.WEST);

        panelNorth.setBackground(Color.white);
        panelSouth.setBackground(Color.white);
        panelEast.setBackground(Color.white);
        panelWest.setBackground(Color.white);
        panelCenter.setBackground(Color.lightGray);

        panelCenter.setBorder(questionsBorder);
    }

}
