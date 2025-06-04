package ALSD.TugasPertemuan13;

public class Node11 {
    public Node11 prev;
    public Pasien psn;
    public Node11 next;

    public Node11(Node11 prev, Pasien psn, Node11 next) {
        this.prev = prev;
        this.psn = psn;
        this.next = next;
    }
}
