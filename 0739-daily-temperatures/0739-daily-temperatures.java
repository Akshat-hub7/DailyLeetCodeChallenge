class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] res = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ;i < temperatures.length ;i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > temperatures[stack.peek()]){
                int idx = stack.pop();

                res[idx] = i - idx;
            }
            
            stack.push(i);
        }

        return res;

    }
}