public class insertionof2sll {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode cur1 = h1;
        int s1 = 0;
        while (cur1 != null) {
          s1++;
          cur1 = cur1.next;
        }
        ListNode cur2 = h2;
        int s2 = 0;
        while (cur2 != null) {
          s2++;
          cur2 = cur2.next;
        }
        if (s1 > s2) {
          int d = s1 - s2;
          while (d > 0) {
            h1 = h1.next;
            d--;
          }
        } else {
          int d = s2 - s1;
          while (d > 0) {
            h2 = h2.next;
            d--;
          }
        }
        while (h1 != null) {
          if (h1 == h2) {
            return h1;
          }
          h1 = h1.next;
          h2 = h2.next;
        }
        return null;
    }
}
