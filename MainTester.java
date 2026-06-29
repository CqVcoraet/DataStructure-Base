// Imported Packages
import CustomFonts.*;
import Linear.*;
import Associative.*;
import SpecialExtra.*;
import javax.swing.*;
import java.awt.*;
import java.io.Console;
public class MainTester extends AbstractTester {
    private static final int INIT_WIDTH = 800;
    private static final int INIT_HEIGHT = 800;

    private static enum SelectedFont {
        Inter, Lexend, LexendGiga, Arial, TimesNewRoman
    };

    private static SelectedFont FONT_TO_USE = SelectedFont.Inter;

    static FontMaker guiFont;

    public static void updateFont() {
        switch (FONT_TO_USE) {
            case Inter:
                guiFont = new Inter();
                break;
            
            case Lexend:
                guiFont = new Lexend();
                break;

            case Arial:
                guiFont = new Arial();
                break;

            case TimesNewRoman:
                guiFont = new TimesNewRoman();
                break;

            case LexendGiga:
                guiFont = new LexendGiga();
                break;

            default:
                guiFont = null;  
        }
    }
    public static void main(String[] args) {
        // JButton Color Workaround for Mac - FINALLY FIGURED IT OUT!
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error setting native L&F: " + e.getMessage());
        }

        displayGUI();
    }

    public static void setMenuFont(JMenuBar menuBar, Font font) {
        menuBar.setFont(font); // Set font for the menu bar itself
        for (MenuElement menuElement : menuBar.getSubElements()) {
            if (menuElement.getComponent() instanceof JMenu) {
                JMenu menu = (JMenu) menuElement.getComponent();
                menu.setFont(font); // Set font for JMenu
                setMenuItemFont(menu, font); // Recursively set font for all items in the menu
            }
        }
    }
    
    public static void setMenuItemFont(JMenu menu, Font font) {
        for (MenuElement menuElement : menu.getSubElements()) {
            if (menuElement.getComponent() instanceof JMenuItem) {
                JMenuItem menuItem = (JMenuItem) menuElement.getComponent();
                menuItem.setFont(font); // Set font for each JMenuItem
            }
        }
    }

    public static void setMenuBarItemFont(JMenuBar menuBar, Font font) {
        for (MenuElement menuElement : menuBar.getSubElements()) {
            if (menuElement.getComponent() instanceof JMenuItem) {
                JMenuItem menuItem = (JMenuItem) menuElement.getComponent();
                menuItem.setFont(font); // Set font for each JMenuItem directly in the menu bar
            }
        }
    }

    /**
     * Centers the given JComponent horizontally with the option of adding an offset
     * @param component - The component to be centered
     * @param parentWidth - Width of the component's parent container
     * @param y - y position of the component
     * @param width - Width of the component
     * @param height - Height of the component
     * @param offset - Offset how much the component is to the left or right
     */
    public static void centerBounds(JComponent component, int parentWidth, int y, int width, int height, int offset) {
        int calculatedX = ((parentWidth - width) / 2) + offset;
        component.setBounds(calculatedX, y, width, height);
    }


    public static void displayGUI() {
        JFrame frame = new JFrame("Main Data Structure Base Tester");
        frame.setSize(INIT_WIDTH, INIT_HEIGHT);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        guiFont = new Inter();

        CardLayout cardLayout = new CardLayout();
        JPanel mainContainer = new JPanel(cardLayout);

        // Welcome Panel Stuff
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(null);
        welcomePanel.setBackground(Color.decode("#111111"));

        JLabel welcomePanelTitle = new JLabel("Main Data Structure Base Tester");
        centerBounds(welcomePanelTitle, INIT_WIDTH, 50, 700, 200, 0);
        welcomePanelTitle.setFont(guiFont.getExtraBoldFont(45));
        welcomePanelTitle.setForeground(Color.WHITE);

        JButton startButton = new JButton("Open Testing Menu");
        centerBounds(startButton, INIT_WIDTH, 400, 400, 100, 0);
        startButton.setFont(guiFont.getBoldFont(35));
        startButton.setBackground(Color.decode("#03468F"));
        startButton.setForeground(Color.WHITE);
        startButton.setFocusable(false);

        

        welcomePanel.add(welcomePanelTitle);
        welcomePanel.add(startButton);

        // Menu Panel
        JPanel menuPanel = new JPanel(cardLayout);

        // All Panels
        mainContainer.add(welcomePanel, "Welcome Panel");
        mainContainer.add(menuPanel, "Menu Panel");
        cardLayout.show(mainContainer, "Welcome");

        startButton.addActionListener(e -> {
            cardLayout.show(mainContainer, "Menu Panel");
        });

        frame.setContentPane(mainContainer);
        frame.setVisible(true);
    }
}
