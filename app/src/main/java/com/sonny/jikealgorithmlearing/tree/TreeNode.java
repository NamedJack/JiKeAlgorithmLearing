package com.sonny.jikealgorithmlearing.tree;

/**
 * 树是特殊的图
 * 二叉树  又是特殊的树
 * 二叉树只包含两个子节点（左节点、右节点）
 *
 * 复杂度 由 树的 ab 决定
 *
 * a.状态数空间
 *
 * b.决策树的空间(decision tree)
 *
 *
 */

/**
 * 树的定义
 *
 * 1.树的遍历
 * a。前序遍历  ： 根->左->右
 * b。中序遍历  ： 左->根->右  （二叉搜索树的中序排列是升序排列）
 * c。后序遍历  ： 左->右->根
 *
 */

/**
 * 二叉搜索树
 * 定义：有序二叉树 、排序二叉树 指空树或者具有 ab性质的二叉树
 * a.左子树上  所有结点 的值均小于它的根结点的值
 * b.右子树上  所有结点 的值均大于它的根结点的值
 *  以此类推：左、右子树也分别为二叉查找树(重复性！！！)
 *
 */
public class TreeNode {
    public int val;
    public TreeNode left,right;
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

/**
 * 二叉树常见的操作
 *                     时间复杂度
 * 1.查询               logn
 *
 * 2.插入新结点()        logn
 *
 * 3.删除               logn
 */