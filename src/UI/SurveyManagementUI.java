package UI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.color.ICC_Profile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyManagementUI extends JFrame implements ActionListener
{
    /**
     * Main Swing Layout
     */
    SpringLayout surveyManagementLayout = new SpringLayout();
    /**
     * JLabel declarations
     */
    JLabel lblTitle, lblSearchQuestion, lblSortBy, lblLinkedList, lblBinaryTree, lblPreorder, lblInOrder, lblPostOrder;
    JLabel lblTopic, lblQuestion, lblQuestionNumber, lblAnswerA, lblAnswerB, lblAnswerC, lblAnswerD, lblAnswerE;

    /**
     * Define JTextfields
     */
    JTextField txtSearchQuestions, txtTopic, txtQuestion, txtQuestionNumber, txtAnswerA, txtAnswerB, txtAnswerC,
            txtAnswerD, txtAnswerE;

    /**
     * Define JButtons
     */
    JButton btnSortQuestion, btnSortTopic, btnSortAnswer;

    /**
     * Define JTables
     */
    JTable _PLACEHOLDER_;

    /**
     * Define the Window Size
     */
    Dimension windowSize = new Dimension(1200, 1000);
    /**
     * Window-wide UI Defaults
     */
    Color navyBlue = Color.decode("#1f497d");
    int titleSize;
    int labelSize = 20;

    /**
     * Constructor
     */
    public SurveyManagementUI()
    {
        SetupWindowAndBorder();
        SetupTitle();
        SetupSearchQuestion();
        SetupTable();
        SetupTopicDetails();

        setVisible(true);
    }

    private void SetupTopicDetails()
    {
        /**
         * Standardising the dimensions of all the labels and text fields.
         */
        int labelHeight = 55;
        int labelWidth = 120;
        int textFieldHeight = 55;
        int textFieldWidth = 200;
        Font textFieldFonts = new Font("Verdana", Font.PLAIN, labelSize);
        Dimension questionDetailsTextFieldSize = new Dimension(textFieldWidth,textFieldHeight);
        Dimension questionDetailsLabelSize = new Dimension(labelWidth,labelHeight);
        /**
         * Topic Label
         */
        lblTopic = UIComponentBuilder.CreateLabel("Topic: ",630,60,surveyManagementLayout,this,labelSize,Color.WHITE,
                false, navyBlue);
        lblTopic.setPreferredSize(questionDetailsLabelSize);
        /**
         * Question and number labels
         */
        lblQuestion = UIComponentBuilder.CreateLabel("Question: ",-labelWidth, labelHeight,surveyManagementLayout,this,lblTopic,
                labelSize,Color.white,false,navyBlue);
        lblQuestion.setPreferredSize(questionDetailsLabelSize);
        lblQuestionNumber = UIComponentBuilder.CreateLabel("Question #: ", -labelWidth, labelHeight, surveyManagementLayout, this,
                lblQuestion, labelSize, Color.white,false, navyBlue);
        lblQuestionNumber.setPreferredSize(questionDetailsLabelSize);
        /**
         * Answer labels A-E
         */
        lblAnswerA = UIComponentBuilder.CreateLabel("A: ", -labelWidth, labelHeight, surveyManagementLayout, this, lblQuestionNumber,
                labelSize,Color.white,false,navyBlue);
        lblAnswerA.setPreferredSize(questionDetailsLabelSize);
        lblAnswerB = UIComponentBuilder.CreateLabel("B: ", -labelWidth, labelHeight, surveyManagementLayout, this, lblAnswerA,
                labelSize,Color.white,false,navyBlue);
        lblAnswerB.setPreferredSize(questionDetailsLabelSize);
        lblAnswerC = UIComponentBuilder.CreateLabel("C: ", -labelWidth, labelHeight, surveyManagementLayout, this, lblAnswerB,
                labelSize,Color.white,false,navyBlue);
        lblAnswerC.setPreferredSize(questionDetailsLabelSize);
        lblAnswerD = UIComponentBuilder.CreateLabel("D: ", -labelWidth, labelHeight, surveyManagementLayout, this, lblAnswerC,
                labelSize,Color.white,false,navyBlue);
        lblAnswerD.setPreferredSize(questionDetailsLabelSize);
        lblAnswerE = UIComponentBuilder.CreateLabel("E: ", -labelWidth, labelHeight, surveyManagementLayout, this, lblAnswerD,
                labelSize,Color.white,false,navyBlue);
        lblAnswerE.setPreferredSize(questionDetailsLabelSize);
        /**
         * Topic TextFields
         */
        txtTopic = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblTopic);
        txtTopic.setPreferredSize(questionDetailsTextFieldSize);
        txtTopic.setFont(textFieldFonts);
        /**
         * Question and Question number text fields
         */
        txtQuestion = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblQuestion);
        txtQuestion.setPreferredSize(questionDetailsTextFieldSize);
        txtQuestion.setFont(textFieldFonts);
        txtQuestionNumber = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblQuestionNumber);
        txtQuestionNumber.setPreferredSize(questionDetailsTextFieldSize);
        txtQuestionNumber.setFont(textFieldFonts);
        /**
         * Answer Text Fields
         */
        txtAnswerA = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblAnswerA);
        txtAnswerA.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerA.setFont(textFieldFonts);
        txtAnswerB = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblAnswerB);
        txtAnswerB.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerB.setFont(textFieldFonts);
        txtAnswerC = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblAnswerC);
        txtAnswerC.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerC.setFont(textFieldFonts);
        txtAnswerD = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblAnswerD);
        txtAnswerD.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerD.setFont(textFieldFonts);
        txtAnswerE = UIComponentBuilder.CreateTextField(20,labelWidth, 0, surveyManagementLayout,this, lblAnswerE);
        txtAnswerE.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerE.setFont(textFieldFonts);
    }

    private void SetupTable() {
        /**
         * Setup Table
         */
        _PLACEHOLDER_ = new JTable();
        surveyManagementLayout.putConstraint(SpringLayout.WEST, _PLACEHOLDER_, 10, SpringLayout.WEST,this);
        surveyManagementLayout.putConstraint(SpringLayout.NORTH, _PLACEHOLDER_, 100, SpringLayout.NORTH,this);
        _PLACEHOLDER_.setPreferredSize(new Dimension(575,500));
        _PLACEHOLDER_.setBackground(Color.orange);
        this.add(_PLACEHOLDER_);

        /**
         * Setup Table sort buttons
         */
        lblSortBy = UIComponentBuilder.CreateLabel("Sort By: ", 10, 600,
                surveyManagementLayout, this, labelSize, navyBlue, false, Color.WHITE);
        lblSortBy.setPreferredSize(new Dimension(100, 30));

        btnSortQuestion = UIComponentBuilder.CreateButton("Question #", 100, 30, 100, 0,this,surveyManagementLayout,this, lblSortBy);
        btnSortTopic = UIComponentBuilder.CreateButton("Topic", 100, 30, 105, 0, this, surveyManagementLayout, this,
                btnSortQuestion);
        btnSortAnswer = UIComponentBuilder.CreateButton("Answer", 100, 30, 105, 0, this, surveyManagementLayout, this,
                btnSortTopic);


    }

    private void SetupSearchQuestion() {
        lblSearchQuestion = UIComponentBuilder.CreateLabel("Search Questions: ", 10, 60, surveyManagementLayout, this, labelSize, Color.WHITE, false, navyBlue);
        txtSearchQuestions = UIComponentBuilder.CreateTextField(25, 175, 0, surveyManagementLayout, this, lblSearchQuestion);
        txtSearchQuestions.setPreferredSize(new Dimension(txtSearchQuestions.getWidth(), 28));
        txtSearchQuestions.setFont(new Font(txtSearchQuestions.getFont().getFontName(),txtSearchQuestions.getFont().getStyle(), labelSize));
    }

    /**
     * Setup the window, the window size and position as well as add a border around the window.
     */
    private void SetupWindowAndBorder() {
        /**
         * Define the size of the window and set the size for the management window.
         */
        setSize(windowSize);

        /**
         * Set the window to display in the centre of the screen
         */
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ;
        int screenWidth = (int)screenSize.getWidth();
        int screenHeight = (int)screenSize.getHeight();
        setLocation((screenWidth/2)-(windowSize.width/2),(screenHeight/2)-(windowSize.height/2));
        setLayout(surveyManagementLayout);


    }

    /**
     * Setup the Title labels.
     */
    private void SetupTitle()
    {
        lblTitle = UIComponentBuilder.CreateLabel("Survey By Network", 0,0, surveyManagementLayout, this, 40, Color.WHITE, true, new Dimension(windowSize.width, 50), navyBlue);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
