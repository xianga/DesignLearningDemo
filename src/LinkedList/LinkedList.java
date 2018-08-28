package LinkedList;

public class LinkedList {

    private Node head;
    public LinkedList(){
        head = null;
    }
    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = node;
        }
    }

    public void show(){
        Node p = head;
        while(p != null){
            System.out.print(p.val+",");
            p = p.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node last = head;
        Node p = head.next;
        head.next = null;
        while(p != null){
            Node t = p.next;
            p.next = last;
            last.pre = p;
            last = p;
            p = t;
        }
        head = last;
        show();

    }


    private class Node{
        int val;
        Node pre;
        Node next;

        private Node(int value){
            this.val = value;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.show();
        list.reverse();

    }
}
