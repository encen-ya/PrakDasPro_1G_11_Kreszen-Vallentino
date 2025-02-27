import java.util.Scanner;

public class fungsi {
    
    static int[][] stockBunga = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
    public static void PendapatanCabang() {
        System.out.println("Pendapatan per Cabang jika Semua Bunga Terjual:");
        System.out.println("");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    public static void Cabang4(){
        int pengurangan = stockBunga[3][0] - 1;
        int pengurangan1 = stockBunga[3][1] - 2;
        int pengurangan2 = stockBunga[3][3] - 5;
        System.out.println("Pengurangan stock cabang 4");
        System.out.println("Aglonema = " + pengurangan + " Keladi = " + pengurangan1 + " Mawar = " + pengurangan2 );
    }
    public static void main(String[] args) {
        PendapatanCabang();
        System.out.println("==========================");
        Cabang4();
    }
}