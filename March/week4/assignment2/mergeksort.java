class Solution {
	class ListNodeComparator implements Comparator<ListNode>{
		public int compare(ListNode s1, ListNode s2) {
			if (s1.val > s2.val)
				return 1;
			else if (s1.val < s2.val)
				return -1;
			return 0;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==0) return null;
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new ListNodeComparator());
		for(int i=0;i<lists.length;i++) if(lists[i]!=null) pq.add(lists[i]);
		ListNode head = null;
		ListNode tmp = null;
		while(!pq.isEmpty()){
			ListNode hehe = pq.poll();
			if(head==null){
				head = new ListNode(hehe.val);
				tmp = head;
				hehe = hehe.next;
			}else{
				tmp.next = new ListNode(hehe.val);
				hehe = hehe.next;
				tmp = tmp.next;
			}
			if(hehe!=null) pq.add(hehe);
		}

		return head;
	}
}
