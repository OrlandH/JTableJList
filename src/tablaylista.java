import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class tablaylista {
    private JTable table1;
    private JList list1;
    private JPanel tablalista;


    public tablaylista() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("tablaylista");
        frame.setContentPane(new tablaylista().tablalista);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
