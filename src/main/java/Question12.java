public class Question12 {
    public static void printOddNumbersInRange(int start, int end) {
        String odnum = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 ==1) {
                odnum += i + "\n";
            }
        }
        System.out.println(odnum);
    }
        public static void main(String[] args){
        printOddNumbersInRange(1, 10);
        }
    }

