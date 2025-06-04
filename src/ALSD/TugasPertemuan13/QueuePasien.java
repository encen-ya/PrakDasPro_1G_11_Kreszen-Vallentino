package ALSD.TugasPertemuan13;

public class QueuePasien {
    Node11 front, rear;
    int size;

    public QueuePasien() {
        front = rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }

   public void enqueue(Pasien psn) {
    Node11 node = new Node11(null, psn, null);

    if (isEmpty()) {
        front = rear = node;
    } else {
        rear.next = node;
        node.prev = rear;
        rear = node;
    }

    size++;
}

    public void dequeue() throws Exception {
    if (isEmpty()) {
        throw new Exception("Antrian masih kosong");
    }
    System.out.println(front.psn.nama + " telah selesai divaksinasi");
    front = front.next;

    if (front == null) {
        rear = null;
    } else {
        front.prev = null;
    }

    size--;
}

    public void printQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada Antrian");
        } else {
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            Node11 tmp = front;
            while (tmp != null) {
                tmp.psn.print();
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian " + size);
        }
    }
}
