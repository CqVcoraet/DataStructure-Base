// Imported Packages
import Linear.*;

public class StructureTester extends AbstractTester {
    public enum DataStructureType {
        Linear(0), Associative(1), Circular(2), Factorial(3), Visual(4), Nested(5), Custom(6);

        private final int code;
        DataStructureType(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static DataStructureType fromCode(int code) {
            for (DataStructureType type : values()) {
                if (type.code == code) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid DataStructureType code: " + code);
        }

        public interface Implementation {
            int getValue();
        }

        public enum LinearImplementation implements Implementation {
            ArrayList(0),
            LinkedList(1);

            private final int value;
            LinearImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static LinearImplementation fromValue(int value) {
                for (LinearImplementation option : values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Linear value: " + value);
            }
        }

        public enum AssociativeImplementation implements Implementation {
            HashMap(0),
            HashTable(1);

            private final int value;
            AssociativeImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static AssociativeImplementation fromValue(int value) {
                for (AssociativeImplementation option: values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Associative value: " + value);
            }
        }

        public enum CircularImplementation implements Implementation {
            CircularArray(0),
            CeaserCipher(1),
            KeyedCeaserCipher(2);

            private final int value;
            CircularImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static CircularImplementation fromValue(int value) {
                for (CircularImplementation option : values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Circular value: " + value);
            }
        }

        public enum FactorialImplementation implements Implementation {
            Tree(0),
            BinaryTree(1);

            private final int value;
            FactorialImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static FactorialImplementation fromValue(int value) {
                for (FactorialImplementation option : values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Factorial value: " + value);
            }
        }

        public enum VisualImplementation implements Implementation {
            Graph(0);

            private final int value;
            VisualImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static VisualImplementation fromValue(int value) {
                for (VisualImplementation option : values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Visual value: " + value);
            }
        }

        public enum NestedImplementation implements Implementation {
            Collection(0);

            private final int value;
            NestedImplementation(int value) {
                this.value = value;
            }

            @Override
            public int getValue() {
                return value;
            }

            public static NestedImplementation fromValue(int value) {
                for (NestedImplementation option : values()) {
                    if (option.value == value) {
                        return option;
                    }
                }
                throw new IllegalArgumentException("Invalid Nested value: " + value);
            }
        }

        public enum CustomImplementation implements Implementation {
            // Add custom values here as needed
            ;

            @Override
            public int getValue() {
                throw new UnsupportedOperationException("Custom enum values are not defined yet.");
            }
        }
    }

    private DataStructureType dataStructureType;
    private DataStructureType.Implementation dataStructureImplementation;

    public StructureTester() {
        this(true, false, 100, DataStructureType.Linear, DataStructureType.LinearImplementation.ArrayList);
    }

    public StructureTester(boolean showConsoleColors, boolean printFailuresOnly, int expectedTotalTests, DataStructureType dataStructureType, DataStructureType.Implementation dataStructureImplementation) {
        super(showConsoleColors, printFailuresOnly, expectedTotalTests);
        this.dataStructureType = dataStructureType;
        this.dataStructureImplementation = dataStructureImplementation;
    }

    /**
     * Configure which data structure type and implementation to use.
     * For example: type=Linear, implementation=ArrayList.
     */
    public void setDataStructure(DataStructureType type, DataStructureType.Implementation implementation) {
        if (implementation == null) {
            throw new IllegalArgumentException("Implementation cannot be null");
        }
        if (!matchesDataStructureType(type, implementation)) {
            throw new IllegalArgumentException("Implementation " + implementation + " does not match data structure type " + type);
        }
        this.dataStructureType = type;
        this.dataStructureImplementation = implementation;
    }

    public DataStructureType getDataStructureType() {
        return this.dataStructureType;
    }

    public DataStructureType.Implementation getDataStructureImplementation() {
        return this.dataStructureImplementation;
    }

    public int getDataStructureValue() {
        return this.dataStructureImplementation.getValue();
    }

    private static boolean matchesDataStructureType(DataStructureType type, DataStructureType.Implementation implementation) {
        switch (type) {
            case Linear:
                return implementation instanceof DataStructureType.LinearImplementation;
            case Associative:
                return implementation instanceof DataStructureType.AssociativeImplementation;
            case Circular:
                return implementation instanceof DataStructureType.CircularImplementation;
            case Factorial:
                return implementation instanceof DataStructureType.FactorialImplementation;
            case Visual:
                return implementation instanceof DataStructureType.VisualImplementation;
            case Nested:
                return implementation instanceof DataStructureType.NestedImplementation;
            case Custom:
                return implementation instanceof DataStructureType.CustomImplementation;
            default:
                return false;
        }
    }

    /**
     * Create a new instance of the configured data structure.
     * Currently only `Linear` is supported; additional implementations
     * should be added to the `createLinear()` factory method.
     */
    public <T> IndexedUnsortedList<T> createDataStructureInstance() {
        switch (this.dataStructureType) {
            case Linear:
                return createLinear((DataStructureType.LinearImplementation) this.dataStructureImplementation);
            default:
                throw new UnsupportedOperationException("Data structure type not supported yet: " + this.dataStructureType);
        }
    }

    private <T> IndexedUnsortedList<T> createLinear(DataStructureType.LinearImplementation implementation) {
        switch (implementation) {
            case ArrayList: // Array-backed list
                return new IUArrayList<>();
            case LinkedList: // LinkedList (not implemented yet)
                return new IULinkedList<>();
            default:
                throw new IllegalArgumentException("Invalid Linear implementation: " + implementation);
        }
    }
}
