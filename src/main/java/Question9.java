public class Question9 {
    public static String extractAllEvenNumbers(int[] ints) {
        String even = " ";
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                even += ints[i] + " ";
            }
        }
        return even;
    }

    public static void main(String[] args) {
        int[] String = {16, 5, 13};
        System.out.println(extractAllEvenNumbers(String));
    }
}