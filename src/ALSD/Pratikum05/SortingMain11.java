package ALSD.Pratikum05;


public class SortingMain11 {
    public static void main(String[] args) {
        
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8 , 14};
        int c[] = {40, 10, 4, 9, 3};
        Sorting11 dataUrut1 = new Sorting11(a, a.length);
            System.out.println("Data awal 1 ");   
        dataUrut1.tampil();
        dataUrut1.bubleSort();
            System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC) ");
        dataUrut1.tampil();



        Sorting11 dataUrut2 = new Sorting11(b, b.length);
            System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
            System.out.println("Data sudah diurutkan dengan SELETION SORT (ASC)");
        dataUrut2.tampil();;    

        Sorting11 dataUrut3 = new Sorting11(c, c.length);
        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}
