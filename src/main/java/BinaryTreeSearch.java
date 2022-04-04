/**
 * The number of nodes in our perfect binary tree is always odd.
 * We know this because the first level always has 1 node, and the other levels always have an even number of nodes.
 * Adding a bunch of even numbers always gives us an even number, and adding 1 to that result always gives us an odd number.
 *
 * Taking half of an odd number gives us a fraction.
 * So if the last level had exactly half of our nn nodes, it would have to have a "half-node." But that's not a thing.
 *
 * Instead, it has the "rounded up" version of half of our odd nn nodes.
 * In other words, it has the exact half of the one-greater-and-thus-even number of nodes n+1. Hence {n+1}/{2}
 *
 * So our height (h) is roughly "the number of times we have to double 1 to get to {n+1}/{2}
 *  We can phrase this as a logarithm:
 *
 * h  ≈ log ({n+1}/{2})
 *
 * In big O notation the base is considered a constant. So folks usually don't include it.
 * People usually say O(log n), not O( log base{2} n )
 *
 */
public class BinaryTreeSearch {
    private Node root;
    class Node {
        Node left, right;
        int data;

        public Node (int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value <= data) {
                if(left ==null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean contains (int value) {
            if (value ==  data) {
                return true;
            } else if (value < data) {
                if (left ==null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInOrder();
            }
        }

        public void printPreOrder() {
            System.out.println(data);
            if (left != null) {
                left.printPreOrder();
            }
            if (right != null) {
                right.printPreOrder();
            }
        }

        public void printPostOrder() {
            if (left != null) {
                left.printPostOrder();
            }
            if (right != null) {
                right.printPostOrder();
            }
            System.out.println(data);
        }
    }
    public static void main(String[] args) {

    }

}
