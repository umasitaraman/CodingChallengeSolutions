import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {

    //Recursive Solution
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }


    //  Iterative Solution
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//
//        int depth = 1;
//
//        Deque<TreeNode> nodeStack = new ArrayDeque<>();
//        Deque<Integer> numStack = new ArrayDeque<>();
//
//        nodeStack.push(root);
//        numStack.push(depth);
//
//        while (!nodeStack.isEmpty()) {
//            TreeNode current = nodeStack.pop();
//            int level = numStack.pop();
//            depth = Math.max(depth, level);
//
//            if (current.left != null) {
//                nodeStack.push(current.left);
//                numStack.push(level + 1);
//            }
//
//            if (current.right != null) {
//                nodeStack.push(current.right);
//                numStack.push(level + 1);
//            }
//        }
//        return depth;
//    }
}
