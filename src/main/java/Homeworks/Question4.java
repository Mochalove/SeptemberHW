package Homeworks;

public class Question4 {
    public static int getLastElement(String[] names) {
        int var2 = names.length -1;
        return var2;
    }
    public static void main(String[] args){
        String[] seasons = {"Fall", "Winter", "Summer", "Spring"};
        System.out.println(getLastElement(seasons));
    }

}
