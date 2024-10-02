/**
 * Kafe11
 */

import java.util.Scanner;

public class Kafe11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan = true;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga;
        float diskon = 10 / 100f;
        

        System.out.print("Masukkan keanggotaan member (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        // byte totalByte = (byte) totalHarga;
        
        System.out.println("Total Harga Rp " + totalHarga);

        double nominalBayarMember = totalHarga - (diskon * totalHarga ); 
        double nominalBayarNonMember = totalHarga;
        int nominalIntMember = (int) nominalBayarMember;
        int nominalInt = (int) nominalBayarNonMember;
        
        if (keanggotaan) {
            System.out.println("Nominal bayar: " + nominalIntMember);
        } else {
            System.out.println("Nominal bayar: " + nominalInt);
        }

        //System.out.println("Keanggotaan pelanggan " + keanggotaan);
        // System.out.println("Item pembelian " + jmlKopi + " kopi " + jmlTeh + " teh " + jmlRoti + " roti ");
        // System.out.println("Nominal bayar Rp " + nominalIntMember);
    }

}