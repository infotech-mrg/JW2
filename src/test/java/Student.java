public class Student {

    String nameOfClassField;
    String randomNameField;
    int[] grades = {};

    public Student(String nameOfClassParm, String randomNameParm) {
        this.nameOfClassField =nameOfClassParm;
        this.randomNameField = randomNameParm;
    }

    public void printName(){
        System.out.println(nameOfClassField);
    }
    public void study(){
        System.out.println("studing");
    }
    public void graduate(){
        System.out.println("studing2");

    }
    public void learn(){
        System.out.println("studing3");

    }
    public void explore(){

    }

}
