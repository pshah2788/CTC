package Arrays;

public class CompressStrings {

    public String CompressString (String str) {
        int count = 1;
        StringBuffer sb = new StringBuffer();
        char last = ' ';
        for(int i=1;i<str.length();i++) {
                if(str.charAt(i) == str.charAt(i-1)) {
                    count ++;
                } else {
                    sb.append(str.charAt(i-1)).append(String.valueOf(count));
                    // handling the case of last is very important - since we
                    // we will go out of loop
                    last = str.charAt(i);
                    count = 1;
                }
        }
        return returnOrg(str, sb.append(last).append(String.valueOf(count)).toString());
    }

    public String returnOrg (String orgString, String sbString) {
        int orgLength  = orgString.length();
        int sbLength = sbString.length();
        if(sbLength > orgLength) return orgString;
        else return sbString;
    }

    public static void main (String args[]) {
        String str = "aaccee";
        CompressStrings obj = new CompressStrings();
        System.out.println( "Compression of " + str + " => " + obj.CompressString(str));
    }

}
