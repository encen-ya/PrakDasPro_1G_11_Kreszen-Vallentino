package BruteForceDivideConquer.minggu5;

public class nilaiMahasiswaMain11 {
    public static void main(String[] args) {
        nilaiMahasiswa11 n = new nilaiMahasiswa11();
        int nilaiUTS[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int nilaiUAS[] = {82,88,87,79,95,85,83,84};
        int maxUTS = n.nilaiTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi adalah: " + maxUTS);
        int minUTS = n.niliaTerendah(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah adalah: " + minUTS);
        double rataRataUas = n.rataUAS(nilaiUAS);
        System.out.println("Nilai Rata-rata UAS: " + rataRataUas);
    }
}

