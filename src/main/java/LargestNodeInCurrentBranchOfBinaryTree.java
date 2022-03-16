import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class LargestNodeInCurrentBranchOfBinaryTree {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largestValueList = new ArrayList<>();
        largestValue(root, largestValueList, 0);
        return largestValueList;
    }


    public void largestValue(TreeNode root, List<Integer> largestValueList, int level) {

        if(root == null) {
            return;
        }
        if (largestValueList.size() == level) {
            largestValueList.add(root.val);
        } else {
            largestValueList.set(level, Math.max(largestValueList.get(level), root.val));
        }
        largestValue(root.right, largestValueList, level + 1);
        largestValue(root.left, largestValueList, level + 1);

    }

    public static void main(String[] args) {
        LargestNodeInCurrentBranchOfBinaryTree s = new LargestNodeInCurrentBranchOfBinaryTree();
        TreeNode secondLeft = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        TreeNode secondRight = new TreeNode(2, null, new TreeNode(9));
        TreeNode root = new TreeNode(1,secondLeft,secondRight);
        System.out.println(s.largestValues(root));
    }
}