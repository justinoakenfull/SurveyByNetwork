package Container;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class tableModel extends AbstractTableModel
{

    ArrayList<Object[]> al;

    // the headers
    String[] header;

    // to hold the column index for the Sent column
    int col;

    // constructor
    public tableModel(ArrayList<Object[]> obj, String[] header)
    {
        // save the header
        this.header = header;
        // and the data
        al = obj;
    }

    // method that needs to be overload. The row count is the size of the ArrayList

    public int getRowCount()
    {
        return al.size();
    }

    // method that needs to be overload. The column count is the size of our header
    public int getColumnCount()
    {
        return header.length;
    }

    // method that needs to be overload. The object is in the arrayList at rowIndex
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        return al.get(rowIndex)[columnIndex];
    }

    // a method to return the column name
    public String getColumnName(int index)
    {
        return header[index];
    }

    public Class getColumnClass(int columnIndex)
    {
        return super.getColumnClass(columnIndex); // Otherwise, set it to the default class
    }

    // a method to add a new line to the table
    void add(String questionNumber, String questionTopic, String question)
    {
        // make it an array[3] as this is the way it is stored in the ArrayList
        // (not best design but we want simplicity)
        Object[] item = new Object[3];
        item[0] = questionNumber;
        item[1] = questionTopic;
        item[2] = question;
        al.add(item);
        // inform the GUI that I have change
        fireTableDataChanged();
    }
}
