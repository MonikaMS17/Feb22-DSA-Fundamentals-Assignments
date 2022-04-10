class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>num ){
            maxHeap.offer(num);
        }
        else{
            minHeap.offer(num);
        }
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        if(minHeap.size()>maxHeap.size()+1){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            double a = (maxHeap.peek()+minHeap.peek()) * 0.5;
            return a;
        }
        else if(maxHeap.size()>minHeap.size()){
            return (double)maxHeap.peek();
        } 
        return (double)minHeap.peek();
    }
}
