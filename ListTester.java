public class ListTester extends StructureTester {
    public ListTester() {
        super(true, false, 100, DataStructureType.Linear, DataStructureType.LinearImplementation.ArrayList);
    }

    public ListTester(boolean showConsoleColors, boolean printFailuresOnly, int expectedTotalTests,
                      DataStructureType.LinearImplementation implementation) {
        super(showConsoleColors, printFailuresOnly, expectedTotalTests,
              DataStructureType.Linear, implementation);
    }

    private static enum ListToUse {
        ArrayList("ArrayList"),
        LinkedList("LinkedList");

        private final String value;

        ListToUse(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private static ListToUse selectedList = ListToUse.ArrayList;
    private static ListTester tester;

    static {
        switch (selectedList) {
            case ArrayList:
                tester = new ListTester(true, false, 1000, DataStructureType.LinearImplementation.ArrayList);
                break;
            case LinkedList:
                tester = new ListTester(true, false, 1000, DataStructureType.LinearImplementation.LinkedList);
                break;
            default:
                throw new IllegalStateException("Unexpected list type: " + selectedList);
        }
    }

    // List Element
    private final Integer ELEMENT_A = 0;
    private final Integer ELEMENT_B = 1;
    private final Integer ELEMENT_C = 2;
    private final Integer ELEMENT_D = 3;
    private final Integer ELEMENT_X = -1; // Doesn't show in lists

    public static void main(String[] args) {
        System.out.println(tester.BLUECYAN + "Testing " + selectedList.getValue() + "..." + tester.RESET);        
        tester.runTests();
    }

    private void runTests() {
        printFinalSummary();
    }

    // ALL POSSIBLE LISTS

    // Single Element
    final Integer[] LIST_A = {ELEMENT_A};
    final Integer[] LIST_B = {ELEMENT_B};
    final Integer[] LIST_C = {ELEMENT_C};
    final Integer[] LIST_D = {ELEMENT_D};

    // 2 Element
    final Integer[] LIST_AB = {ELEMENT_A, ELEMENT_B};
    final Integer[] LIST_AC = {ELEMENT_A, ELEMENT_C};
    final Integer[] LIST_AD = {ELEMENT_A, ELEMENT_D};
    final Integer[] LIST_BA = {ELEMENT_B, ELEMENT_A};
    final Integer[] LIST_BC = {ELEMENT_B, ELEMENT_C};
    final Integer[] LIST_BD = {ELEMENT_B, ELEMENT_D};
    final Integer[] LIST_CA = {ELEMENT_C, ELEMENT_A};
    final Integer[] LIST_CB = {ELEMENT_C, ELEMENT_B};
    final Integer[] LIST_CD = {ELEMENT_C, ELEMENT_D};
    final Integer[] LIST_DA = {ELEMENT_D, ELEMENT_A};
    final Integer[] LIST_DB = {ELEMENT_D, ELEMENT_B};
    final Integer[] LIST_DC = {ELEMENT_D, ELEMENT_C};

    // 3 Element
    final Integer[] LIST_ABC = {ELEMENT_A, ELEMENT_B, ELEMENT_C};
    final Integer[] LIST_ACB = {ELEMENT_A, ELEMENT_C, ELEMENT_B};
    final Integer[] LIST_ABD = {ELEMENT_A, ELEMENT_B, ELEMENT_D};
    final Integer[] LIST_ADB = {ELEMENT_A, ELEMENT_D, ELEMENT_B};
    final Integer[] LIST_ACD = {ELEMENT_A, ELEMENT_C, ELEMENT_D};
    final Integer[] LIST_ADC = {ELEMENT_A, ELEMENT_D, ELEMENT_C};
    final Integer[] LIST_BAC = {ELEMENT_B, ELEMENT_A, ELEMENT_C};
    final Integer[] LIST_BCA = {ELEMENT_B, ELEMENT_C, ELEMENT_A};
    final Integer[] LIST_BAD = {ELEMENT_B, ELEMENT_A, ELEMENT_D};
    final Integer[] LIST_BDA = {ELEMENT_B, ELEMENT_D, ELEMENT_A};
    final Integer[] LIST_BCD = {ELEMENT_B, ELEMENT_C, ELEMENT_D};
    final Integer[] LIST_BDC = {ELEMENT_B, ELEMENT_D, ELEMENT_C};
    final Integer[] LIST_CAB = {ELEMENT_C, ELEMENT_A, ELEMENT_B};
    final Integer[] LIST_CBA = {ELEMENT_C, ELEMENT_B, ELEMENT_A};
    final Integer[] LIST_CAD = {ELEMENT_C, ELEMENT_A, ELEMENT_D};
    final Integer[] LIST_CDA = {ELEMENT_C, ELEMENT_D, ELEMENT_A};
    final Integer[] LIST_CBD = {ELEMENT_C, ELEMENT_B, ELEMENT_D};
    final Integer[] LIST_CDB = {ELEMENT_C, ELEMENT_D, ELEMENT_B};
    final Integer[] LIST_DAB = {ELEMENT_D, ELEMENT_A, ELEMENT_B};
    final Integer[] LIST_DBA = {ELEMENT_D, ELEMENT_B, ELEMENT_A};
    final Integer[] LIST_DAC = {ELEMENT_D, ELEMENT_A, ELEMENT_C};
    final Integer[] LIST_DCA = {ELEMENT_D, ELEMENT_C, ELEMENT_A};
    final Integer[] LIST_DBC = {ELEMENT_D, ELEMENT_B, ELEMENT_C};
    final Integer[] LIST_DCB = {ELEMENT_D, ELEMENT_C, ELEMENT_B};

    // 4 Element
    final Integer[] LIST_ABCD = {ELEMENT_A, ELEMENT_B, ELEMENT_C, ELEMENT_D};
    final Integer[] LIST_ABDC = {ELEMENT_A, ELEMENT_B, ELEMENT_D, ELEMENT_C};
    final Integer[] LIST_ACBD = {ELEMENT_A, ELEMENT_C, ELEMENT_B, ELEMENT_D};
    final Integer[] LIST_ACDB = {ELEMENT_A, ELEMENT_C, ELEMENT_D, ELEMENT_B};
    final Integer[] LIST_ADBC = {ELEMENT_A, ELEMENT_D, ELEMENT_B, ELEMENT_C};
    final Integer[] LIST_ADCB = {ELEMENT_A, ELEMENT_D, ELEMENT_C, ELEMENT_B};
    final Integer[] LIST_BACD = {ELEMENT_B, ELEMENT_A, ELEMENT_C, ELEMENT_D};
    final Integer[] LIST_BADC = {ELEMENT_B, ELEMENT_A, ELEMENT_D, ELEMENT_C};
    final Integer[] LIST_BCAD = {ELEMENT_B, ELEMENT_C, ELEMENT_A, ELEMENT_D};
    final Integer[] LIST_BCDA = {ELEMENT_B, ELEMENT_C, ELEMENT_D, ELEMENT_A};
    final Integer[] LIST_BDAC = {ELEMENT_B, ELEMENT_D, ELEMENT_A, ELEMENT_C};
    final Integer[] LIST_BDCA = {ELEMENT_B, ELEMENT_D, ELEMENT_C, ELEMENT_A};
    final Integer[] LIST_CABD = {ELEMENT_C, ELEMENT_A, ELEMENT_B, ELEMENT_D};
    final Integer[] LIST_CADB = {ELEMENT_C, ELEMENT_A, ELEMENT_D, ELEMENT_B};
    final Integer[] LIST_CBAD = {ELEMENT_C, ELEMENT_B, ELEMENT_A, ELEMENT_D};
    final Integer[] LIST_CBDA = {ELEMENT_C, ELEMENT_B, ELEMENT_D, ELEMENT_A};
    final Integer[] LIST_CDAB = {ELEMENT_C, ELEMENT_D, ELEMENT_A, ELEMENT_B};
    final Integer[] LIST_CDBA = {ELEMENT_C, ELEMENT_D, ELEMENT_B, ELEMENT_A};
    final Integer[] LIST_DABC = {ELEMENT_D, ELEMENT_A, ELEMENT_B, ELEMENT_C};
    final Integer[] LIST_DACB = {ELEMENT_D, ELEMENT_A, ELEMENT_C, ELEMENT_B};
    final Integer[] LIST_DBAC = {ELEMENT_D, ELEMENT_B, ELEMENT_A, ELEMENT_C};
    final Integer[] LIST_DBCA = {ELEMENT_D, ELEMENT_B, ELEMENT_C, ELEMENT_A};
    final Integer[] LIST_DCAB = {ELEMENT_D, ELEMENT_C, ELEMENT_A, ELEMENT_B};
    final Integer[] LIST_DCBA = {ELEMENT_D, ELEMENT_C, ELEMENT_B, ELEMENT_A};

    // ALL TESTS

    // Section 1 - Single List
    private void testEmptyListAddA_A() {
    
    }
}
