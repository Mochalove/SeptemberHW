public class Question3 {
    public static int getFirstElement(String[] names) {
        int cabi = names.length -3;
        return cabi;
    }
    public static void main(String [] args){
       String[] cars = {"Volvo", "Dodge", "Chevy", "Ford"};
        System.out.println(getFirstElement(cars));
    }

}
