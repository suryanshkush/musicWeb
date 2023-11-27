public class Linkeslist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addnodefirst(int data){
        Node node1=new Node(data);
        if(head==null){
            head=tail=node1;
            return;
        }
        node1.next=head;
        head=node1;
    }
    public static void main (String args[]){
        Linkeslist ll=new Linkeslist();
        ll.addnodefirst(5);
        ll.addnodefirst(6);
        ll.addnodefirst(9);
    }
}
