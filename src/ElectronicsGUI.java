import javax.swing.*;
import java.awt.*;

public class ElectronicsGUI extends JFrame {


    Image image;

    public ElectronicsGUI()
    {
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Computers");
        JMenu menu1 = new JMenu("Consoles");
        JMenu menu2 = new JMenu("Displays");
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);

        JMenuItem search = new JMenuItem("Search");
        JMenuItem compare = new JMenuItem("Compare");
        JMenuItem search1 = new JMenuItem("Search");
        JMenuItem compare1 = new JMenuItem("Compare");
        JMenuItem search2 = new JMenuItem("Search");
        JMenuItem compare2 = new JMenuItem("Compare");
        menu.add(search);
        menu.add(compare);
        menu1.add(search1);
        menu1.add(compare1);
        menu2.add(search2);
        menu2.add(compare2);

        JLabel imageLabel = new JLabel("test", JLabel.CENTER);

        imageLabel.setIcon(new ImageIcon(getClass().getResource("electronicStore.png")));
        //Image newImage = imageLabel.getScaledInstance(20,20, Image.SCALE_DEFAULT);
        Icon image = new ImageIcon("electronicStore.png", "test");
        add(imageLabel);

        JLabel label = new JLabel("Electronics Store");
        add(label);

        JButton button = new JButton("Computers");
        JButton button1 = new JButton("Consoles");
        JButton button2 = new JButton("Displays");
        add(button);
        add(button1);
        add(button2);
        button.setPreferredSize(new Dimension(100, 40));
        button1.setPreferredSize(new Dimension(100, 40));
        button2.setPreferredSize(new Dimension(100, 40));


        setVisible(true);
    }

    public static void main(String[] args) {
        ElectronicsGUI gui = new ElectronicsGUI();

    }
}
