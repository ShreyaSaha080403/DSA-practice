class Solution {
    public int majorityElement(int[] nums) {
        //Better Solution

        // HashMap<Integer,Integer> mp=new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     int val=mp.getOrDefault(nums[i],0);
        //     mp.put(nums[i],val+1);
        // }
        // for(Map.Entry<Integer,Integer> e: mp.entrySet()){
        //     if(e.getValue()>n/2){
        //         return e.getKey();
        //     }
        // }
        // return -1;

        //optimal //moores voing algo
        
         int ele=0;
         int cnt=0;
         for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            else if(ele==nums[i]){
                cnt++;
            }
            else cnt--;
         }
         return ele;
    }
}