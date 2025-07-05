import java.util.*;

class Solution {
    public int solution(int[] nums) {
       Set<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        if(set.size() <= nums.length/2){
            return set.size();
        }else{
            return nums.length/2;
        }
    }
}

//여기서 nums.length/2 만큼 골라야 함 -> nums.length/2 보다 작거나 같다면 set의 사이즈
//nums.length/2 보다 크다면 number.length/2 의 사이즈
  
