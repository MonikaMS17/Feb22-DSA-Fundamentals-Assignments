class findminandmax{
 
   
    public static int findMinRec(int A[], int n)
    {
      
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinRec(A, n-1));
    }
     
    
    public static void main(String args[])
    {
        int A[] = {1, -1, 0, 2, -2, 3, -3, 4, -4};
        int n = A.length;
         
        
        System.out.println(findMinRec(A, n));
    }
}
