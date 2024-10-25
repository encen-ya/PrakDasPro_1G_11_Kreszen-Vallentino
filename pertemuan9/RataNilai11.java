import java.util.Scanner;
public class RataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            float totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa Ke " + i);
            for (int j = 1; j <= 5 ; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }   
            float rataNilai = totalNilai / 5;
            i++;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        }
    }
}
