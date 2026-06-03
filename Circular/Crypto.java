// Imported Packages
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Crypto {
    private int numShifts;
    private int baseNum;

    public Crypto() {
        this.numShifts = 0;
        this.baseNum = 0;
    }

    public void loadFile(String filename) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File(filename));
            numShifts = scanner.nextInt();
            baseNum = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}