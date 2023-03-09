import java.util.*;
public class AgeGroup{
    public static void main(String[] args){
        System.out.println(new AgeGroup().getByAgeGroup(new int[]{23,24,31,15,18}));
    }

    public Map<String, Integer> getByAgeGroup(int[] ages){
        Map<String, Integer> ageGroupMap = new HashMap<>();
        for(Integer age : ages){
            String ageGroup = getAgeGroup(age);
            if(ageGroupMap.containsKey(ageGroup)){
                int count = ageGroupMap.get(ageGroup);
                count++;
                ageGroupMap.put(ageGroup, Integer.valueOf(count));
            }else{
                ageGroupMap.put(ageGroup, Integer.valueOf(1));
            }
        }

        return ageGroupMap;
    }

    private String getAgeGroup(int age){
        int ageStart = age / 10;
        int ageEnd =  (age / 10) + 1;
        return "" + ageStart + "1-" + ageEnd + "0";
    }
}