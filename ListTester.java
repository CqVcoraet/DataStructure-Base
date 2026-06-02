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
        ArrayList,
        LinkedList
    }

    private static ListToUse selectedList = ListToUse.ArrayList;

    // List Element
    private final Integer ELEMENT_A = 0;
    private final Integer ELEMENT_B = 1;
    private final Integer ELEMENT_C = 2;
    private final Integer ELEMENT_D = 3;
    private final Integer ELEMENT_X = -1; // Doesn't show in lists

    public static void main(String[] args) {
        ListTester tester;
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
        tester.runTests();
    }

    private void runTests() {
        printFinalSummary();
    }

    // ALL TESTS

    // Section 1 - Single List

}
