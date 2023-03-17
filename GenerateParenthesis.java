import java.util.*;
public class GenerateParenthesis{
    public List<String> solution(int n){
        List<String> responseList = new ArrayList<>();
        generate(n, responseList,0,0,"");
        return responseList;
    }

    private void generate(int n, List<String> responseList, int open, int close, String str){
        if((n*2) == open + close){
            responseList.add(str);
            return;
        }

        if(open < n){
            generate(n, responseList, open + 1, close, str + "(");
        }
        if(close < open){
            generate(n, responseList, open, close + 1, str + ")");
        }
    }
}