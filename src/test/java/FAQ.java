import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FAQ {
    //Loop that will return even numbers from 1-10
//1. Loop that goes over values from 1 to 10
//2. By using % operator, evaluate if number is even or odd
//3. Using If statement print out only even numbers
    @Test
    public void testPrintEvenNumbers1() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

//If you want to print "hello world" at even numbers then how would you do it?
    @Test
    public void testPrintEvenNumbers2() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i + "-hello world");
        }
    }
//Swap two numbers in an array
@Test
public void swapTwoNumbersInArray() {
    int[] array = {1,2,3,4};
    swap(array, 2, 3);
    System.out.println(Arrays.toString(array));
}
    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL]; //declarion 1st
        array[indexL] = array[indexR]; // swapping spots
        array[indexR] = temp; // rewriting var
    }


}
