class Solution {
    public int binaryGap(int n) {
        int lastIndex = -1;
        int currentIndex = 0;    
        int maxDistance = 0;    
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastIndex != -1) {
                    int distance = currentIndex - lastIndex;
                    maxDistance = Math.max(maxDistance, distance);
                }
                
                lastIndex = currentIndex;
            }
            currentIndex++;
            n = n >> 1;
        }
        
        return maxDistance;
    }
}
    