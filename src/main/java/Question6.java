import java.lang.reflect.Array;
import java.util.Arrays;

public class Question6 {
    public static int getSum(int[] ints) {
        int sum = Arrays.stream(ints).sum();
        return sum;

    }

    public static void main(String[]args){
        int[]days ={10,20,30,40};
        System.out.println(getSum(days));
    }

}


