package ALSD.TugasJobsheet10;

public class Mahasiswa {
        String nama;
        String nim;
    
        public Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }
    
        String print() {
            return "Nama: " + nama + ", NIM: " + nim;
        }
    
    
}
