import java.util.Scanner;

public class MataKuliah11 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    public MataKuliah11() {

    }
    
    void tambahData(Scanner sc) {
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("sks         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("-----------------------------");
}

}
