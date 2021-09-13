public class Question8 {
    public static String extractAllOddNumbers(int[] ints) {
        String oddy = " ";
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddy += ints[i] + " ";
            }
        }
        return oddy;
    }

    public static void main(String[] args) {
        int[] String = {15, 3, 46};
        System.out.println(extractAllOddNumbers(String));
    }
}