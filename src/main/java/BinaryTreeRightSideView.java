import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        if(root != null) nodeQueue.add(root);

        while(!nodeQueue.isEmpty()) {
            TreeNode rightSide = new TreeNode();
            int qLength = nodeQueue.size();
            for (int i = 0; i < qLength; i++) {
                TreeNode node = nodeQueue.poll();
                if(node != null) {
                    rightSide = node;
                    if (node.left != null) nodeQueue.add(node.left);
                    if (node.right != null) nodeQueue.add(node.right);
                }
            }
            result.add(rightSide.val);
            System.out.println(nodeQueue.toString());
        }
        return result;
    }
}
