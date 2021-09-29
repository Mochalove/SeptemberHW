package Homeworks;

public class Question2 {
    public static int getSecondToLastIndex(String[] names) {
        int cabi = names.length -2;
        return cabi;
    }
    public static void main(String[] args){
        String[] houses = {"Num", "Hum", "Dum", "Pum"};
        System.out.println(getSecondToLastIndex(houses));
    }

}


