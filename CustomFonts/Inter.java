package CustomFonts;

// Imported Packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.*;


public class Inter extends FontMaker {
    private int fontVariants;
    private int ultraThinSize;
    private int thinSize;
    private int regularSize;
    private int semiBoldSize;
    private int boldSize;   
    private int extraBoldSize;

    public Inter() {
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
    public Inter(int fontVariants, int ultraThinSize, int thinSize, int regularSize,
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

        if (fontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-Light.ttf";
        } else if (fontSize > 23 && fontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-Light.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-Light.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter Thin Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, fontSize);
        }
    }

    @Override
    public Font getThinFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (FontSize == 0) {
            FontSize = thinSize;
        }

        String fontPath;

        if (FontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-Thin.ttf";
        } else if (FontSize > 23 && FontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-Thin.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-Thin.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, FontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter Thin Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, FontSize);
        }
    }

    @Override
    public Font getRegularFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (FontSize == 0) {
            FontSize = regularSize;
        }

        String fontPath;

        if (FontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-Regular.ttf";
        } else if (FontSize > 23 && FontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-Regular.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-Regular.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, FontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter Regular Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, FontSize);
        }
    }

    @Override
    public Font getSemiBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (FontSize == 0) {
            FontSize = semiBoldSize;
        }

        String fontPath;

        if (FontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-SemiBold.ttf";
        } else if (FontSize > 23 && FontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-SemiBold.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-SemiBold.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, FontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter SemiBold Font: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, FontSize);
        }
    }

    @Override
    public Font getBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (FontSize == 0) {
            FontSize = boldSize;
        }

        String fontPath;

        if (FontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-Bold.ttf";
        } else if (FontSize > 23 && FontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-Bold.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-Bold.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, FontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter Bold Font: " + e.getMessage());
            return new Font("Arial", Font.BOLD, FontSize);
        }
    }

    @Override
    public Font getExtraBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }
        
        if (FontSize == 0) {
            FontSize = extraBoldSize;
        }

        String fontPath;

        if (FontSize < 23) {
            fontPath = "Custom Fonts/Inter/static/Inter_18pt-ExtraBold.ttf";
        } else if (FontSize > 23 && FontSize < 27) {
            fontPath = "Custom Fonts/Inter/static/Inter_24pt-ExtraBold.ttf";
        } else {
            fontPath = "Custom Fonts/Inter/static/Inter_28pt-ExtraBold.ttf";
        }

        // Try catch block to load font. Fallback font is Arial
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, FontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Error loading Inter ExtraBold Font: " + e.getMessage());
            return new Font("Arial", Font.BOLD, FontSize);
        }
    }
    
}
