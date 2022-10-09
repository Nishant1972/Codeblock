class Solution {
    public int maxArea(int[] heights) {
        int ans = 0, i = 0, j = heights.length - 1;
        while(i < j){
            int width = j - i, height = Math.min(heights[i], heights[j]);
            ans = Math.max(ans, width * height);
            
            if(heights[i] < heights[j]) i += 1;
            else j += -1;
        } return ans;
    }
}
