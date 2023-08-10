public class Calculator {
    private int one, two;


    public int add(int one, int two){
        return one + two;
    }
    public int subtraction(int one, int two){
        return one - two;
    }
    public int multiply(int one, int two){
        return one * two;
    }
    public double division(int one, int two){
        return (double) one / (double) two;
    }
    public double square(int one){
        return Math.pow(one, 2);
    }
}
