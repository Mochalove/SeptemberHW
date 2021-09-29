public class Question14 {
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = str.substring(0, 3);
        return firstThree.repeat(n);
    }

    public static void main(String[] args) {
        String half = "The sky is pank";

        System.out.println(repeatFirstThreeLetters(half, 3));
    }
}
