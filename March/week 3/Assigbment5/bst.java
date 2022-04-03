public class Solution {
	public TreeNode canMerge(List<TreeNode> trees) {
        final int size = trees.size();
        final Map<Integer, TreeNode> roots = new HashMap<>(size);
        for (final TreeNode node : trees) {
            roots.put(node.val, node);
        }
        for (final TreeNode node : trees) {
            if (roots.containsKey(node.val)) {
                final TreeNode root = buildTree(roots, node);
                roots.put(root.val, root);
            }
        }
        if (roots.size() != 1) return null;
        final TreeNode root = roots.values().iterator().next();
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE) ? root : null;
    }

    private TreeNode buildTree(Map<Integer, TreeNode> roots, TreeNode node) {
        final TreeNode next = roots.remove(node.val);
        if (next != null) {
            if (next.left != null) node.left = buildTree(roots, next.left);
            if (next.right != null) node.right = buildTree(roots, next.right);
        }
        return node;
    }

    private boolean isValid(TreeNode node, int min, int max) {
        if (node == null) return true;
        final int value = node.val;
        if (value <= min || max <= value) return false;
        return isValid(node.left, min, value) && isValid(node.right, value, max);
    }
}
