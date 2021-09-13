public class Question11 {
    public static int getIndexByElement(String[] names, String element) {
      int getInd =0;
      for(int i = 0; i < names.length; i++){
          if(names[i] == element){
              getInd =i;
          }
      }
      return getInd;
}

    public static void main(String[] args) {
        String[] ranlist = {"Sum", "89", "Tappy", "Sazzy"};
        System.out.println(getIndexByElement(ranlist, "Sazzy"));
    }
}