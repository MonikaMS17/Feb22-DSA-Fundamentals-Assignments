class Slidindwindow {
public int[] maxSlidingWindow(int[] arr, int k) {

    int n=arr.length;
    
     int res[]=new int[n-k+1];
    
    ArrayDeque<Integer> ad=new ArrayDeque();
    
    int i=0, j=0, idx=0;

    
    while(j<n){
 
        if(ad.isEmpty()) ad.offerFirst(arr[j]);
        
        else if(ad.getFirst()>=arr[j]){
            while(ad.size()>0 && ad.getLast()<arr[j]){  
              ad.pollLast();
            }
            ad.offerLast(arr[j]);
        }
        
        else{
            while(ad.size()>0 && ad.getFirst()<=arr[j]){
                ad.pollFirst();
            }
            
            ad.offerFirst(arr[j]);
            
        }

        if(j-i+1 < k) j++;

        else {
  
            res[idx++]=ad.getFirst();
 
            if(ad.getFirst()==arr[i]) ad.pollFirst();
            
            i++;
            j++;
            
        }
        
    }
    
    return res;
}
}
