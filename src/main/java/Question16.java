public class Question16 {
    public static int VowelsCounter(String str) {
        String happy = "A, E, I, O, U";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            Character invowel = str.charAt(i);
            System.out.println(invowel);
            if (invowel.equals(' ')) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        String name = "A, E, I, O, U";
        System.out.println(VowelsCounter(name));
    }
}

