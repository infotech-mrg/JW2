import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StudentTest {

    @Test
    public void testName() {
        String testParms1 = "person1stName";
        String testParms2 = "personLastName";

        Student stdOne = new Student(testParms1,testParms2);

        stdOne.printName();
        stdOne.graduate();
        boolean matching = stdOne.nameOfClassField.contentEquals("person1stName");
        assertTrue(true);
        assertEquals(stdOne.nameOfClassField, "person1stName");

    }
}
