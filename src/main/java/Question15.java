public class Question15 {
    public static String WordsInAStringCounter(String str){
        int counter = 0;
        //Write a java method to count all the words in a string
        for(int i = 0; i < str.length(); i++){
            Character ingold = str.charAt(i);
            if (ingold.equals(' ')){
                counter++;

            }
        }
        return String.valueOf(counter+1);
}

    public static void main(String[] args) {
        String gold = "Words are Important";
        System.out.println(WordsInAStringCounter(gold));

    }


    }
