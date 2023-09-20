import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloGUI extends JFrame {
    public HelloGUI() {
        super("Hello World with GUI"); //Set title
        JFrame c = new JFrame("Hello, World!");
        c.add(new JLabel("Hello, World!"));
    }

    public static void main(String[] args) {
        HelloGUI window = new HelloGUI();
        window.setSize(300, 100);
        window.pack();
        window.setVisible(true);
    }
}
