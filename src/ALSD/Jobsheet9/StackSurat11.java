package ALSD.Jobsheet9;

public class StackSurat11 {
    Surat11[] stack;
    int top;
    int size;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat11 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil ditambahkan.");
        } else {
            System.out.println("Stack surat izin penuh!");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 surat = stack[top];
            top--;
            System.out.println("Memproses surat izin dari " + surat.namaMahasiswa + "...");
            return surat;
        } else {
            System.out.println("Tidak ada surat izin untuk diproses.");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            System.out.println("Surat izin teratas adalah dari " + stack[top].namaMahasiswa);
            return stack[top];
        } else {
            System.out.println("Belum ada surat izin yang masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) { 
                System.out.println("Surat izin ditemukan untuk mahasiswa: " + stack[i].namaMahasiswa);
                stack[i].printSurat();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada surat izin ditemukan untuk mahasiswa dengan nama: " + namaMahasiswa);
        }
    }
}