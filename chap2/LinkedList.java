//This class implements a singly linked list.
public class LinkedList{
    Node head = new Node(null);

    public LinkedList(int d){
        Node first = new Node(d);
        head.next = first;
    }

    public void appendToTail(int d){
        Node last = new Node(d);
        Node n = head;

        while(n.next != null){
            n = n.next;
        }

        n.next = last;
    }

    public Node deleteNode(int d){
        Node n = this.head;
        while(n.next != null){
            if(n.next.data == d){
                Node deleted = n.next;
                n.next = n.next.next;
                return deleted;
            }
            n = n.next;
        }
        return head;
    }

    @Override
    public String toString(){
        Node n = head;
        String res = "";

        while(n.next != null){
            res += " " + n.data;
            n = n.next;
        }
        return res;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList(10);
        System.out.println(ll.toString());
        ll.appendToTail(20);
        ll.appendToTail(30);
        ll.appendToTail(60);
        ll.appendToTail(10);
        System.out.println(ll.toString());
        ll.deleteNode(20);
        System.out.println(ll.toString());
        ll.deleteNode(60);
        System.out.println(ll.toString());
        ll.deleteNode(10);
        System.out.println(ll.toString());
        ll.deleteNode(-1);
        System.out.println(ll.toString());
        ll.deleteNode('a');
        System.out.println(ll.toString());
    }
}
