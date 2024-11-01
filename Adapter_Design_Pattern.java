class OldCalculator {
    private int number1;
    private int number2;
    public OldCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2; }
    public int getNum1() {

        return number1;
    }
    public int getNum2() {
        return number2;
    }
    public int sum() {
        return number1 + number2;
    }
}
// NewCal interface (defines the multi() method)
interface NewCalculator {
    int multi();
}
// AdaptorCal class (implements NewCal using OldCal)
class AdaptorCal implements NewCalculator {
    private OldCalculator oldCal;
    public AdaptorCal(OldCalculator oldCal) {
        this.oldCal = oldCal;
    }
    public int multi() {
        int num1 = oldCal.getNum1();
        int num2 = oldCal.getNum2();
        return num1 * num2;}
}
// Usage example
public class MyApp {
    public static void main(String[] args) {
        OldCalculator oldType = new OldCalculator(10, 20);
        NewCalculator newType = new AdaptorCal(oldType);
        System.out.println("Sum: " + oldType.sum());
        System.out.println("Multiplication: " + newType.multi());
    }
}