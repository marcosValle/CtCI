//This class is not a linkedList! What about the head? It should be fixed, so it is always a reference to the list.
public class Node{
    Integer data;
    Node next = null;

    public Node(Integer d){
        this.data = d;
    }
}
