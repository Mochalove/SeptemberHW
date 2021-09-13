import java.util.Arrays;
import java.util.OptionalDouble;

public class Question7 {
    public static OptionalDouble getAverage(int[] ints) {
        OptionalDouble average = Arrays.stream(ints).average();
        return average;
    }
    public static void main(String[]args){
        int[]days={10,20,30,40};
        System.out.println(getAverage(days));
    }
}
