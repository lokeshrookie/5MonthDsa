package implementations;

public class LinkedListImp {
    private int size;
    private Node head;




    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int delete(int val){

        Node temp = head;
        if(head.val == val){
             deleteFirst();
        }
        while(temp != null){
            if(temp.val == val){
                temp.val = temp.next.val;
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return val;
    }

    public int  deleteFirst(){
        Node temp = head;
        if(size == 0){
             return  0;
        }
        int val = head.val;
        head = head.next;
        return  val;


    }

    public int deleteLast(){
        if(head == null){
            return 0;
        }
        if(size == 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = null;
        return val;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        // 1. create node
        // connect previous node
        // connect next node to current
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;


        // curr = temp;

        //next = temp.next


    }

    public void insertFirst(int val){
        // for empty linkedlist.
        Node node = new Node(val);
        if(size == 0){
            head = node;
            head.next = null;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
        // if list is not empty
    }
    public void insertLast(int val){
        if(size == 0 || head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;

    }


    public class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

class Test{
    public static void main(String[] args) {
        LinkedListImp ll = new LinkedListImp();
        ll.insertLast(5);
        ll.insertFirst(1);
        ll.insertLast(6);
        ll.display();
        System.out.println(ll.delete(6)  + " deleted");
        ll.display();
        System.out.println();
        ll.display();

    }
}
