public class Question5 {
    public static int getSecondToLastElement(String[] names) {
        int color = names.length;
        return color -2;
    }
    public static void main(String[] args){
        String[] colors ={"Pink", "Blue", "Gold", "Black"};
        System.out.println(getSecondToLastElement(colors));
    }
}
