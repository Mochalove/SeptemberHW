public class Question10 {
    public static boolean contains(String[] names, String element) {
        for (String array : names) {
            if(array.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
    String[] aon ={"gold", "53", "river", "90"};
        System.out.println(contains(aon, "gold"));
}
}