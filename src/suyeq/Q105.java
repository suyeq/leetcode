package suyeq;

import sun.reflect.generics.tree.Tree;

/**
 * @author: 苍术
 * @date: 2019-07-09
 * @time: 14:43
 */
public class Q105 {

    /**
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     */

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void preOrder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        System.out.println(treeNode.val);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    public static void main(String []args){
        int []preOrder={1,2};
        int []inOrder={2,1};
        preOrder(buildTree(preOrder,inOrder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length ==1 && preorder[0] !=inorder[0]){
            return null;
        }
        if(preorder == null || preorder.length == 0){
            return null;
        }
        TreeNode treeNode=treeConstuctor(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return treeNode;
    }

    public static TreeNode treeConstuctor(int [] preorder,int preStart,int preEnd,
                                          int [] inorder,int inStart,int inEnd){
        TreeNode root=new TreeNode(preorder[preStart]);
        root.left=root.right=null;
        if (preStart == preEnd){
            return root;
        }
        int inSeparator=0;
        int preLength=0;
        for (int i=inStart;i<=inEnd;i++){
            preLength++;
            if (preorder[preStart] == inorder[i]){
                inSeparator=i;
                break;
            }
        }
        if (preStart+1 <= preEnd && inSeparator-1>=inStart){
            root.left=treeConstuctor(preorder,preStart+1,preStart+preLength-1,inorder,inStart,inSeparator-1);
        }
        if (preStart+preLength <= preEnd && inSeparator+1<=inEnd){
            root.right=treeConstuctor(preorder,preStart+preLength,preEnd,inorder,inSeparator+1,inEnd);
        }
        return root;
    }
}
