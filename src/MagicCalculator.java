public class MagicCalculator extends Calculator{
    public double sqrt(int one){
        return Math.sqrt(one);
    }
    public double sin(int one){
        return Math.sin(one);
    }
    public double cosine(int one){
        return Math.cos(one);
    }
    public double tangent(int one){
        return Math.tan(one);
    }
    public int factorial(int one){
        if(one == 1){
            return 1;
        }
        else{
            return one * factorial(one - 1);
        }
    }
}
