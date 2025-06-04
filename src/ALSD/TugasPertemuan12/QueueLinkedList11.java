package ALSD.TugasPertemuan12;

public class QueueLinkedList11 {
    Node11 front, rear;
    int size;

    public QueueLinkedList11() {
        front = rear = null;
        size = 0;
    }
    public int size() {
    return size;
}

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa11 mhs) {
        Node11 node = new Node11(mhs);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Memanggil antrian:");
            front.data.print();
            front = front.next;
            size--;
            if (front == null) 
            {rear = null;}
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa paling depan: ");
            front.data.print();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa paling akhir: ");
            rear.data.print();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
        } else {
            System.out.println("Daftar antrian mahasiswa:");
            Node11 tmp = front;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public int getSize() {
        return size;
    }
}
