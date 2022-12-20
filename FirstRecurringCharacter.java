public class FirstRecurringCharacter{
    public char get(String str){
       List<Character> chars = new ArrayList<>();

       for(int i = 0; i < str.length; i++){
        if(chars.contains(str.charAt(i)))
            return str.charAt(i);
       }else{
        chars.add(str.charAt(i));
       }
       return '0';
    }
}