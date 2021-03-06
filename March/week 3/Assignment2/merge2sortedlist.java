class merge2sortedlist {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp=new ListNode();
        ListNode dd=temp;
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dd.next=new ListNode(list1.val);
                list1=list1.next;
            }else{
                dd.next=new ListNode(list2.val);
                list2=list2.next;
            }
            dd=dd.next;
        }
        while(list1!=null){
            dd.next=new ListNode(list1.val);
            dd=dd.next;
            list1=list1.next;
        }
        while(list2!=null){
            dd.next=new ListNode(list2.val);
            dd=dd.next;
            list2=list2.next;
        }
        
        return temp.next;
    }
}
