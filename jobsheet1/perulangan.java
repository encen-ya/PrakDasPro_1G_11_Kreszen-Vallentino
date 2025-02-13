import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        sc.close();

        char angka1 = nim.charAt(nim.length() - 2);
        char angka2 = nim.charAt(nim.length() - 1);
        int n = (angka1 - '0') * 10 + (angka2 - '0'); 
        
        if (n < 10) {
            n += 10; 
        }
        
        String hasil = "";
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 1) {
                hasil += "* "; 
            } else {
                hasil += i + " "; 
            }
        }
        
        System.out.println(hasil);
    }
}
