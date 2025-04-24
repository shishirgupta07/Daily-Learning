class Solution {
    public int countCompleteSubarrays(int[] nums) {
     Set<Integer> uniqueElements = new HashSet<>();
     for (int num : nums)
         uniqueElements.add(num);
 
     int totalCount = 0;
     int targetUniqueCount = uniqueElements.size();
     int start = 0;
     Map<Integer, Integer> freqMap = new HashMap<>();
 
     for (int end = 0; end < nums.length; end++) {
         freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);
 
         while (freqMap.size() == targetUniqueCount) {
             freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
             if (freqMap.get(nums[start]) == 0)
                 freqMap.remove(nums[start]);
             start++;
         }
 
         totalCount += start;
     }
 
     return totalCount;
 }
 
 
 }