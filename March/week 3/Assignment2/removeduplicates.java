class removeduplicates {
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode current = head;
        
        if(current ==null || current.next == null)
            return head;
        
        while(current.next != null)
        {
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        
        return head;
        
    }
}
