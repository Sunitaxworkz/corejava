import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableSample {
  public static void main(String args[]) {
    JFrame f = new JFrame("JTable Sample");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container content = f.getContentPane();
    Object rows[][] = { { "AA", "1", "100,00" },
        { "AA", "1", "100,00" },
        { "BB", "1", "50,00" },
        { "CC", "2", "75,00" },
        { "AA", "1", "20,00" },
        { "AA", "0", "100,00" },
        { "BB", "2", "75,00" },
        { "CC", "2", "80,00" },
        { "AA", "0", "20,00" },
      
    Object columns[] = { "Name", "Group", "Price" };
    JTable table = new JTable(rows, columns);
    JScrollPane scrollPane = new JScrollPane(table);
    content.add(scrollPane, BorderLayout.CENTER);
    f.setSize(300, 200);
    f.setVisible(true);
  }
}