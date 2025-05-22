package ALSD.TugasPertemuan13;

public class Node {
    Film data;
    Node prev;
    Node next;

    public Node(Film data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
