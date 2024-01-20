import java.util.*;

class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }

    public static int[] twoSum(int[] nums, int target){
        int[] index = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && map.containsKey(target-nums[i])){
                index[0] = map.get(target-nums[i]);
                index[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }

        
        return index;
    }
}