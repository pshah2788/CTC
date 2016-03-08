package Arrays;

public class ReplaceSpaces20 {

    public String replaceSpaces (String str, int trueLength) {
        int finalLength = str.length() - 1;
        char[] charArray = str.toCharArray();

        for(int i = trueLength; i >= 0; i--) {
            // not equal to space
            if(charArray[i] != ' ') {
                charArray[finalLength--] = charArray[i];
            } else {
                // equal to space
                charArray[finalLength--] = '0';
                charArray[finalLength--] = '2';
                charArray[finalLength--] = '%';
            }
        }
        return String.valueOf(charArray);
    }

    public static void main (String args[]) {
        String str = " b  ";
        ReplaceSpaces20 objReplaceSpaces = new ReplaceSpaces20();
        System.out.println(str + " on replace => " + objReplaceSpaces.replaceSpaces(str, 1));
    }

}
