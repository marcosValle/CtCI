//Implementation of a generic tree. There is no need of a Tree class, for each and every property/method of a tree can be found in it's subtrees and nodes, due to its recursive nature.

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T>{
    private List<GraphNode<T>> children = new ArrayList<GraphNode<T>>();
    private T data = null;
    private boolean visited;

    public GraphNode(T data){
        this.data = data;
    }

    public List<GraphNode<T>> getChildren(){
        return children;
    }

    public void setChild(GraphNode<T> children){
        this.children.add(children);
    }

    public T getData(){
        return data;
    }

    public void visit(GraphNode<T> n){
        System.out.print(n.getData()+ " ");
    }

    //We define 2 dfs traversal orders:
    //0: (preodrer) visit node then children
    //1: (postorder) visit every children recursively then the node
    //Note that for a generic tree, inorder traversal makes no sense. In a binary tree we would visit left, node and right. In a generic one, we could define child0, node, child1, child2, ... . This does not seem useful.
    public void dfs(GraphNode<T> root){
        if(root != null){
            root.visited = true;
            visit(root); 

            for(GraphNode<T> n : root.children){
                if(n.visited == false)
                    dfs(n);
            }
        }
    }
    
    public void bfs(GraphNode<T> root){
            
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
        GraphNode<Integer> root = new GraphNode<Integer>(50);
        GraphNode<Integer> c1 = new GraphNode<Integer>(100);
        GraphNode<Integer> c2= new GraphNode<Integer>(10);
        GraphNode<Integer> c3 = new GraphNode<Integer>(-5);
        GraphNode<Integer> c4 = new GraphNode<Integer>(0);
        GraphNode<Integer> c5 = new GraphNode<Integer>(33);
        GraphNode<Integer> c6 = new GraphNode<Integer>(1);
        GraphNode<Integer> c7 = new GraphNode<Integer>(2);
        GraphNode<Integer> c8 = new GraphNode<Integer>(3);

        root.setChild(c1);
        root.setChild(c2);
        c2.setChild(c3);
        c3.setChild(c4);
        c3.setChild(c5);
        c3.setChild(c6);
        c3.setChild(c7);
        c4.setChild(c8);
        c8.setChild(c5);
        c5.setChild(c4);
        
        root.dfs(root);
        System.out.println();
    }
}
