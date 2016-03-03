package Arrays;

public class UniqueChars {

  /* Set interface => HashSet O(1), LinkedHashSet : Maintains order, TreeSet : Sorted
  http://www.programcreek.com/2013/03/hashset-vs-treeset-vs-linkedhashset/
  */
  private java.util.HashSet<Character> hsCharCount = null;

  public boolean isUnique(String word, boolean bCTCLogic) {
      return !(bCTCLogic) ? isUnique(word) : isUniqueCTCLogic(word);
  }

  /*This method is case insensitive. to make it case sensitive you may refactor it and remove the toLowerCase function*/
  public boolean isUnique(String word) {
      hsCharCount = new java.util.HashSet<Character>();
      for(int i=0;i<word.length();i++) {
          if (hsCharCount.contains(word.charAt(i))) return false;
          else hsCharCount.add(word.charAt(i));
      }
      return true;
  }

/*This method is case sensitive. to make it case sensitive you may refactor it and remove the toLowerCase function*/
  public boolean isUniqueCTCLogic(String word) {
      int[] ascii = new int[255];
      for(int i=0;i<word.length();i++){
          int val = word.charAt(i) - 'A';
          if(ascii[val] == 1) return false;
          else ascii[val] = 1;
      }
      return true;
  }

  public static void main(String args[]) {
      UniqueChars objUniqueChars = new UniqueChars();
      String[] arr = {"uniqUe", "unnique", "nonunique", "nouqi", "abcd"};
      for(int i=0;i<arr.length;i++) {
          System.out.println("The word '" + arr[i] + "' is " + (objUniqueChars.isUnique(arr[i], true) ? "UNIQUE" : "NOT UNIQUE") );
      }
  }

}
