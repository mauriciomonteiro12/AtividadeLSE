package ListaSimplesmenteEncadeada;

public class SLinkedList {
    private Node head;
    private Node tail;

    public SLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addHead(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(String data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() throws EmptySLinkedList {
        if (head == null) {
            throw new EmptySLinkedList("A lista está vazia.");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}