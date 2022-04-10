import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class prdandsuc {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        
        Node root = new Node(Integer.parseInt(ip[0]));
        
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
           
            Node currNode = queue.peek();
            queue.remove();
                
            
            String currVal = ip[i];
                
           
            if(!currVal.equals("N")) {
                    
              
                currNode.left = new Node(Integer.parseInt(currVal));
               
                queue.add(currNode.left);
            }
                

            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
 
            if(!currVal.equals("N")) {
 
                currNode.right = new Node(Integer.parseInt(currVal));

                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            Solution g = new Solution();
            Node rootA = g.binaryTreeToBST(root);
            printInorder(rootA);
            System.out.println();
            t--;
        }
    }
}



class Solution
{
    
    void inOrderTraversal(Node root,ArrayList<Integer> list){
        if(root==null) return;
        
        inOrderTraversal(root.left,list);
        list.add(root.data);
        inOrderTraversal(root.right,list);
    }
    
    Node solve(ArrayList inOrder, int n,int s,int e){
        if(s>e) return null;
        
        int mid=(s+e)/2;
        Node root=new Node((int)inOrder.get(mid));
        root.left=solve(inOrder,n,s,mid-1);
        root.right=solve(inOrder,n,mid+1,e);
        return root;
    }
    
    Node binaryTreeToBST(Node root)
    {
          ArrayList<Integer> list=new ArrayList<>();
          inOrderTraversal(root,list);
          Collections.sort(list);
          int n=list.size();
          Node ans=solve(list,n,0,n-1);
          return ans;
          
    }
}
