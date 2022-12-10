public class LengthOfLongestSubstring{
    //Time complexity => O(n^2)
    //Space complexity => O(1)
    public int solution(String s) {
        int length = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            builder.setLength(0);
            builder.append(s.charAt(i));
            for(int j = i + 1; j < s.length(); j++){
                if(!builder.toString().contains(String.valueOf(s.charAt(j)))){
                    builder.append(s.charAt(j));
                }else break;
            }
            if(builder.toString().length() > length)
                length = builder.toString().length();
        }
        return length;
    } 
}
