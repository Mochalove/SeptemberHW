public class Question13 {
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String season = str.repeat(n);
        return season;
    }

    public static void main(String[] args) {
        System.out.println(printGivenStringTimesNumberGiven("Oh Wow " + "\n", 34));
    }
}
