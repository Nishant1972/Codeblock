class Solution {
    int maxArea(int[] heights) {
        int ans = 0, i = 0, j = heights.size() - 1;
        while(i < j){
            int width = j - i, height = min(heights[i], heights[j]);
            ans = max(ans, width * height);
            
            if(heights[i] < heights[j]) i += 1;
            else j += -1;
        } return ans;
    }
}
