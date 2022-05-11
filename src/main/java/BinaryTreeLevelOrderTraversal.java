import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        if(root != null) nodeQueue.add(root);

        while(!nodeQueue.isEmpty()) {
            int qLength = nodeQueue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qLength; i++) {
                TreeNode node = nodeQueue.poll();
                if(node != null) {
                    level.add(node.val);
                    if (node.left != null) nodeQueue.add(node.left);
                    if (node.right != null) nodeQueue.add(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }
        return result;
    }
}
