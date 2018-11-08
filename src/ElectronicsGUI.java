import javax.swing.*;

public class ElectronicsGUI extends JFrame {
    public ElectronicsGUI()
    {
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Shop");
        JMenu menu1 = new JMenu()
        menuBar.add(menu);

        JMenuItem shop = new JMenuItem("Shop");
        menu.add(shop);

        JLabel label = new JLabel("Electronics Store");
        add(label);
        //JButton button = new JButton("Store");


        setVisible(true);
    }

    public static void main(String[] args) {
        ElectronicsGUI gui = new ElectronicsGUI();

    }
}
