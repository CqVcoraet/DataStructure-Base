package CustomFonts;

// Imported Packages
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.*;

public abstract class FontMaker {
    /**
     * Instance variables. One for the font array and others for the different font sizes.
     */
    private int fontVariants;
    private int ultraThinSize;
    private int thinSize;
    private int regularSize;
    private int semiBoldSize;
    private int boldSize;   
    private int extraBoldSize;

    public FontMaker() {
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
    public FontMaker(int fontVariants, int ultraThinSize, int thinSize, int regularSize, int semiBoldSize, int boldSize, int extraBoldSize) {
        this.fontVariants = fontVariants;
        this.ultraThinSize = ultraThinSize;
        this.thinSize = thinSize;
        this.regularSize = regularSize;
        this.semiBoldSize = semiBoldSize;
        this.boldSize = boldSize;
        this.extraBoldSize = extraBoldSize;
    }

    /**
     * Sets the font size for ultra thin font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param fontSize -> Size of the font. Default size is 18.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getUltraThinFont(int fontSize);

    /**
     * Sets the font size for thin font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param FontSize -> Size of the font. Default size is 20.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getThinFont(int FontSize);

    /**
     * Sets the font size for regular font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param FontSize -> Size of the font. Default size is 20.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getRegularFont(int FontSize);

    /**
     * Sets the font size for semi bold font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param FontSize -> Size of the font. Default size is 25.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getSemiBoldFont(int FontSize);

    /**
     * Sets the font size for bold font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param FontSize -> Size of the font. Default size is 30.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getBoldFont(int FontSize);

    /**
     * Sets the font size for extra bold font.
     * Functions like a getter and setter. Type 0 in the fontSize to set it to its default size.
     * @param FontSize -> Size of the font. Default size is 45.
     * @return Font -> Returns the font of the specified size. If file is not found, it returns the font in Arial.
     */
    public abstract Font getExtraBoldFont(int FontSize);
}
