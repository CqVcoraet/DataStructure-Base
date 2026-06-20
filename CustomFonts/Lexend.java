package CustomFonts;

// Imported Packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.*;


public class Lexend extends FontMaker {
    private int fontVariants;
    private int ultraThinSize;
    private int thinSize;
    private int regularSize;
    private int semiBoldSize;
    private int boldSize;   
    private int extraBoldSize;

    public Lexend() {
        this(6, 18, 20, 20, 25, 30, 45);
    }

    /**
     * Constructor for FontMaker class.
     * @param fontVariants -> Number of font variants.
     * @param ultraThinSize -> Size for ultra thin font. Default size is 18.
     * @param thinSize -> Size for thin font. Default size is 20.
     * @param regularSize -> Size for regular font. Default size is 20.
     * @param semiBoldSize -> Size for bold font. Default size is 25.
     * @param boldSize -> Size for semi bold font. Default size is 30.
     * @param extraBoldSize -> Size for extra bold font. Default size is 45.
     */
    public Lexend(int fontVariants, int ultraThinSize, int thinSize, int regularSize,
             int semiBoldSize, int boldSize, int extraBoldSize) {
        super(fontVariants, ultraThinSize, thinSize, regularSize, semiBoldSize, boldSize, extraBoldSize);
        this.fontVariants = fontVariants;
        this.ultraThinSize = ultraThinSize;
        this.thinSize = thinSize;
        this.regularSize = regularSize;
        this.semiBoldSize = semiBoldSize;
        this.boldSize = boldSize;
        this.extraBoldSize = extraBoldSize;
    }

    public int getFontVariants() {
        return fontVariants;
    }

    @Override
    public Font getUltraThinFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (fontSize == 0) {
            fontSize = ultraThinSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-Light.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter Thin Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getThinFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }

        if (fontSize == 0) {
            fontSize = thinSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-Thin.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Lexend Thin Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getRegularFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (fontSize == 0) {
            fontSize = regularSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-Regular.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Lexend Regular Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getSemiBoldFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (fontSize == 0) {
            fontSize = semiBoldSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-SemiBold.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Lexend SemiBold Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getBoldFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (fontSize == 0) {
            fontSize = boldSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-Bold.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Lexend Bold Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getExtraBoldFont(int fontSize) {
        if (fontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (fontSize == 0) {
            fontSize = extraBoldSize;
        }

        String fontPath;

        fontPath = "Custom Fonts/Lexend Font/static/Lexend-ExtraBold.ttf";

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Lexend ExtraBold Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }
    
}