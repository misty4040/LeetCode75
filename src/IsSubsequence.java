public class IsSubsequence {

    public static void main(String[] args) {
       String s = "abc";
       String t = "ahbgdc";
       boolean res=isSubsequence(s,t);
        System.out.println(res);
    }

    private static boolean isSubsequence(String s, String t) {
        int i=0,j=0;

        while(i <s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }

        return i==s.length();

    }
}
