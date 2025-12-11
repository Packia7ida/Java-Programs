package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class createLinkedList {
    Node head;

    public static void main(String args[]) {

        createLinkedList list = new createLinkedList();
        Node first = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);

        first.next = sec;
        sec.next = third;

        list.head = first;
        list.insertAtBeginning(5);
        list.insertAtEnd(40);
        list.insertAtIndex(15, 2);
        System.out.println("Search is "+list.search(12));
        list.deleteByValue(20);
        System.out.println("Count is "+ list.count());
        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtIndex(int data, int index) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    public void deleteByValue(int key){
        if(head == null) return;
        if(head.data == key){
            head =  head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data!=key){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
    }

    public int count(){
        if(head == null) return -1;
        int count = 0;
        Node temp =  head;
        while(temp!=null){
            count++;
            temp =  temp.next;
        }
        return count;
    }

    Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next =  current.next;
            current.next = prev;
            prev =  current;
            current = next;
        }
        return prev;
    }

}
