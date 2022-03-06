class SmallestMissing
{
    int findFirstMissing(int array[], int start, int end)
    {
        if (start > end)
            return end + 1;
 
        if (start != array[start])
            return start;
 
        int mid = (start + end) / 2;
 
        
        if (array[mid] == mid)
            return findFirstMissing(array, mid+1, end);
 
        return findFirstMissing(array, start, mid);
    }
 
    
    public static void main(String[] args)
    {
        SmallestMissing small = new SmallestMissing();
        int arr[] = {0, 1, 2, 6, 7, 8, 9, 10, 11};
        int n = arr.length;
        System.out.println("The smallest Missing element is : "
                + small.findFirstMissing(arr, 0, n - 1));
    }
}