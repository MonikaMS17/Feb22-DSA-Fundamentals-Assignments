class Solution{
 public:
   void inorder(Node* root,vector<int>&v){
       if(root==NULL){
           return;
       }
       inorder(root->left,v);
       v.push_back(root->data);
       inorder(root->right,v);
   }
   Node* inorderbst(Node *root1,vector<int>v,int s,int e){
       if(s>e){
           return NULL;
       }
       int mid=(s+e)/2;
       root1=new Node(v[mid]);
       root1->left=inorderbst(root1->left,v,s,mid-1);
       root1->right=inorderbst(root1->right,v,mid+1,e);
       return root1;
       
   }
   Node *binaryTreeToBST (Node *root)
   { 
       vector<int>v;
       inorder(root,v);
       sort(v.begin(),v.end());
       Node* root1=NULL;
       int s=0;
       int e=v.size()-1;
       return inorderbst(root1,v,s,e);
       
       
   }
};
