public class Question5 {
    public static String getSecondToLastElement(String[] names) {
         int color = names.length;

        return String.valueOf(names.length -2);
    }
    public static void main(String[] args){
        String[] colors ={"Pink", "Blue", "Gold", "Black"};
        System.out.println(getSecondToLastElement(colors));
    }
}
