import Linear.IUArrayList;
import Linear.IndexedUnsortedList;

public class StructureTester extends AbstractTester {
    public enum DataStructureType {
        Linear, Circular, Factorial, Visual, Nested, Custom
    };

    private int dataStructureValue;
    private DataStructureType dataStructureType;

    public StructureTester() {
        this(true, false, 100, DataStructureType.Linear, 0);
    }

    public StructureTester(boolean showConsoleColors, boolean printFailuresOnly, int expectedTotalTests, DataStructureType dataStructureType, int dataStructureValue) {
        super(showConsoleColors, printFailuresOnly, expectedTotalTests);
        this.dataStructureType = dataStructureType;
        this.dataStructureValue = dataStructureValue;
    }

    /**
     * Configure which data structure type and implementation index to use.
     * For example: type=Linear, value=0 -> `IUArrayList` (array-backed list).
     */
    public void setDataStructure(DataStructureType type, int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Implementation index must be >= 0");
        }
        this.dataStructureType = type;
        this.dataStructureValue = value;
    }

    public DataStructureType getDataStructureType() {
        return this.dataStructureType;
    }

    public int getDataStructureValue() {
        return this.dataStructureValue;
    }

    /**
     * Create a new instance of the configured data structure.
     * Currently only `Linear` is supported; additional implementations
     * should be added to the `createLinear()` factory method.
     */
    public <T> IndexedUnsortedList<T> createDataStructureInstance() {
        switch (this.dataStructureType) {
            case Linear:
                return createLinear();
            default:
                throw new UnsupportedOperationException("Data structure type not supported yet: " + this.dataStructureType);
        }
    }

    private <T> IndexedUnsortedList<T> createLinear() {
        switch (this.dataStructureValue) {
            case 0: // Array-backed list
                return new IUArrayList<>();
            case 1: // LinkedList (not implemented yet)
                throw new UnsupportedOperationException("LinkedList implementation not available");
            default:
                throw new IllegalArgumentException("Unknown Linear implementation index: " + this.dataStructureValue);
        }
    }
}
