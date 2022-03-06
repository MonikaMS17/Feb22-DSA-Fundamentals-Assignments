class BinarySearch {
    
    int binarySearch(int arr[], int l, int r, int key)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            
            if (arr[mid] == key)
                return mid;
  
            
            if (arr[mid] > key)
                return binarySearch(arr, l, mid - 1, key);
  
            
            return binarySearch(arr, mid + 1, r, key);
        }
  
        
        return -1;
    }
  
    
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6 };
        int n = arr.length;
        int key = 5;
        int result = ob.binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}