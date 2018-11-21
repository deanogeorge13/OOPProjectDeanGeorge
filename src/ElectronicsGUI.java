import javax.swing.*;
import java.awt.*;

public class ElectronicsGUI extends JFrame {

    //private ImageIcon imageIcon;

    public ElectronicsGUI()
    {
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Panels and setting layout
        GridLayout gridLayout = new GridLayout(3,3,50,0);
        setLayout(gridLayout);

        JPanel jPanel = new JPanel();
        add(jPanel);
        JPanel jPanel1 = new JPanel();
        add(jPanel1);
        JPanel jPanel2 = new JPanel();
        add(jPanel2);

        //Menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Computers");
        JMenu menu1 = new JMenu("Consoles");
        JMenu menu2 = new JMenu("Displays");
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);

        //Menu bar items
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

        JLabel label = new JLabel("Electronics Store");
        jPanel.add(label);

        //Electronic store logo/image
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("electronicStore.png"));
        Image img = imageIcon.getImage();
        Image newimg = img.getScaledInstance(125,125, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        JLabel imageLabel = new JLabel(imageIcon);
        jPanel1.add(imageLabel);



        //Shortcut buttons
        JButton button = new JButton("Computers");
        JButton button1 = new JButton("Consoles");
        JButton button2 = new JButton("Displays");
        jPanel2.add(button);
        jPanel2.add(button1);
        jPanel2.add(button2);
        button.setPreferredSize(new Dimension(100, 40));
        button1.setPreferredSize(new Dimension(100, 40));
        button2.setPreferredSize(new Dimension(100, 40));


        setVisible(true);
    }



}
