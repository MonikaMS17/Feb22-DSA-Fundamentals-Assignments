import java.util.Scanner;
public class binarysearch
{
    public static int binarySearch(int[] ar, int item, int first, int last)
    {
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(ar[mid]==item) return mid;
            else if(ar[mid]>item) return binarySearch
            (ar,item,first,mid-1);
            else return binarySearch(ar,item,mid+1,last);
        }
        return -1;
    }
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemnts in array:");
        int n=sc.nextInt();
        int ar[]=new int[n];
       System.out.println("Enter array elements");
       for(int i=0;i<n;i++) ar[i]=sc.nextInt();
       System.out.println("Enter element to be searched");
       int item=sc.nextInt();
       int index=binarySearch(ar, item, 0, n-1);
       if(index==-1) System.out.println("Item not found");
       else System.out.println("Item found at index "+index);
    }
}
