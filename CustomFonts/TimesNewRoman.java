package CustomFonts;

import java.awt.Font;

public class TimesNewRoman extends FontMaker {
    private int fontVariants;
    private int ultraThinSize;
    private int thinSize;
    private int regularSize;
    private int semiBoldSize;
    private int boldSize;   
    private int extraBoldSize;

    public TimesNewRoman() {
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
    public TimesNewRoman(int fontVariants, int ultraThinSize, int thinSize, int regularSize,
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

        return new Font("Times New Roman", Font.PLAIN, fontSize);
    }

    @Override
    public Font getThinFont(int FontSize) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThinFont'");
    }

    @Override
    public Font getRegularFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }

        if (FontSize == 0) {
            FontSize = regularSize;
        }

        return new Font("Times New Roman", Font.PLAIN, FontSize);
    }

    @Override
    public Font getSemiBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }

        if (FontSize == 0) {
            FontSize = semiBoldSize;
        }

        return new Font("Times New Roman", Font.BOLD, FontSize);
    }

    @Override
    public Font getBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }

        if (FontSize == 0) {
            FontSize = boldSize;
        }

        return new Font("Times New Roman", Font.BOLD, FontSize);
    }

    @Override
    public Font getExtraBoldFont(int FontSize) {
        if (FontSize < 0) {
            throw new IllegalArgumentException("Font size cannot be negative.");
        }

        if (FontSize == 0) {
            FontSize = extraBoldSize;
        }

        return new Font("Times New Roman", Font.BOLD, FontSize);
    }
    
}
