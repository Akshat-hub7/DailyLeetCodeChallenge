class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] res = new int[nums.length];

        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i =0 ;i < nums.length;i++){

            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                res[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        for(int i =0 ;i < nums.length;i++){

            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                res[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        return res;

    }
}