public class Soal1 {

    public static void main(String[] args) {
        int gajiPokok = 2_000_000, thr = 0; 
        double pajak, pendapatanAwal = 0, pendapatanAsli;
        
        thr = gajiPokok + 55_000;
        pajak = 2_000_000 * 0.05;
        pendapatanAwal = gajiPokok - pajak;
        System.out.println(pendapatanAwal);
        pendapatanAsli = pendapatanAwal + thr;
        System.out.println(pendapatanAsli);
    
    }
}