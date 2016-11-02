//Implementation of a generic tree. There is no need of a Tree class, for each and every property/method of a tree can be found in it's subtrees and nodes, due to its recursive nature.

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T>{
    private List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();
    private T data = null;

    public TreeNode(T data){
        this.data = data;
    }

    public List<TreeNode<T>> getChildren(){
        return children;
    }

    public void setChild(TreeNode<T> children){
        this.children.add(children);
    }

    public T getData(){
        return data;
    }

    public void visit(TreeNode<T> n){
        System.out.print(n.getData()+ " ");
    }

    //We define 2 dfs traversal orders:
    //0: (preodrer) visit node then children
    //1: (postorder) visit every children recursively then the node
    //Note that for a generic tree, inorder traversal makes no sense. In a binary tree we would visit left, node and right. In a generic one, we could define child0, node, child1, child2, ... . This does not seem useful.
    public void dfs(TreeNode<T> root, int order){
        if(root != null){
            if(order==0){
               visit(root); //preorder
            }

            for(TreeNode<T> n : root.children){
                dfs(n, order);
            }

            if(order==1){
               visit(root); //postorder
            }
        }
    }
    
    public void bfs(TreeNode<T> root){
            
    }

    public boolean checkBalanced(){
        return false; 
    }

    public boolean checkBinary(){
        return false;
    }

    public Integer getHeight(){
        return null;
    }

    public T getMax(){
        return null;
    }

    public T getMin(){
        return null; 
    }

    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<Integer>(50);
        TreeNode<Integer> c1 = new TreeNode<Integer>(100);
        TreeNode<Integer> c2= new TreeNode<Integer>(10);
        TreeNode<Integer> c3 = new TreeNode<Integer>(-5);
        TreeNode<Integer> c4 = new TreeNode<Integer>(0);
        TreeNode<Integer> c5 = new TreeNode<Integer>(33);
        TreeNode<Integer> c6 = new TreeNode<Integer>(1);
        TreeNode<Integer> c7 = new TreeNode<Integer>(2);
        TreeNode<Integer> c8 = new TreeNode<Integer>(3);

        root.setChild(c1);
        root.setChild(c2);
        c2.setChild(c3);
        c3.setChild(c4);
        c3.setChild(c5);
        c3.setChild(c6);
        c3.setChild(c7);
        c4.setChild(c8);
        
        System.out.print("Pre order: \n");
        root.dfs(root, 0);
        System.out.print("\nPost order: \n");
        root.dfs(root, 1);
        System.out.println();
    }
}
