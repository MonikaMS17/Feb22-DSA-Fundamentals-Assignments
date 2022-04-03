class sllsearch {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);

        int element = 4;

        int ans = -1;

        for (int i = 0; i < ll.size(); i++) {
 
            int llElement = ll.get(i);

            if (llElement == element) {

                ans = i;
                break;
            }
        }

        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                "Element found in Linked List at " + ans);
        }
    }
}
