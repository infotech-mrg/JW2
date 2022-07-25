import org.testng.annotations.Test;

public class SecondGo {
    @Test
    public void concat() {
        int varOne = 1;
        int varTwo = 2;
        System.out.println(varOne + varTwo);
    }

    @Test
    public void concatToStr() {
        int varOne = 1;
        int varTwo = 2;
        System.out.println(varOne + "" + varTwo);
    }

    @Test
    public void floatOneNeg() {
        int floatVar = (int) 4.5;
        System.out.println(floatVar);
    }

    @Test
    public void floatOnePos1() {
        float floatVar = (float) 4.5;
        System.out.println(floatVar);
    }

    @Test
    public void floatOnePos2() {
        float floatVar = 4.5f;
        System.out.println(floatVar);
    }

    @Test
    public void floatOnePos0() {
        float floatVar = (int) 4.5;
        System.out.println(floatVar);
    }

    //reg method
    public void printTwoNumbers(int par1, int par2) {
        System.out.println(par1 + "" + par2);
    }

    @Test
    public void concatWithMethod() {
        int varOne = 1;
        int varTwo = 2;
        printTwoNumbers(varOne, varTwo);
    }

    @Test
    public void bln() {
        boolean blnVarNm = true;
        int nmbOfLinks = 5;
        int nmbOfClicks = 4;
        boolean enogthLinks = nmbOfLinks > nmbOfClicks;
        if(enogthLinks){
            System.out.println("Keep clicking on links");
        }
    }

    @Test
    public void Ampercent() {
        int nmbOfLinks = 5;
        int nmbOfClicks = 4;
        boolean enogthLinks = nmbOfLinks > nmbOfClicks;

        int crntTime = 5000;
        int timeSinceTestStarted = 3000;
        boolean StillSomeTimeToClick = isThereStillSomeTimeToClick(crntTime, timeSinceTestStarted);

        boolean elVisibale = true;

        if (elVisibale && enogthLinks || StillSomeTimeToClick){
            System.out.println("Keep clicking");
        } else{
            System.out.println("Some conditions are not met");
        }
    }
    public boolean isThereStillSomeTimeToClick(int crntTime, int timeSinceTestStarted){
        boolean res = false;
        res = (crntTime - timeSinceTestStarted) > 1000;

        return res;
    }
    @Test
    public void arrMthd(){
        String car1 = "Tesla001";
        String car3 = "Tesla003";
        String car2 = "Tesla002";
        String car4 = "Tesla004";
        String car5 = "T5";
        String[] arrStrGarage = {car1, car2,car3,car5};

        for (int i=0; i<arrStrGarage.length;i++){
            System.out.println(i + "|=" + arrStrGarage[i]);
        }
    }
    @Test
    public void arrMthdEnhancedForLoop(){
        String car1 = "Tesla001";
        String car2 = "Tesla002";
        String car3 = "Tesla003";
        String car4 = "Tesla004";
        String car5 = "T5";
        String[] arrStrGarage = {car1, car2,car3,car5};
//push all vars over array n brings one that match
        for (String allStrs : arrStrGarage){
            System.out.println( allStrs);
        }
    }


}
