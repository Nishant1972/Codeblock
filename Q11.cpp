class Solution {
    int maxArea(int[] h) {
        int ans = 0, i = 0, j = h.size() - 1;
        while(i < j){
            int width = j - i, height = min(h[i], h[j]);
            ans = max(ans, width * h);
            
            if(h[i] < h[j]) i += 1;
            else j += -1;
        }
        
        return ans;
    }
}
