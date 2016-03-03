package Arrays;

/*
Method 1: reverses the string in place
Method 2: using stack , just prints the reverse.
*/

public class ReverseOfString {

    public String reverse(String word) {
        if(null!=word && word.length()>1) {
            char[] chars = word.toCharArray();
            int left = 0;
            int right = word.length() - 1;
            while(left<right) {
                // swap
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left ++; right --;
            }
            return new String(chars);
        } else return word;
    }

    public String printReverse(String word) {
        java.util.Stack<Character> charStack = new java.util.Stack<Character>();
        java.lang.StringBuilder reversedWord = new java.lang.StringBuilder();
        for(int i=0;i<word.length();i++) {
            charStack.push(word.charAt(i));
        }
        while(!charStack.isEmpty()) {
            reversedWord.append(charStack.pop());
        }
        return reversedWord.toString();
    }

    public static void main(String args[]) {
        ReverseOfString obj  = new ReverseOfString();
        String word = "kitarp";
        System.out.println("Reverse of '" + word + "' is '" + obj.reverse(word) + "'");
        System.out.println("Printing Reverse of '" + word + "' is '" + obj.printReverse(word) + "'");
    }

}
