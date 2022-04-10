class Solution {
private HashMap<Integer, Integer> map = new HashMap<>();

private void levelSum(TreeNode node, int level){
    if(node == null) return;
    
    if(map.containsKey(level)){
        map.put(level, map.get(level)+node.val);
    }else{
        map.put(level, node.val);
    }
    
    levelSum(node.left, level+1);
    levelSum(node.right, level+1);
    
}

public int maxLevelSum(TreeNode root) {
    levelSum(root, 0);
    int max = Integer.MIN_VALUE;
    int res = -1;
    
    for(int i : map.keySet()){
        if(map.get(i) > max){
            res = i;
            max = map.get(i);
        }
    }
    
    return res + 1;
 }
}
