/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        int ans = -1; // Variable to store the latest known bad version
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            if (isBadVersion(mid)) {
                ans = mid;   // Record this potential answer
                r = mid - 1; // Move left to see if there is an even earlier bad version
            } else {
                l = mid + 1; // Move right because this version is good
            } 
        }
        
        return ans;
    }
}
