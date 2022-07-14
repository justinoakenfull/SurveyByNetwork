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
    JLabel lblTopicTitle, lblTopic, lblQuestion, lblQuestionNumber, lblAnswerA, lblAnswerB, lblAnswerC, lblAnswerD,
            lblAnswerE;

    /**
     * Define JTextfields
     */
    JTextField txtSearchQuestions, txtTopic, txtQuestion, txtQuestionNumber, txtAnswerA, txtAnswerB, txtAnswerC,
            txtAnswerD, txtAnswerE;
    /**
     * Define JTextAreas
     */
    JTextArea txtQuestionArea,txtLinkedListArea, txtBinaryTreeArea, txtMessageArea;

    /**
     * Define JButtons
     */
    JButton btnSortQuestion, btnSortTopic, btnSortAnswer, btnExit, btnConnect, btnSend, btnPreOrder, btnInOrder,
            btnPostOrder, btnDisplay, btnSave;

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
    int titleSize = 40;
    int labelSize = 20;
    int labelHeight = 55;
    int labelWidth = 120;
    int textFieldHeight = 55;
    int textFieldWidth = 200;
    int textFieldPadding = 5;
    int buttonStandardWidth = 100;
    int buttonLargeWidth = 300;
    int buttonStandardHeight = 30;
    Font textFieldFonts = new Font("Verdana", Font.PLAIN, labelSize);
    Dimension questionDetailsTextFieldSize = new Dimension(textFieldWidth,textFieldHeight);
    Dimension questionDetailsLabelSize = new Dimension(labelWidth,labelHeight);
    Border borderLine = BorderFactory.createLineBorder(Color.BLACK);
    Border textEntryBorder = BorderFactory.createCompoundBorder(borderLine,
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

    /**
     * Constructor
     */
    public SurveyManagementUI()
    {
        initialiseUI();


        setVisible(true);
    }

    private void initialiseUI()
    {
        SetupWindowAndBorder();
        SetupTitle();
        SetupSearchQuestion();
        SetupTable();
        SetupTopicDetails();
        SetupMiddleButtons();
        SetupLinkedListSection();
        SetupBinaryTreeSection();
        SetupFooterButtons();
    }
    //region Initialise UI Elements
    private void SetupFooterButtons()
    {
        /**
         * Preorder label and button setup
         */
        Dimension footerLabelSize = new Dimension(buttonStandardWidth,30);
        lblPreorder = UIComponentBuilder.CreateLabel("Pre-Order", 0,
                txtBinaryTreeArea.getPreferredSize().height+10, surveyManagementLayout, this, labelSize, Color.white,
                false, footerLabelSize, navyBlue, txtBinaryTreeArea);
        lblPreorder.setHorizontalAlignment(0);
        btnPreOrder = UIComponentBuilder.CreateButton("Display", buttonStandardWidth,buttonStandardHeight, 0,
                lblPreorder.getPreferredSize().height, this, surveyManagementLayout, this, lblPreorder);
        lblInOrder = UIComponentBuilder.CreateLabel("In-Order", buttonStandardWidth+10, 0, surveyManagementLayout,
                this, labelSize, Color.white, false, footerLabelSize, navyBlue, lblPreorder);
        lblInOrder.setHorizontalAlignment(0);
        btnInOrder = UIComponentBuilder.CreateButton("Display", buttonStandardWidth,buttonStandardHeight, 0,
                lblInOrder.getPreferredSize().height, this, surveyManagementLayout, this, lblInOrder);
        lblPostOrder = UIComponentBuilder.CreateLabel("In-Order", buttonStandardWidth+10, 0, surveyManagementLayout,
                this, labelSize, Color.white, false, footerLabelSize, navyBlue, lblInOrder);
        lblPostOrder.setHorizontalAlignment(0);
        btnPostOrder = UIComponentBuilder.CreateButton("Display", buttonStandardWidth,buttonStandardHeight, 0,
                lblPostOrder.getPreferredSize().height, this, surveyManagementLayout, this, lblPostOrder);
        btnDisplay = UIComponentBuilder.CreateButton("Display", buttonStandardWidth,buttonStandardHeight, buttonStandardWidth+10,
                0, this, surveyManagementLayout, this, lblPostOrder);
        btnSave = UIComponentBuilder.CreateButton("Save", buttonStandardWidth,buttonStandardHeight, 0,
                lblPostOrder.getPreferredSize().height, this, surveyManagementLayout, this, btnDisplay);
        txtMessageArea = UIComponentBuilder.CreateTextArea(1, 37, surveyManagementLayout, buttonStandardWidth+7,
                0+(buttonStandardHeight*2)/2-24,this, btnDisplay);
        txtMessageArea.setFont(textFieldFonts);
        txtMessageArea.setBorder(textEntryBorder);



    }

    private void SetupBinaryTreeSection()
    {
        lblBinaryTree = UIComponentBuilder.CreateLabel(" Binary Tree: ", 0-txtLinkedListArea.getPreferredSize().width,
                txtLinkedListArea.getPreferredSize().height+10,surveyManagementLayout, this, txtLinkedListArea,
                labelSize, Color.white, false, navyBlue);
//        lblBinaryTree.setPreferredSize(new Dimension(buttonStandardWidth, 30));
        txtBinaryTreeArea = UIComponentBuilder.CreateTextArea(2, 60, surveyManagementLayout, 0, 30,this,
                lblBinaryTree);
        txtBinaryTreeArea.setFont(textFieldFonts);
        txtBinaryTreeArea.setBorder(textEntryBorder);

    }

    private void SetupLinkedListSection()
    {
        lblLinkedList = UIComponentBuilder.CreateLabel(" Linked List: ", 0-buttonLargeWidth, 10+buttonStandardHeight,
                surveyManagementLayout
                ,this, btnExit, labelSize, Color.white, false, navyBlue);
        txtLinkedListArea = UIComponentBuilder.CreateTextArea(2, 60, surveyManagementLayout, 0, 30,this,
                lblLinkedList);
        txtLinkedListArea.setFont(textFieldFonts);
        txtLinkedListArea.setBorder(textEntryBorder);
    }

    private void SetupMiddleButtons()
    {
        btnExit = UIComponentBuilder.CreateButton("Exit",buttonLargeWidth, buttonStandardHeight, 10, 620, this,
                surveyManagementLayout, this);
        btnConnect = UIComponentBuilder.CreateButton("Connect", buttonLargeWidth, buttonStandardHeight, (windowSize.width/2)-(buttonLargeWidth/2),
                0,this, surveyManagementLayout, this, btnExit);
        btnSend = UIComponentBuilder.CreateButton("Send Questions", buttonLargeWidth, buttonStandardHeight,
                (windowSize.width/2)-(buttonLargeWidth/2)-40, 0, this, surveyManagementLayout, this, btnConnect);
    }

    private void SetupTopicDetails()
    {
        /**
         * Topic Label and Title
         */
        lblTopicTitle = UIComponentBuilder.CreateLabel("Question Details", 630, 60, surveyManagementLayout, this,
                30, Color.white,true, new Dimension(508, 60), navyBlue);
        lblTopicTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTopic = UIComponentBuilder.CreateLabel("Topic: ",630,120,surveyManagementLayout,this,labelSize,Color.WHITE,
                false, navyBlue);
        lblTopic.setPreferredSize(questionDetailsLabelSize);
        /**
         * Question and number labels
         */
        lblQuestion = UIComponentBuilder.CreateLabel("Question: ",-labelWidth, labelHeight,surveyManagementLayout,this,lblTopic,
                labelSize,Color.white,false,navyBlue);
        lblQuestion.setPreferredSize(new Dimension(questionDetailsLabelSize.width, 74));
        lblQuestionNumber = UIComponentBuilder.CreateLabel("Question #: ", -labelWidth, 74, surveyManagementLayout,
                this,
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
        txtTopic = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblTopic);
        txtTopic.setPreferredSize(questionDetailsTextFieldSize);
        txtTopic.setFont(textFieldFonts);
        /**
         * Question and Question number text fields
         */
        //txtQuestion = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,
        //    this, lblQuestion);
        //txtQuestion.setPreferredSize(questionDetailsTextFieldSize);
        //txtQuestion.setFont(textFieldFonts);
        txtQuestionArea = UIComponentBuilder.CreateTextArea(2,19,surveyManagementLayout,
                labelWidth+textFieldPadding, 0, this, lblQuestion);
        txtQuestionArea.setPreferredSize(questionDetailsTextFieldSize);
        txtQuestionArea.setMaximumSize(questionDetailsTextFieldSize);
        txtQuestionArea.setFont(textFieldFonts);
        txtQuestionArea.setLineWrap(true);
        txtQuestionArea.setBorder(textEntryBorder);
        txtQuestionArea.setText((Integer.toString(txtQuestionArea.getPreferredSize().height))+(labelHeight*7));

        txtQuestionNumber = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblQuestionNumber);
        txtQuestionNumber.setPreferredSize(questionDetailsTextFieldSize);
        txtQuestionNumber.setFont(textFieldFonts);
        /**
         * Answer Text Fields
         */
        txtAnswerA = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblAnswerA);
        txtAnswerA.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerA.setFont(textFieldFonts);
        txtAnswerB = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblAnswerB);
        txtAnswerB.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerB.setFont(textFieldFonts);
        txtAnswerC = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblAnswerC);
        txtAnswerC.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerC.setFont(textFieldFonts);
        txtAnswerD = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblAnswerD);
        txtAnswerD.setPreferredSize(questionDetailsTextFieldSize);
        txtAnswerD.setFont(textFieldFonts);
        txtAnswerE = UIComponentBuilder.CreateTextField(20,labelWidth+textFieldPadding, 0, surveyManagementLayout,this, lblAnswerE);
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
        _PLACEHOLDER_.setPreferredSize(new Dimension(575,479));
        _PLACEHOLDER_.setBackground(Color.orange);
        this.add(_PLACEHOLDER_);

        /**
         * Setup Table sort buttons
         */
        lblSortBy = UIComponentBuilder.CreateLabel(" Sort By: ", 10, 579,
                surveyManagementLayout, this, labelSize, Color.white, false, navyBlue);
        lblSortBy.setPreferredSize(new Dimension(100, 30));

        btnSortQuestion = UIComponentBuilder.CreateButton("Question #", buttonStandardWidth, buttonStandardHeight, 100, 0,this,surveyManagementLayout,this, lblSortBy);
        btnSortTopic = UIComponentBuilder.CreateButton("Topic", buttonStandardWidth, buttonStandardHeight, 105, 0, this, surveyManagementLayout, this,
                btnSortQuestion);
        btnSortAnswer = UIComponentBuilder.CreateButton("Answer", buttonStandardWidth, buttonStandardHeight, 105, 0, this, surveyManagementLayout, this,
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
        lblTitle = UIComponentBuilder.CreateLabel("Survey By Network", 0,0, surveyManagementLayout, this, titleSize,
                Color.WHITE, true, new Dimension(windowSize.width, 50), navyBlue);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    }
    //endregion

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
