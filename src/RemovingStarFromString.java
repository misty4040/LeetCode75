import java.util.Stack;

public class RemovingStarFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String res= removeStars(s);
        System.out.println(res);
    }

    public static String removeStars(String s) {
        Stack<Character> stack= new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch!='*'){
                stack.push(ch);
            }else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
