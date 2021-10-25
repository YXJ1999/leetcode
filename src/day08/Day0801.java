package day08;

import java.util.LinkedList;
import java.util.Queue;

/*
给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。

示例 1:

输入:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
输出:
合并后的树:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
注意: 合并必须从两个树的根节点开始。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-two-binary-trees
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Day0801 {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null){
//            return root2;
//        }
//        if (root2 ==null){
//            return root1;
//        }
//        TreeNode treeNode=new TreeNode(root1.val+ root2.val);
//        treeNode.left=mergeTrees(root1.left,root2.left);
//        treeNode.right=mergeTrees(root1.right,root2.right);
//        return treeNode;
//    }
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            TreeNode node = new TreeNode();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
            Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
            queue.offer(node);
            queue1.offer(t1);
            queue2.offer(t2);
            while (queue1.isEmpty() && queue2.isEmpty()) {
                TreeNode root = queue.poll(), root1 = queue1.poll(), root2 = queue2.poll();
                TreeNode left1 = root1.left, right1 = root1.right, left2 = root2.left, right2 = root2.right;
                if (left1 != null || left2 != null) {
                    if (left1 != null && left2 != null) {
                        TreeNode left = new TreeNode(left1.val + left2.val);
                        queue.offer(left);
                        queue1.offer(left1);
                        queue2.offer(left2);
                    }
                    if (left1 == null) {
                        root.left = left1;
                    }
                    if (left2 == null) {
                        root.left = left2;
                    }
                }
                if (right1 != null || right2 != null) {
                    if (right1 != null && right2 != null) {
                        TreeNode right = new TreeNode(right1.val + right2.val);
                        queue.offer(right);
                        queue1.offer(right1);
                        queue2.offer(right2);
                    }
                    if (left1 == null) {
                        root.right = right1;
                    }
                    if (left2 == null) {
                        root.right = right2;
                    }
                }
            }
            return node;
        }
        /*
         public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue.offer(merged);
        queue1.offer(t1);
        queue2.offer(t2);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node = queue.poll(), node1 = queue1.poll(), node2 = queue2.poll();
            TreeNode left1 = node1.left, left2 = node2.left, right1 = node1.right, right2 = node2.right;
            if (left1 != null || left2 != null) {
                if (left1 != null && left2 != null) {
                    TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    queue.offer(left);
                    queue1.offer(left1);
                    queue2.offer(left2);
                } else if (left1 != null) {
                    node.left = left1;
                } else if (left2 != null) {
                    node.left = left2;
                }
            }
            if (right1 != null || right2 != null) {
                if (right1 != null && right2 != null) {
                    TreeNode right = new TreeNode(right1.val + right2.val);
                    node.right = right;
                    queue.offer(right);
                    queue1.offer(right1);
                    queue2.offer(right2);
                } else if (right1 != null) {
                    node.right = right1;
                } else {
                    node.right = right2;
                }
            }
        }
        return merged;
    }

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/merge-two-binary-trees/solution/he-bing-er-cha-shu-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
}
