// Time Complexity : 0(n)
// Space Complexity : 0(n)

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            return new int[] {};
        }
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int popped = s.pop();
                result[popped] = i - popped;
            }
            s.push(i);
        }
        return result;
    }
}