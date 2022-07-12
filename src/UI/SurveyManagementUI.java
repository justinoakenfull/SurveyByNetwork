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

    /**
     * Define JTextfields
     */
    JTextField txtSearchQuestions;

    /**
     * Define JButtons
     */
    JButton btnSortQuestion, btnSortTopic, btnSortAnswer;

    /**
     * Define JTables
     */
    JTextField _PLACEHOLDER_;

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
    }

    private void SetupTable() {
        /**
         * Setup Table
         */
        _PLACEHOLDER_ = UIComponentBuilder.CreateTextField(67, 10, 100, surveyManagementLayout, this);
        _PLACEHOLDER_.setPreferredSize(new Dimension(607,400));
        _PLACEHOLDER_.setBackground(Color.ORANGE);

        /**
         * Setup Table sort buttons
         */
        lblSortBy = UIComponentBuilder.CreateLabel("Sort By: ", -607, 400, surveyManagementLayout, this, _PLACEHOLDER_, labelSize, navyBlue, false, Color.WHITE);
        lblSortBy.setPreferredSize(new Dimension(100, 30));

        btnSortQuestion = UIComponentBuilder.CreateButton("Question #", 100, 30, 100, 0,this,surveyManagementLayout,this, lblSortBy);
        btnSortTopic = UIComponentBuilder.CreateButton("Topic", 100, 30, 5, 0, this, surveyManagementLayout, this, btnSortQuestion);
        btnSortAnswer = UIComponentBuilder.CreateButton("Answer", 100, 30, 5, 0, this, surveyManagementLayout, this,  btnSortTopic);


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

        setVisible(true);
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
