import org.testng.annotations.Test;

public class newOne {

    @Test
    public void stringValue() {
        System.out.println("new one");
    }

    @Test
    public void stringVar() {
        String textOne = "new one var";
        System.out.println(textOne);

    }

    @Test
    public void testNumberVar() {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void CharsConcat() {
        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);
    }

    @Test
    public void testBooleanVar1() {
        boolean b = false;

        if (b == true) {
            System.out.println("B is true");
        }
    }

    @Test
    public void testBooleanVar2() {
        boolean b = true;

        if (b == true) {
            System.out.println("B is true");
        }
    }

    @Test
    public void testBooleanVar3() {
        boolean b = true;

        if (b) {
            System.out.println("B is true");
        }
    }

    @Test
    public void testBooleanVar4() {
        boolean b = true;
        boolean bIsTrue = b == true;
        if (bIsTrue) {
            System.out.println("B is true");
        }
    }

    @Test
    public void doublePipeOperatorOR() {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) || (value2 == 1)) {
            System.out.println("BOOM!");
        }
    }

    @Test
    public void doublePipeOperatorANDneg() {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 1)) {
            System.out.println("BOOM!");
        }
    }

    @Test
    public void doublePipeOperatorANDpos() {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 > 1)) {
            System.out.println("BOOM!");
        }
    }

    @Test
    public void testBooleanWithLogicalOperators() {
        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }
    }

    @Test
    public void ifElsePos() {

        boolean a = true;
        boolean b = true;
        if (a == b) {
            System.out.println("Click on el");
        } else {
            System.out.println("looking for another el");
        }
    }

    @Test
    public void ifElseNeg() {

        boolean a = true;
        boolean b = false;
        if (a == b) {
            System.out.println("Click on el");
        } else {
            System.out.println("looking for another el");
        }
    }

    @Test
    public void arrayBox1() {
        int[] arrayName = new int[10];
        arrayName[0] = 1;
        arrayName[1] = 2;
        arrayName[2] = 4;
        arrayName[3] = arrayName[2] + 4;
        System.out.println(arrayName[3]);

    }

    @Test
    public void arrayBox2() {
        int[] arrayName = new int[]{4, 7, 9, 1, 2, 4};
        System.out.println(arrayName[0]);
    }

    @Test //or simplified without new
    public void arrayBox3() {
        int[] arrayName = {4, 7, 9, 1, 2, 4};
        System.out.println(arrayName[1]);
    }

    @Test
    public void Lopps() {
        for (int i = 0; i < 3; i++) {
            System.out.println("nice");
        }
    }

    @Test
    public void arrayLoop1() {
        int[] arr = {1, 2, 3, 454, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void arrayLoop2() {
        int[] arr = {1, 2, 3, 454, 5};

        for (int j : arr) {
            System.out.println(j);
        }
    }

    @Test
    public void arrayLoop3() {
        int[] arr = {1, 2, 3, 454, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void arrayLoopSearchValue() {
        int[] arr = {1, 2, 3, 454, 5};
        int valueToSearch = 454;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("el value found" + " - " + arr[i]);
                System.out.println("el index" + " - " + i);
            }
        }
    }

    @Test
    public void arrayLoopSearchValueThatNotThere() {
        int[] arr = {1, 2, 3, 454, 5};
        int valueToSearch = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("el value found" + " - " + arr[i]);
                System.out.println("el index" + " - " + i);
            } else {
                System.out.println("not found");
            }
        }
    }

    //method
    public void searchEl(int[] arr, int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("el value found" + " - " + arr[i]);
                System.out.println("el index" + " - " + i);
            }  else {
                System.out.println("not found");
            }
        }
    }

    @Test
    public void useMethodonTest() {
        int[] arr = {1, 2, 3, 454, 5};
searchEl(arr,5);
    }

    @Test
    public void useMethode() {
        int[] arr = {333,444,555};
        searchEl(arr,3);
    }
}
