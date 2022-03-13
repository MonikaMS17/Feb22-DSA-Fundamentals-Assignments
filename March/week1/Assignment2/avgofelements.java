import java.util.Scanner;

public class Main 
{
     
        static double avgCalcRec(int a[], int i, int n)
    {
       
        if (i == n-1)
            return a[i];
      
        
        if (i == 0)
            return ((a[i] + avgCalcRec(a, i+1, n))/n);
      
        return (a[i] + avgCalcRec(a, i+1, n));
    }
      
        static double averageCalculate(int a[], int n)
    {
         return avgCalcRec(a, 0, n);
    }
     
     
    
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n;  
        System.out.println("Enter the total number of elements in the array ");
        n=sc.nextInt();  
        
        int arr[] = new int[n];    
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)      
        {
            arr[i]=sc.nextInt();
        }
        
        double avg=averageCalculate(arr, n);     
        System.out.println("The average of all the elements in an array is "+avg);

       
    }
}
