import javax.swing.*;

public class ElectronicsGUI extends JFrame {
    public ElectronicsGUI()
    {
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Store");
        JMenu menu1 = new JMenu("Admin");
        JMenu menu2 = new JMenu("test");
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);

        JMenuItem computers = new JMenuItem("Computers");
        JMenuItem consoles = new JMenuItem("Consoles");
        JMenuItem displays = new JMenuItem("Displays");
        menu.add(computers);
        menu.add(consoles);
        menu.add(displays);

        //JLabel label = new JLabel("Electronics Store");
        //add(label);
        //JButton button = new JButton("Store");


        setVisible(true);
    }

    public static void main(String[] args) {
        ElectronicsGUI gui = new ElectronicsGUI();

    }
}
