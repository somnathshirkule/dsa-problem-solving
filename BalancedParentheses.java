import java.util.Stack;
public class BalancedParentheses{
    public static void main(String[] args){
        String str = "((()))";
        System.out.println(new BalancedParentheses().solution(str));
    }
    private boolean solution(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){
                st.push(c);
            }
            else if(c ==')'){
                if(!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}