package ALSD.TugasPertemuan13;

public class Node {
    public Node prev;
    public Pasien psn;
    public Node next;

    public Node(Node prev, Pasien psn, Node next) {
        this.prev = prev;
        this.psn = psn;
        this.next = next;
    }
}
