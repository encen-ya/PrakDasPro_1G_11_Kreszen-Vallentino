public class Kafe11 {
    public static void menu(String namaPelanggan, Boolean isMember, String KodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if (KodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Diskon 50%");
       } else if (KodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Diskon 30%");
       }
            System.out.println("===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System.out.println("===========================");
            System.out.println("Silahakan Pilih Menu Yang Anda inginkan");
    }
    public static void main(String[] args) {
        menu("Andi", true, "Diskon50");
    }
}