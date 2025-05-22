package ALSD.TugasPertemuan13;

public class DoubleLinkedList {
    Node head, tail;

    public void addFirst(Film film) {
        Node newNode = new Node(film);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Film film) {
        Node newNode = new Node(film);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(Film film, int index) {
        if (index == 0) {
            addFirst(film);
            return;
        }
        Node newNode = new Node(film);
        Node current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null || current.next == null) {
            addLast(film);
        } else {
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void removeFirst() {
        if (head != null) {
            if (head == tail) head = tail = null;
            else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void removeLast() {
        if (tail != null) {
            if (head == tail) head = tail = null;
            else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current != null) {
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void search(int id) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Data Id Film: " + id + " berada di node ke- " + (index + 1));
                System.out.println("IDENTITAS:\n" + current.data);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data tidak ditemukan.");
    }

    public void sortingDesc() {
        if (head == null || head.next == null) return;
        Node i = head;
        while (i != null) {
            Node j = i.next;
            while (j != null) {
                if (i.data.rating < j.data.rating) {
                    Film temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
}

