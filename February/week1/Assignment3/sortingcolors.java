class Solution {
    public void sortColors(int[] arr) {
    int a=0,b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                a++;
            }
            else if(arr[i]==1) {
                b++;
            }
        }
        //for 0
        for(int i=0;i<a;i++)
        {
            arr[i] = 0;
        }
		//for 1
        for (int i = a; i < a+b; i++) {
            arr[i] =1;
        }
		//for 2
        for (int i = a+b; i < arr.length; i++) {
            arr[i] = 2;
        }
    }
}
