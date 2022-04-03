class kthlevelcode{
 
  static class Node {
    int data;
    Node left, right;
  };
 
  static void printNodes(Node root, int level, int K)
  {
    if (root == null) {
      return;
    }

    printNodes(root.left, level + 1, K);

    printNodes(root.right, level + 1, K);

    if (K == level) {
      System.out.print(root.data+ " ");
    }
  }

  static Node newNode(int data)
  {
    Node temp = new Node();
    temp.data = data;
    temp.left = temp.right = null;
    return temp;
  }

  public static void main(String[] args)
  {
    Node root = newNode(3);
    root.left = newNode(9);
    root.right = newNode(6);
    root.left.left = newNode(11);
    int K = 2;
 
    printNodes(root, 1, K);
  }
}
