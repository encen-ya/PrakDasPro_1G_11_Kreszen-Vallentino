public class P9_Tugas1_Persegi3 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 3; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 3) {
                    System.out.print("3 ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}
