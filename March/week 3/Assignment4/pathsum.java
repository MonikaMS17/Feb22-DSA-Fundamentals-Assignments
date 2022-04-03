class pathsum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum ,0);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;
        boolean result = hasPathSum(root.left, targetSum, sum + root.val);
        result = result || hasPathSum(root.right, targetSum, sum + root.val);
        if (result || (root.left == null && root.right == null && sum + root.val == targetSum)) return true;
        return false;
    }
}
