class kthlargest {
    int[] nums;
    private void swap(int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    } 
    
    private int partition(int lo, int hi) {
        int p = lo + (hi - lo)/2;
        swap(p, hi);
        p = hi;
        
        int index = lo;
        
        for(int i = lo; i < hi; i++) {
            if(nums[i] >= nums[p]) {
                swap(i, index);
                index++;
            }
        }
        
        swap(index, p);
        return index;
    }
    
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        // Quick select put larger ones on the left when partitioning
        int l = 0;
        int r = nums.length-1;
        
        while(l <= r) {
            int p = partition(l, r);
            
            if(p == k-1) {
                return nums[p];
            } else if(p > k-1) {
                r = p-1;
            } else {
                l = p+1;
            }
        }
        
        return -1;
    }
}
